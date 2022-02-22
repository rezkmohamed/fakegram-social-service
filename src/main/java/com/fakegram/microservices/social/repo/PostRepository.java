package com.fakegram.microservices.social.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fakegram.microservices.social.entity.Post;

public interface PostRepository extends JpaRepository<Post, String>{

}
