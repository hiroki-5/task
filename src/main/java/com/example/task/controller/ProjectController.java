package com.example.task.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * タスク一覧表示のフロントコントローラー.
 */
@Controller
public class ProjectController {

	/**
	* 一覧を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {

		return "project/index";
	}

	/**
	* 詳細を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/detail", method = RequestMethod.GET)
	public String detail() {

		return "project/detail";
	}

	/**
	* 新規入力を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/create", method = RequestMethod.GET)
	public String create() {
		return "project/create";
	}

	/**
	* データの追加して一覧に表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/add", method = RequestMethod.POST)
	public String add() {
		System.out.println("１");
		return "redirect:/";
	}
	/**
	* 編集を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/edit/{id}", method = RequestMethod.GET)
	public String edit() {
		return "project/edit";
	}

	/**
	* データの更新をして一覧に表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/update/{id}", method = RequestMethod.POST)
	public String update() {

		return "redirect:/";
	}

	/**
	* データの削除をして一覧に反映する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/delete/{id}", method = RequestMethod.POST)
	public String delete() {

		return "redirect:/";
	}
}
