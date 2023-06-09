package com.api.market.persistence.crud;

import com.api.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {

    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);

    Optional<List<Producto>> findByCatidadStockLessThanAndEstado(int catidadStock, boolean estado);

    Optional<Producto> findByNombre(String nombre);

    




}
