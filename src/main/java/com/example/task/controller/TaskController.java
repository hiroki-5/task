package com.example.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * タスク一覧表示のフロントコントローラー.
 */
@Controller
public class TaskController {

	/**
	* 一覧を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/", method = RequestMethod.GET)
	public String index() {
		System.out.println("１");
		return "task/index";
	}

	/**
	* 詳細を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/detail", method = RequestMethod.GET)
	public String detail() {

		return "task/detail";
	}

	/**
	* 新規入力を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/create", method = RequestMethod.GET)
	public String create() {

		return "task/create";
	}

	/**
	* 編集　削除を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/edit/{id}", method = RequestMethod.GET)
	public String erit() {

		return "task/edit";
	}
}
