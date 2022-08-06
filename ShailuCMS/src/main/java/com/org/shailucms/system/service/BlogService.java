package com.org.shailucms.system.service;

import java.util.List;

import com.org.shailucms.system.model.Blog;

public interface BlogService {

	public Blog addNewPost(Blog blog);

	public List<Blog> getAllPost();

	public Blog updateBlog(Blog blog);

	public Blog deleteBlogPost(Integer id);
}
