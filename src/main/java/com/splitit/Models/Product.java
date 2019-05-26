package com.splitit.Models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.QueryHint;
import javax.persistence.Table;
import javax.persistence.Entity;



@Entity
@Table(name="products") // This tells Hibernate to make a table out of this class
	public class Product {
    		@Id
    		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name = "id")
		private Long id;
		@Column(name = "name")
		private String name;
		@Column(name = "type")
		private String type;
		@Column(name = "price")
		private Long price;
		@Column(name = "discount_price")
		private Long discount_price;

	
	public Long getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getDiscountPrice() {
		return discount_price;
	}

	public void setDiscountPrice(Long discountPrice) {
		this.discount_price = discountPrice;
	}
}
