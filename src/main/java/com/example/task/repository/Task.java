package com.example.task.repository;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import groovyjarjarantlr4.v4.runtime.misc.NotNull;
import lombok.Data;

/**
 * 投稿.
 */
@Entity
@Table(name = "task")
@Data
public class Task {

	/** ID */
	@Id
	@Column
	@NotNull
	private INTEGER id = null;

	/** タスクの進行具合 */
	@Column(length = 20, nullable = false)
	@NotEmpty
	@Size(min = 1, max = 20)
	private String author = null;

	/** プェクトのID */
	@Column(length = 20, nullable = false)
	@NotEmpty
	@Size(min = 1, max = 20)
	private String title = null;

	/** 内容 */
	@Column(length = 1000, nullable = false)
	@NotEmpty
	@Size(min = 1, max = 1000)
	private String body = null;

	/** 登録日時 */
	private Date createdDate = null;

	/** 更新日時 */
	private Date updatedDate = null;

	/** 削除済 */
	private boolean deleted = false;

}
