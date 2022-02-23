package com.fakegram.microservices.social.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fakegram.microservices.social.entity.Comment;

public interface CommentRepository extends JpaRepository<Comment, String>{
	@Query("from Comment where id_post = :idPost")
	public List<Comment> findByPost(@Param("idPost") String idPost);
}
