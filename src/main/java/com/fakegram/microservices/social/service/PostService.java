package com.fakegram.microservices.social.service;

import java.util.List;

import com.fakegram.microservices.social.dto.PostDTO;

public interface PostService {
	public List<PostDTO> findAllPosts();
	
	public List<PostDTO> findPostsForProfile(String idProfile);
	
	public PostDTO findPostById(String idPost);
	
	public String savePost(PostDTO post);
	
	public boolean deletePostById(String idPost);
}
