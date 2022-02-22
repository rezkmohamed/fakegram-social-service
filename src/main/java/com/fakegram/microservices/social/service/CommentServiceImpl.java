package com.fakegram.microservices.social.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fakegram.microservices.social.dto.CommentDTO;
import com.fakegram.microservices.social.repo.CommentRepository;
import com.fakegram.microservices.social.utils.CommentUtils;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentRepository commentRepo;
	
	@Override
	public List<CommentDTO> findAllCommentsForPost(String idPost) {
		List<String> id = new ArrayList<String>();
		id.add(idPost);
		
		return CommentUtils.commentEntityToDTO(commentRepo.findAllById(id));
	}

	@Override
	public String addComment(CommentDTO commentDTO) {
		return commentRepo.save(CommentUtils.commentDTOToEntity(commentDTO)).getIdComment();
	}
}
