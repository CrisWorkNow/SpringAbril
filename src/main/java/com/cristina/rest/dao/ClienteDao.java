package com.cristina.rest.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cristina.rest.entity.Cliente;

@Repository
public interface ClienteDao extends CrudRepository<Cliente, Long>{ //<Entidad, tipo de id>

}
