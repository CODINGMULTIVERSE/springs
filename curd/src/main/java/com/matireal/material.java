package com.matireal;

 	import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

	@Entity
	public class material {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String detail;
	    private String picture;
	    private int price;
	    private int quantity;
	    private int totalPrice;
	    private Date createdDate;

	    public material() {
	    }

	    public material(String name, String detail, String picture, int price, int quantity) {
	        this.name = name;
	        this.detail = detail;
	        this.picture = picture;
	        this.price = price;
	        this.quantity = quantity;
	        this.totalPrice = price * quantity;
	        this.createdDate = new Date();
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setDetail(String detail) {
	        this.detail = detail;
	    }

	    public void setPicture(String picture) {
	        this. picture = picture;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	        this.totalPrice = price * this.quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	        this.totalPrice = this.price * quantity;
	    }

	    public Long getId() {
	        return id;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public String getDetail() {
	        return this.detail;
	    }

	    public String getPicture() {
	        return this.picture;
	    }

	    public int getPrice() {
	        return this.price;
	    }

	    public int getQuantity() {
	        return this.quantity;
	    }

	    public int getTotalPrice() {
	        return this.totalPrice;
	    }

	    public Date getCreatedDate() {
	        return this.createdDate;
	    }
	}


