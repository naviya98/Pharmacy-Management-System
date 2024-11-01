package edu.icet.service;

import edu.icet.dto.Order;

public interface OrderService {
    void  addOrder(Order order);

    boolean deleteById(Integer id);
}
