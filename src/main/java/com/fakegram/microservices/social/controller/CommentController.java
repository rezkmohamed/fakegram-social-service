package com.fakegram.microservices.social.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fakegram.microservices.social.dto.CommentDTO;
import com.fakegram.microservices.social.service.CommentService;


@RestController
@RequestMapping("/social/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@GetMapping("/{idPost}")
	public ResponseEntity<List<CommentDTO>> getCommentsForPost(@PathVariable String idPost){
		List<CommentDTO> comments = commentService.findAllCommentsForPost(idPost);
		
		if(comments == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(comments, HttpStatus.OK);
	}
	
	@PostMapping("/add")
	public ResponseEntity<HttpStatus> addCommentToPost(@RequestBody CommentDTO commentDTO){
		if(commentService.addComment(commentDTO) == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
