package com.proyecto.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.interfaceService.ProyectoService;
import com.proyecto.modelo.Proyecto;

@Controller
@RequestMapping
public class Controlador {
	
	@Autowired
	private ProyectoService service;
	
	@GetMapping("/listar")
	public String listar(Model model) {
		List<Proyecto> proyectos = service.listar();
		model.addAttribute("proyectos", proyectos);
		return "index";
	}
	
	@GetMapping("/new")
	public String agregar(Model model) {
		model.addAttribute("proyecto", new Proyecto());
		return "form";
	}
	
	public String save(@Validated Proyecto p, Model model) {
		service.save(p);
		return "redirect:/listar";
	}
	
}
