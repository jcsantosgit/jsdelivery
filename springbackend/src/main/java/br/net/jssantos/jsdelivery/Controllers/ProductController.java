package br.net.jssantos.jsdelivery.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.net.jssantos.jsdelivery.dto.ProductDto;
import br.net.jssantos.jsdelivery.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@GetMapping
	public ResponseEntity<List<ProductDto>> findAll(){
		List<ProductDto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
}
