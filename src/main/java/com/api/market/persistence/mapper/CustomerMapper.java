package com.api.market.persistence.mapper;

import com.api.market.domain.Customer;
import com.api.market.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

    @Mappings({
            @Mapping(source = "id", target = "customerId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "apellidos", target = "lastName"),
            @Mapping(source = "celular", target = "phone"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "correoElectronico", target = "email"),

    })
    Customer toCustomer(Cliente cliente);
    List<Customer> toCustomers(List<Cliente> customers);

    @InheritInverseConfiguration
    Cliente toCliente(Customer customer);
}
