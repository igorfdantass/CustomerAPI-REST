package com.ada.crm.services;

import com.ada.crm.model.Customer;
import com.ada.crm.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer findCustomerByID(Long id){
        Optional<Customer> customer = customerRepository.findById(id);
        return customer.orElseThrow(null);
    }

    public Customer updateCustomer(Customer newCustomer, Long id){
        Customer updateCustomer = findCustomerByID(id);
            BeanUtils.copyProperties(newCustomer, updateCustomer, "id");
            return customerRepository.save(updateCustomer);
    }
}
