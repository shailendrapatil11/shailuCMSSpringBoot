package com.org.shailucms.system.proxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.shailucms.system.dao.BlogDao;
import com.org.shailucms.system.model.Blog;

@Service
public class BlogProxyImpl implements BlogProxy {

	@Autowired
	private BlogDao blogDao;

	@Override
	public Blog proxyAddNewPost(Blog blog) {
		if (blog != null) {
			blogDao.save(blog);
		}

		return blog;
	}

	@Override
	public List<Blog> proxyGetAllPostt() {
		List<Blog> findAll = blogDao.findAll();
		return findAll;
	}

	@Override
	public Blog proxyUpdateBlog(Blog blog) {
		Blog save = blogDao.save(blog);
		return save;
	}

	@Override
	public Blog proxyDeleteBlog(Integer id) {
		Blog byId = blogDao.getOne(id);
		blogDao.deleteById(id);
		return byId;
	}

}
