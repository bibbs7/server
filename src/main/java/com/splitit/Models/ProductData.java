package com.splitit.Models;

public class ProductData {

	private String name;
	private String type;
	private Long price;
	private Long discount_price;

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
