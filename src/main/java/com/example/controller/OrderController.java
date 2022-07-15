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
	@RequestMapping("/confirm")
	public String confirm() {
		return "order/order-confirm";
	}

	/**
	 * ショッピングカート画面を表示します.
	 * 
	 * @return ショッピングカート画面
	 */
	@RequestMapping("/cart")
	public String cart() {
		return "order/shopping-cart";
	}

	/**
	 * 注文完了画面を表示します.
	 * 
	 * @return 注文完了画面
	 */
	@RequestMapping("/complete")
	public String complete() {
		return "order/complete";
	}
}
