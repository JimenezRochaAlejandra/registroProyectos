package com.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.proyecto.modelo.Proyecto;

public interface ProyectoService {
	public List<Proyecto>listar();
	public Optional<Proyecto>listarId(int id);
	public int save(Proyecto p);
	public void delete(int id);
}
