package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor

public class CustomerController {
    final CustomerService service;
    @GetMapping("/get-all")
    public List<Customer> getCustomer(){
        return service.getCustomer();
    }

    @PostMapping("/add-customer")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }
    @DeleteMapping("delete-by-id/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void deleteById(@PathVariable Integer id) {
        service.deleteById(id);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public void updateCustomer(@RequestBody Customer customer) {
        service.addCustomer(customer);
    }

    @GetMapping("/search-by-name/{name}")
    public List<Customer> searchByName(@PathVariable String name) {
        return service.searchByName(name);
    }

    @GetMapping("/search-by-nic/{nic}")
    public List<Customer> searchByNic(@PathVariable String nic) {
        return service.searchByNic(nic);
    }

    @GetMapping("/search-by-contact/{contact}")
    public List<Customer> searchByContact(@PathVariable String contact) {
        return service.searchByContact(contact);
    }

}
