package com.org.shailucms.system.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.shailucms.system.model.Blog;
import com.org.shailucms.system.proxy.BlogProxy;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogProxy blogProxy;

	@Override
	public Blog addNewPost(Blog blog) {
		Blog addNewPost = blogProxy.proxyAddNewPost(blog);
		return addNewPost;
	}

	@Override
	public List<Blog> getAllPost() {
		List<Blog> proxyGetAllPostt = blogProxy.proxyGetAllPostt();
		return proxyGetAllPostt;
	}

	@Override
	public Blog updateBlog(Blog blog) {
		Blog proxyUpdateBlog = blogProxy.proxyUpdateBlog(blog);
		return proxyUpdateBlog;
	}

	@Override
	public Blog deleteBlogPost(Integer id) {
		blogProxy.proxyDeleteBlog(id);
		return null;
	}

}
