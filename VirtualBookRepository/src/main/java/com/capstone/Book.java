package com.capstone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	private Long id; 
	private String title; 
	private String author; 
	private String publisher; 
	private int publication_year; 
	private int number_of_pages; 
	private int isbn;
	
	
	public Book() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublisher() {
		return publisher;
	}


	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}


	public int getPublication_year() {
		return publication_year;
	}


	public void setPublication_year(int publication_year) {
		this.publication_year = publication_year;
	}


	public int getNumber_of_pages() {
		return number_of_pages;
	}


	public void setNumber_of_pages(int number_of_pages) {
		this.number_of_pages = number_of_pages;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
	
	

}
