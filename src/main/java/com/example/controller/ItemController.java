package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 商品情報のコントローラーです.
 * 
 * @author isodakeisuke
 *
 */
@Controller
@RequestMapping("")
public class ItemController {

	/**
	 * 商品一覧を表示します.
	 * 
	 * @return
	 */
	@RequestMapping("")
	public String index() {
		return "item/item-list";
	}
}
