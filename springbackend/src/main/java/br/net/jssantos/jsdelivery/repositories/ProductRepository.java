package br.net.jssantos.jsdelivery.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.jssantos.jsdelivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	List<Product> findAllByOrderByNameAsc();
}
