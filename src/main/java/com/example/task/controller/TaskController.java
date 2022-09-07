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
	* データの追加して一覧に表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/add", method = RequestMethod.POST)
	public String add() {
		System.out.println("１");
		return "redirect/index";
	}

	/**
	* 編集を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/edit/{id}", method = RequestMethod.GET)
	public String erit() {

		return "task/edit";
	}

	/**
	* データの更新して一覧に表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/update/{id}", method = RequestMethod.POST)
	public String update() {

		return "redirect/index";
	}

	/**
	* データの削除して一覧に反映する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/task/delete/{id}", method = RequestMethod.POST)
	public String delete() {

		return "redirect/index";
	}

}
