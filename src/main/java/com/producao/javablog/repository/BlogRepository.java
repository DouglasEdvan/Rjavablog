package com.producao.javablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.producao.javablog.entity.Blog;

public interface BlogRepository  extends JpaRepository<Blog, Integer>{

}
