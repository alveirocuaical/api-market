package com.api.market.persistence.crud;

import com.api.market.persistence.entity.Categoria;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CategoriaCrudRepository extends CrudRepository<Categoria, Integer> {

    Optional<Categoria> getById(int id);

}
