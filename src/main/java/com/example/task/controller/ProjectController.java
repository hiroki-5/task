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
	* 編集　削除を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/edit/{id}", method = RequestMethod.GET)
	public String edit() {
		return "project/edit";
	}
}
