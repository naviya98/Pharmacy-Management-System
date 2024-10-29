package edu.icet.service.impl;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {
    final CustomerRepository repository;
    final ModelMapper mapper;

    @Override
    public List<Customer> getCustomer() {
        List<Customer> customers = new ArrayList<>();
                repository.findAll().forEach(customer -> customers.add(mapper.map(customer, Customer.class)));
                return customers;
    }

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Customer> searchByName(String name) {
        List<Customer> customers = new ArrayList<>();
        repository.findByName(name).forEach(entity->{customers.add(mapper.map(entity, Customer.class));
        });
        return customers;
    }

    @Override
    public List<Customer> searchByNic(String nic) {
        List<Customer> customers = new ArrayList<>();
        repository.findByName(nic).forEach(entity->{customers.add(mapper.map(entity, Customer.class));
        });
        return customers;
    }

    @Override
    public List<Customer> searchByContact(String contact) {
        List<Customer> customers = new ArrayList<>();
        repository.findByName(contact).forEach(entity->{customers.add(mapper.map(entity, Customer.class));
        });
        return customers;
    }
}
