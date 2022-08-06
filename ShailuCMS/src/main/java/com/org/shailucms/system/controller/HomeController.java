package com.org.shailucms.system.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.org.shailucms.system.mapper.BlogRequestMapper;
import com.org.shailucms.system.model.Blog;
import com.org.shailucms.system.service.BlogService;


@RestController
public class HomeController {
	
	@Autowired
	private BlogService blogService;
	
	@Autowired
	private BlogRequestMapper blogRequestMapper;
	
	@PostMapping("/blog")
	public Blog contentAdd(@RequestBody Blog blog) {
		
		Blog mapBlogtoBlogRequest = blogRequestMapper.mapBlogtoBlogRequest(blog);
		
		Blog addNewPost = blogService.addNewPost(mapBlogtoBlogRequest);
		
		return addNewPost;
		
	}
	
	@GetMapping("/blog")
	public List<Blog> contentGetAll() {
		List<Blog> getAllPost = blogService.getAllPost();
		return getAllPost;
	}
	
	@PutMapping("/blog")
	public Blog updateBlog(@RequestBody Blog blog) {
		Blog updateBlog = blogService.updateBlog(blog);
		return updateBlog;
	}
	
	@DeleteMapping("/blog/{id}")
	public Blog deleteBlog(@PathVariable Integer id) {
		Blog deleteBlogPost = blogService.deleteBlogPost(id);
		return deleteBlogPost;
	}

}
