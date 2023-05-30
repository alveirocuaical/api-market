package com.api.market.domain.repository;

import com.api.market.domain.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerRepository {

    List<Customer> getAll();

    Optional<Customer> getCustomer(String customer);

    Customer save(Customer customer);

    void delete(String customer);

}
