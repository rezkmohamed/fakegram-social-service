package com.fakegram.microservices.social.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="post")
public class Post {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name="id_post")
	private String idPost;
	
	@Column(name="img_post")
	private String img_post;
	
	@Column(name="description_post")
	private String description;
	
	@Column(name="date_post")
	private Date date;
	
	@Column(name="id_profile")
	private String idProfile;

	public Post() {
		super();
	}

	public Post(String idPost, String img_post, String description, Date date, String idProfile) {
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

	@Override
	public String toString() {
		return "Post [idPost=" + idPost + ", img_post=" + img_post + ", description=" + description + ", date=" + date
				+ ", idProfile=" + idProfile + "]";
	}
}
