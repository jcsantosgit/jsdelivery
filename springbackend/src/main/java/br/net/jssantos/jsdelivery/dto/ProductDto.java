package br.net.jssantos.jsdelivery.dto;

import br.net.jssantos.jsdelivery.entities.Product;

public class ProductDto {
	private Long id;
	private String name;
	private Double price;
	private String description;
	private String imageUrl;
	
	public ProductDto() {}

	public ProductDto(Product product) {
		id = product.getId();
		name = product.getName();
		price = product.getPrice();
		description = product.getDescription();
		imageUrl = product.getImageUrl();		
	}
	
	public ProductDto(Long id, String name, Double price, String description, String imageUrl) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public void setPrice(Double price) {
		this.price = price;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
}
