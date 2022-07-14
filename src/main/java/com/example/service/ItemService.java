package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.Item;
import com.example.repository.ItemRepository;

/**
 * 商品情報の業務処理を行います.
 * 
 * @author isodakeisuke
 *
 */
@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;

	/**
	 * 商品一覧を返します.
	 * 
	 * @return 商品一覧情報
	 */
	public List<Item> findAll() {
		List<Item> itemList = itemRepository.findAll();
		return itemList;
	}

	/**
	 * idで検索された商品を返します.
	 * 
	 * @param id 商品id
	 * @return 商品情報
	 */
	public Item findById(Integer itemId) {
		Item item = itemRepository.findById(itemId);
		return item;
	}
}
