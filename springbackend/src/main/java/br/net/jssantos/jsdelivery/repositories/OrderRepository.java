package br.net.jssantos.jsdelivery.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.net.jssantos.jsdelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
