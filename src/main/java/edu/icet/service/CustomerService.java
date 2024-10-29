package edu.icet.service;

import edu.icet.dto.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> getCustomer();
    void addCustomer(Customer customer);
    void deleteById(Integer id);
    List<Customer> searchByName(String name);
    List<Customer> searchByNic(String nic);
    List<Customer> searchByContact(String contact);
}
