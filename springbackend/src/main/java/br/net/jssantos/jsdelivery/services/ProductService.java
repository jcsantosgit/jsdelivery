package br.net.jssantos.jsdelivery.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.net.jssantos.jsdelivery.dto.ProductDto;
import br.net.jssantos.jsdelivery.entities.Product;
import br.net.jssantos.jsdelivery.repositories.ProductRepository;

@Service
public class ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Transactional(readOnly=true)
	public List<ProductDto> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(p -> new ProductDto(p)).collect(Collectors.toList());
	}
	
}
