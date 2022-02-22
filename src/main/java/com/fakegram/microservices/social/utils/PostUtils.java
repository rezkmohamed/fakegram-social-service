package com.fakegram.microservices.social.utils;

import java.util.ArrayList;
import java.util.List;

import com.fakegram.microservices.social.dto.PostDTO;
import com.fakegram.microservices.social.entity.Post;

public class PostUtils {
	public static PostDTO postEntityToDTO(Post post) {
		PostDTO postDTO = new PostDTO();
		postDTO.setDate(post.getDate());
		postDTO.setDescription(post.getDescription());
		postDTO.setIdPost(post.getIdPost());
		postDTO.setIdProfile(post.getIdProfile());
		postDTO.setImg_post(post.getImg_post());
		
		return postDTO;
	}
	
	public static List<PostDTO> postEntityToDTO(List<Post> posts) {
		List<PostDTO> postsDTO = new ArrayList<>();
		for(Post post : posts) {
			postsDTO.add(postEntityToDTO(post));
		}
		
		return postsDTO;
	}
	
	public static Post postDTOToEntity(PostDTO postDTO) {
		Post post = new Post();
		post.setDescription(postDTO.getDescription());
		post.setIdProfile(postDTO.getIdProfile());
		post.setImg_post(postDTO.getImg_post());		
		
		return post;		
	}
}
