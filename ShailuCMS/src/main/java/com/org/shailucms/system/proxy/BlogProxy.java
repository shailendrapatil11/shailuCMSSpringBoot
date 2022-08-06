package com.org.shailucms.system.proxy;

import java.util.List;

import com.org.shailucms.system.model.Blog;

public interface BlogProxy {

	public Blog proxyAddNewPost(Blog blog);

	public List<Blog> proxyGetAllPostt();

	public Blog proxyUpdateBlog(Blog blog);

	public Blog proxyDeleteBlog(Integer id);
}
