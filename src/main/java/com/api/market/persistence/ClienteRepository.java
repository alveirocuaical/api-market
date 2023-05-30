package com.api.market.persistence;

import com.api.market.domain.Customer;
import com.api.market.domain.repository.CustomerRepository;
import com.api.market.persistence.crud.ClienteCrudRepository;
import com.api.market.persistence.entity.Cliente;
import com.api.market.persistence.mapper.CustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClienteRepository implements CustomerRepository {

    @Autowired
    private ClienteCrudRepository clienteCrudRepository;
    @Autowired
    private CustomerMapper customerMapper;


    @Override
    public List<Customer> getAll() {
        List<Cliente> clientes = (List<Cliente>) clienteCrudRepository.findAll();
        return customerMapper.toCustomers(clientes);
    }

    @Override
    public Optional<Customer> getCustomer(String customer) {
        return clienteCrudRepository.getById(customer).map(cliente -> customerMapper.toCustomer(cliente));
    }

    @Override
    public Customer save(Customer customer) {
        Cliente cliente = customerMapper.toCliente(customer);
        return customerMapper.toCustomer(clienteCrudRepository.save(cliente));
    }

    @Override
    public void delete(String customer) {
        clienteCrudRepository.deleteById(customer);
    }
}
