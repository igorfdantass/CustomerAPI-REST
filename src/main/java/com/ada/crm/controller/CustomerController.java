package com.ada.crm.controller;

import com.ada.crm.model.Customer;
import com.ada.crm.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private CustomerService customerServices;

    @GetMapping
    public ResponseEntity<List<Customer>> getCustomers() {
        return new ResponseEntity<>(customerServices.findAllCustomers(),HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer newCustomer) {
        return new ResponseEntity<>(customerServices.createCustomer(newCustomer),HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable Long id) {
        return new ResponseEntity<>(customerServices.findCustomerByID(id),HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Customer> replaceCustomer(@RequestBody Customer newCustomer, @PathVariable Long id){
        return new ResponseEntity<>(customerServices.updateCustomer(newCustomer, id), HttpStatus.ACCEPTED);
    }

}
