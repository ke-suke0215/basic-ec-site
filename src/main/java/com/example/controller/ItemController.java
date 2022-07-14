package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.Item;
import com.example.service.ItemService;

/**
 * 商品情報のコントローラーです.
 * 
 * @author isodakeisuke
 *
 */
@Controller
@RequestMapping("")
public class ItemController {
	
	@Autowired
	private ItemService itemService;

	/**
	 * 商品一覧を表示します.
	 * 
	 * @return 商品一覧画面
	 */
	@RequestMapping("")
	public String index(Model model) {
		List<Item> itemList = itemService.findAll();
		model.addAttribute(itemList);
		return "item/item-list";
	}
	
	/**
	 * 商品詳細画面を表示します.
	 * 
	 * @return 詳細画面
	 */
	@RequestMapping("/itemDetail")
	public String itemDetail(Integer id, Model model) {
		Item item = itemService.findById(id);
		model.addAttribute(item);
		return "item/item-detail";
	}
}
