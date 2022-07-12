package com.example.domain;

/**
 * 商品情報を保持します.
 * 
 * @author isodakeisuke
 *
 */
public class Item {
	/* ID */
	private Integer id;
	/* 名前 */
	private String name;
	/* 説明 */
	private String description;
	/* 値段 */
	private Integer price;
	/* 画像のパス */
	private String image_path;
	/* 削除の真偽値 */
	private Boolean deleted;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public Boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean deleted) {
		this.deleted = deleted;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price
				+ ", image_path=" + image_path + ", deleted=" + deleted + "]";
	}

}
