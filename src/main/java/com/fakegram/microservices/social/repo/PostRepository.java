package com.fakegram.microservices.social.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fakegram.microservices.social.entity.Post;

public interface PostRepository extends JpaRepository<Post, String>{
	public List<Post> findByIdProfile(String idProfile);
}