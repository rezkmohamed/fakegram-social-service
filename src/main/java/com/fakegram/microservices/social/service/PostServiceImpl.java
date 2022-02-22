package com.fakegram.microservices.social.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fakegram.microservices.social.dto.PostDTO;
import com.fakegram.microservices.social.repo.PostRepository;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostRepository postRepo;

	@Override
	public List<PostDTO> findAllPosts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PostDTO> findPostsForProfile(String idProfile) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PostDTO findPostById(String idPost) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String savePost(PostDTO post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deletePostById(String idPost) {
		// TODO Auto-generated method stub
		return false;
	}

}
