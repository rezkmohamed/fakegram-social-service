package com.fakegram.microservices.social.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="comments")
public class Comment {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	@Column(name="id_comment")
	private String idComment;
	
	@Column(name="comment")
	private String comment;
	
	@Column(name="date")
	private Date date;
	
	@ManyToOne(cascade={CascadeType.PERSIST, CascadeType.MERGE, 
            CascadeType.REFRESH, CascadeType.DETACH})
	@JoinColumn(name="id_post")
	private Post post;

	public Comment() {
		super();
	}

	public Comment(String idComment, String comment, Date date, com.fakegram.microservices.social.entity.Post post) {
		super();
		this.idComment = idComment;
		this.comment = comment;
		this.date = date;
		this.post = post;
	}

	public String getIdComment() {
		return idComment;
	}

	public void setIdComment(String idComment) {
		this.idComment = idComment;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}
}
