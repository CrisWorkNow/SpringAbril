package com.cristina.rest.servicio;

import java.util.List;

import com.cristina.rest.entity.Cliente;

public interface ClienteService {
	
	public List<Cliente> mostrarTodo();
	
	public Cliente buscarPorId(long id);
	
	public Cliente guardar(Cliente cliente);
	
	public void borrar(long id);

}
