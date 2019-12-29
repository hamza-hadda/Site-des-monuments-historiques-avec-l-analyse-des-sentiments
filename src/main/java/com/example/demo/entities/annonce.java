package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class annonce {

	@GeneratedValue
	@javax.persistence.Id
	private Long Id;
	private String title;
	private String image;
	private String description;
	public void setId(Long id) {
		Id = id;
	}
	private String status ;
	public annonce() {
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public annonce(long id, String title, String image, String description) {
		super();
		Id = id;
		this.title = title;
		this.image = image;
		this.description = description;
	}
	
	public annonce(String title, String image, String description) {
		super();
		this.title = title;
		this.image = image;
		this.description = description;
	}

}
