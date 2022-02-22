package com.fakegram.microservices.social.utils;

import java.util.ArrayList;
import java.util.List;

import com.fakegram.microservices.social.dto.CommentDTO;
import com.fakegram.microservices.social.entity.Comment;
import com.fakegram.microservices.social.entity.Post;

public class CommentUtils {
	public static CommentDTO commentEntityToDTO(Comment comment) {
		CommentDTO commentDTO = new CommentDTO();
		commentDTO.setComment(comment.getComment());
		commentDTO.setDate(comment.getDate());
		commentDTO.setIdComment(comment.getIdComment());
		commentDTO.setIdPost(comment.getPost().getIdPost());
		commentDTO.setIdProfile(comment.getIdProfile());
		
		return commentDTO;
	}
	
	public static List<CommentDTO> commentEntityToDTO(List<Comment> comments){
		List<CommentDTO> commentsDTO = new ArrayList<>();
		for(Comment c : comments) {
			commentsDTO.add(commentEntityToDTO(c));
		}
		
		return commentsDTO;
	}
	
	public static Comment commentDTOToEntity(CommentDTO commentDTO) {
		Comment comment = new Comment();
		comment.setComment(commentDTO.getComment());
		comment.setIdProfile(commentDTO.getIdProfile());
		
		return comment;
	}
}
