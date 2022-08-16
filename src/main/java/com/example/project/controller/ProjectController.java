package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	public String index(Model model) {
		model.addAttribute("form", PostFactory.newPost());
		return "projects/index";
	}

	/**
	* 詳細を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/detail", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("form", PostFactory.newPost());
		return "projects/detail";
	}

	/**
	* 新規入力を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/new", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("form", PostFactory.newPost());
		return "projects/new";
	}

	/**
	* 編集　削除を表示する。
	*
	* @param model モデル
	* @return テンプレート
	*/
	@RequestMapping(value = "/project/edit/{id}", method = RequestMethod.GET)
	public String index(Model model) {
		model.addAttribute("form", PostFactory.newPost());
		return "projects/edit";
	}
}
