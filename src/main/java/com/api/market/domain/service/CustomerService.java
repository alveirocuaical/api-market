package com.api.market.domain.service;

import com.api.market.domain.Customer;
import com.api.market.domain.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAll() {
        return customerRepository.getAll();
    }

    public Optional<Customer> getCustomer(String customerId) {
        return customerRepository.getCustomer(customerId);
    }

    public Customer save (Customer customer) {
        return customerRepository.save(customer);
    }

    public boolean delete (String customerId) {
        return getCustomer(customerId).map(customer -> {
            customerRepository.delete(customerId);
            return true;
        }).orElse(false);
    }
}
