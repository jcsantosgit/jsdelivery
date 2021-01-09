package br.net.jssantos.jsdelivery.services;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.jssantos.jsdelivery.dto.OrderDto;
import br.net.jssantos.jsdelivery.dto.ProductDto;
import br.net.jssantos.jsdelivery.entities.Order;
import br.net.jssantos.jsdelivery.entities.OrderStatus;
import br.net.jssantos.jsdelivery.entities.Product;
import br.net.jssantos.jsdelivery.repositories.OrderRepository;
import br.net.jssantos.jsdelivery.repositories.ProductRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional(readOnly=true)
	public List<OrderDto> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(o -> new OrderDto(o)).collect(Collectors.toList());
	}
	
	@Transactional
	public OrderDto insert(OrderDto dto) {
		
		dto.setMoment(Instant.now());
		dto.setStatus(OrderStatus.PEDDING);
		
		Order order = new Order(
				null, 
				dto.getLatitude(), 
				dto.getLongitude(), 
				OrderStatus.PEDDING, 
				dto.getAddress(), 
				dto.getMoment());
		
		for(ProductDto p : dto.getProducts()) {
			Product product = productRepository.getOne(p.getId());
			order.getProducts().add(product);
		}
		
		order = repository.save(order);
		
		return new OrderDto(order);
	}

	@Transactional
	public OrderDto update(Long id, OrderStatus status) {
		Order order = repository.getOne(id);
		order.setStatus(status);
		order = repository.save(order);
		return new OrderDto(order);
	}
	
}
