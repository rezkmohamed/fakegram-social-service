package com.fakegram.microservices.social.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fakegram.microservices.social.dto.PostDTO;
import com.fakegram.microservices.social.repo.PostRepository;
import com.fakegram.microservices.social.utils.PostUtils;

@Service
public class PostServiceImpl implements PostService {
	@Autowired
	private PostRepository postRepo;

	@Override
	public List<PostDTO> findAllPosts() {
		return PostUtils.postEntityToDTO(postRepo.findAll());
	}

	@Override
	public List<PostDTO> findPostsForProfile(String idProfile) {
		return PostUtils.postEntityToDTO(postRepo.findByIdProfile(idProfile));
	}

	@Override
	public PostDTO findPostById(String idPost) {
		return PostUtils.postEntityToDTO(postRepo.findById(idPost).orElse(null));
	}

	@Override
	public String savePost(PostDTO post) {
		return postRepo.save(PostUtils.postDTOToEntity(post)).getIdPost();
	}

	@Override
	public boolean deletePostById(String idPost) {
		try {
			postRepo.deleteById(idPost);
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}		
		
		return false;
	}

}
