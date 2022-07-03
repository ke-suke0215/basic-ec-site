package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 注文に関する画面のコントローラー.
 * 
 * @author isodakeisuke
 *
 */
@Controller
@RequestMapping("/order")
public class OrderController {
	
	/**
	 * 注文確認画面を表示します.
	 * 
	 * @return 注文確認画面
	 */
	@GetMapping("/confirm")
	public String confirm() {
		return "order/order-confirm";
	}
}
