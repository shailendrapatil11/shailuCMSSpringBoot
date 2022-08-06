package com.org.shailucms.system.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "BLOG_POST_TABLE")
public class Blog {
	
	@Id
	private Integer id;
	
	@Column(name = "POST_TITLE")
	private String postTitile;
	
	@Column(name = "POST_CONTENT")
	private String postContent;
	
	@Column(name = "POST_DATE")
	private String postDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostTitile() {
		return postTitile;
	}

	public void setPostTitile(String postTitile) {
		this.postTitile = postTitile;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}

	public String getPostDate() {
		return postDate;
	}

	public void setPostDate(String postDate) {
		this.postDate = postDate;
	}

}
