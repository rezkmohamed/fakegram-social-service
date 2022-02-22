package com.fakegram.microservices.social.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fakegram.microservices.social.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, String>{

}
