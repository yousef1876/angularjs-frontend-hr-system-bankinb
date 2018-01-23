package com.framework.core.springmvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.framework.core.springmvc.domain.Post;

public interface PostRepository extends JpaRepository<Post, Long>,//
        JpaSpecificationExecutor<Post>{

}
