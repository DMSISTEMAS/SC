package org.cce.sistema.dao;

import java.util.List;

import org.cce.sistema.model.Parroco;

public interface ParrocoDao {
	
	public List<Parroco> lista();

	public void guardar(Parroco parroco);

	public void actualizar(Parroco parroco);

	public void borrar(Parroco parroco);

	public List<String> listarParroco(String nombre);
}
