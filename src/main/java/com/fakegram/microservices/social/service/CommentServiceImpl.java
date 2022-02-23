package com.fakegram.microservices.social.service;

//import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fakegram.microservices.social.dto.CommentDTO;
import com.fakegram.microservices.social.entity.Comment;
import com.fakegram.microservices.social.repo.CommentRepository;
import com.fakegram.microservices.social.repo.PostRepository;
import com.fakegram.microservices.social.utils.CommentUtils;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentRepository commentRepo;
	@Autowired
	private PostRepository postRepo;
	
	@Override
	public List<CommentDTO> findAllCommentsForPost(String idPost) {
//		List<String> id = new ArrayList<String>();
//		id.add(idPost);
		
		return CommentUtils.commentEntityToDTO(commentRepo.findByPost(idPost));
	}

	@Override
	public String addComment(CommentDTO commentDTO) {
		Comment comment = CommentUtils.commentDTOToEntity(commentDTO);
		comment.setPost(postRepo.getById(commentDTO.getIdPost()));
		
		return commentRepo.save(comment).getIdComment();
	}
}
