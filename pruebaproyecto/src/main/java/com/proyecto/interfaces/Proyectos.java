package com.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.modelo.Proyecto;

@Repository
public interface Proyectos extends CrudRepository<Proyecto, Integer>{

}
