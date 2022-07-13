package com.example.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import com.example.domain.Item;

/**
 * アイテムテーブルを操作します.
 * 
 * @author isodakeisuke
 *
 */
@Repository
public class ItemRepository {
	
	/**
	 * Itemオブジェクトを作成するローマッパー
	 */
	private static final RowMapper<Item> ITEM_ROW_MAPPER = (rs, i) -> {
		Item item = new Item();
		item.setId(rs.getInt("id"));
		item.setName(rs.getString("name"));
		item.setDescription(rs.getString("description"));
		item.setPrice(rs.getInt("price"));
		item.setImagePath(rs.getString("image_path"));
		item.setDeleted(rs.getBoolean("deleted"));
		return item;
	};
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	/**
	 * 商品一覧を返します.
	 * 
	 * @return 商品一覧情報（価格の安い順、id順で並び替え）
	 */
	public List<Item> findAll() {
		String sql = "select id, name, description, price, image_path, deleted from items order by price, id";
		List<Item> itemList = template.query(sql, ITEM_ROW_MAPPER);
		return itemList;
	}
	
	/**
	 * 商品をidで検索します.
	 * 検索結果がなかった場合はエラーを吐く
	 * 
	 * @param id 商品id
	 * @return 検索された商品情報
	 * @throws RuntimeException 
	 */
	public Item findById(Integer itemId) throws RuntimeException {
		String sql = "select id, name, description, price, image_path, deleted from items where id = :id";
		SqlParameterSource param = new MapSqlParameterSource().addValue("id", itemId);
		Item item = template.queryForObject(sql, param, ITEM_ROW_MAPPER);
		if(item == null) {
			throw new RuntimeException("商品検索に失敗しました。");
		}
		return item;
	}
}
