package br.net.jssantos.jsdelivery.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.net.jssantos.jsdelivery.entities.Order;
import br.net.jssantos.jsdelivery.entities.OrderStatus;
import br.net.jssantos.jsdelivery.entities.Product;

public class OrderDto {
	
	private Long id;
	private Double latitude;
	private Double longitude;
	private OrderStatus status;
	private String address;
	private Instant moment;
	
	private List<ProductDto> products = new ArrayList<>();
	
	public OrderDto() {}

	public OrderDto(Order order) {
		id = order.getId();
		latitude = order.getLatitude();
		longitude = order.getLongitude();
		status = order.getStatus();
		address = order.getAddress();
		moment = order.getMoment();
		
		products = order.getProducts().stream()
				.map(x -> new ProductDto(x))
			    .collect(Collectors.toList());
	}
	
	
	
	public List<ProductDto> getProducts() {
		return products;
	}

	public OrderDto(Long id, Double latitude, Double longitude, OrderStatus status, String address, Instant moment) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.status = status;
		this.address = address;
		this.moment = moment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Instant getMoment() {
		return moment;
	}

	public void setMoment(Instant moment) {
		this.moment = moment;
	}
	
}
