package com.fakegram.microservices.social.service;

import java.util.List;

import com.fakegram.microservices.social.dto.CommentDTO;

public interface CommentService {
	public List<CommentDTO> findAllCommentsForPost(String idPost);
	
	public String addComment(CommentDTO commentDTO);
}
