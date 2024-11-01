package edu.icet.repository;

import edu.icet.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    List<OrderEntity> findByCustomerId(Integer customerId);
    List<OrderEntity> findByDate(String date);
}
