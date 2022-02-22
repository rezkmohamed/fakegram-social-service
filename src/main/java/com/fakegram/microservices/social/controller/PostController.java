package com.fakegram.microservices.social.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fakegram.microservices.social.dto.PostDTO;
import com.fakegram.microservices.social.service.PostService;


@RestController
@RequestMapping("/social/posts")
public class PostController {
	@Autowired
	private PostService postService;
	
	
	@GetMapping("")
	public ResponseEntity<List<PostDTO>> getAllPosts(){
		List<PostDTO> posts = postService.findAllPosts();
		
		if(posts == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}
	
	@GetMapping("/profile/{idProfile}")
	public ResponseEntity<List<PostDTO>> getPostsForProfilePage(@PathVariable String idProfile){
		List<PostDTO> posts = postService.findPostsForProfile(idProfile);
		
		if(posts == null) {
			return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
		}
		
		return new ResponseEntity<>(posts, HttpStatus.OK);
	}

	@GetMapping("/detail/{idPost}")
	public ResponseEntity<PostDTO> getPostById(@PathVariable String idPost){
		PostDTO post = postService.findPostById(idPost);
		if(post == null) {
			return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(post, HttpStatus.OK);
	}
	
	@PostMapping("/save")
	public ResponseEntity<HttpStatus> savePost(@RequestBody PostDTO postDTO, HttpServletRequest request){
		String response = postService.savePost(postDTO);
		if(response == null) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(HttpStatus.OK);	
	}
	
	
	@DeleteMapping("/{idPost}")
	public ResponseEntity<HttpStatus> deletePostById(@PathVariable String idPost, HttpServletRequest request){
		if(postService.deletePostById(idPost)) {
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
	
		return new ResponseEntity<HttpStatus>(HttpStatus.BAD_REQUEST);
	}
}