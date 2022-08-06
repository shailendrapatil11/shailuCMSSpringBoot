package com.org.shailucms.system.mapper;

import org.springframework.stereotype.Component;

import com.org.shailucms.system.model.Blog;

@Component
public class BlogRequestMapperImpl implements BlogRequestMapper {

	@Override
	public Blog mapBlogtoBlogRequest(Blog blog) {
		Blog blog1 = new Blog();
		blog1.setId(blog.getId());
		blog1.setPostTitile(blog.getPostTitile());
		blog1.setPostDate(blog.getPostDate());
		blog1.setPostContent(blog.getPostContent());
		return blog1;
	}

}
