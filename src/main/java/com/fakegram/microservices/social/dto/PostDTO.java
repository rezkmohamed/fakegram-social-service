package com.fakegram.microservices.social.dto;

import java.util.Date;

public class PostDTO {
	private String idPost;
	private String img_post;
	private String description;
	private Date date;
	private String idProfile;
	private ProfileDTO profileDTO;
	
	public PostDTO() {
		super();
	}

	public PostDTO(String idPost, String img_post, String description, Date date, String idProfile) {
		super();
		this.idPost = idPost;
		this.img_post = img_post;
		this.description = description;
		this.date = date;
		this.idProfile = idProfile;
	}

	public String getIdPost() {
		return idPost;
	}

	public void setIdPost(String idPost) {
		this.idPost = idPost;
	}

	public String getImg_post() {
		return img_post;
	}

	public void setImg_post(String img_post) {
		this.img_post = img_post;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getIdProfile() {
		return idProfile;
	}

	public void setIdProfile(String idProfile) {
		this.idProfile = idProfile;
	}

	public ProfileDTO getProfileDTO() {
		return profileDTO;
	}

	public void setProfileDTO(ProfileDTO profileDTO) {
		this.profileDTO = profileDTO;
	}
}
