package com.api.market.persistence.crud;

import com.api.market.persistence.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ClienteCrudRepository extends CrudRepository<Cliente, String> {

    Optional<Cliente> getById(String id);
}
