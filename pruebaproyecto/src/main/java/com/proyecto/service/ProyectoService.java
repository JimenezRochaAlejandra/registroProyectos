package com.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proyecto.interfaces.Proyectos;
import com.proyecto.modelo.Proyecto;

@Service
public class ProyectoService implements com.proyecto.interfaceService.ProyectoService{

	@Autowired
	private Proyectos data;
	@Override
	public List<Proyecto> listar() {
		return (List<Proyecto>)data.findAll();
	}

	@Override
	public Optional<Proyecto> listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Proyecto p) {
		int res = 0;
		Proyecto proyecto = data.save(p);
			if(!proyecto.equals(null)) {
				res = 1;
			}
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
