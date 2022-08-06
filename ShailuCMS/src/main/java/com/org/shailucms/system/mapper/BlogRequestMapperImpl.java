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
		
//		List<PostTags> listPostTags = new ArrayList<>();
//		List<PostTags> postTags2 = blog.getPostTags();
//		for(PostTags tags : postTags2) {
//			if(tags == null) {
//				continue;
//			}
//			
//			PostTags postTags1 = new PostTags();
//			postTags1.setTagId(tags.getTagId());
//			postTags1.setTagName(tags.getTagName());
//			listPostTags.add(postTags1);
//		}
//		blog1.setPostTags(listPostTags);
		return blog1;
	}


}
