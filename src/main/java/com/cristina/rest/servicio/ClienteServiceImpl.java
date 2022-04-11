package com.cristina.rest.servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cristina.rest.dao.ClienteDao;
import com.cristina.rest.entity.Cliente;

@Service
public class ClienteServiceImpl implements ClienteService{
	
	@Autowired
	private ClienteDao repositorio;

	@Transactional(readOnly = true)   //para los que devuelven datos hay que decirle lo de readOnly
	public List<Cliente> mostrarTodo() {
		return (List<Cliente>) repositorio.findAll();
	}

	@Transactional  
	public Cliente buscarPorId(long id) {
		return repositorio.findById(id).orElse(null);
	}

	@Transactional
	public Cliente guardar(Cliente cliente) {
		return repositorio.save(cliente);
	}

	@Override
	public void borrar(long id) {
		repositorio.deleteById(id);
	}



}
