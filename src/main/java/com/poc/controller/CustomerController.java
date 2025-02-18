package com.poc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.poc.entity.Customer;
import com.poc.service.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService; // Injecting the service

    @PostMapping
    public Customer addCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer); // Using service layer
    }
    
    @GetMapping
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers(); // Using service layer
    }

    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable int id) {
        return customerService.getCustomerById(id); // Using service layer
    }
    
    @DeleteMapping("/deleteById/{id}")
    
    public ResponseEntity<?> deleteById(@PathVariable int id){
     boolean b = customerService.deleteCustomerId(id);
     if(b) {
    	 return ResponseEntity.noContent().build();
     }else {
    	 return ResponseEntity.status(HttpStatus.NOT_FOUND)
    		 .body(b);
    	 
     }
     
    }
}
