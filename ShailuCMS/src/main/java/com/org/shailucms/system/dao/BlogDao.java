package com.org.shailucms.system.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.shailucms.system.model.Blog;

public interface BlogDao extends JpaRepository<Blog, Integer> {

}
