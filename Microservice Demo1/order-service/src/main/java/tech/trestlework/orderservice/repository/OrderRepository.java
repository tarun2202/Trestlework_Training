package tech.trestlework.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.trestlework.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
