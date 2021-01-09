package br.net.jssantos.jsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.jssantos.jsdelivery.dto.OrderDto;
import br.net.jssantos.jsdelivery.entities.Order;
import br.net.jssantos.jsdelivery.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	@Transactional(readOnly=true)
	public List<OrderDto> findAll(){
		List<Order> list = repository.findAll();
		return list.stream().map(o -> new OrderDto(o)).collect(Collectors.toList());
	}
	
}
