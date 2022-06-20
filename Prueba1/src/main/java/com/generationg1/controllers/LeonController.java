package com.generationg1.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.generationg1.models.Leon;

import com.generationg1.services.LeonService;


@Controller
@RequestMapping("/leon")
public class LeonController {
	
	//inyeccion de dependecias
	@Autowired
	LeonService leonService;
	
	//se agrega una ruta para desplegar el jsp
	@RequestMapping("")
	public String leon(@ModelAttribute("leon")Leon leon) {
		return "leon.jsp"; //pagina a desplegar
	//con esto se pasa el objeto vacio
	}

	
	//ruta para capturar los datos del formulario
	@PostMapping("/leon")
	public String registroLeon(@RequestParam(value="Color")String color,
			@RequestParam(value="Sexo")String sexo,
			@RequestParam(value="Edad")Integer edad){
	return "leon.jsp"; //la pagina a desplegar
	}
@PostMapping("/guardarleon")
//Valid y BindingResult es para validar si la informacion que se mete es correcta
public String guardarLeon (@Valid @ModelAttribute("leon")Leon leon,
		BindingResult resultado1,
		Model model) {
	if(resultado1.hasErrors())//es para capturar si hay algun error en el ingreso de datos
		{model.addAttribute("msgError","Debe realizar ingreso correcto de los datos");
		return "leon.jsp";
		
	}
	//enviar el objeto al service
	leonService.saveLeon(leon);                                   
	
	List<Leon> listaLeones = leonService.findAll();
	model.addAttribute("leonesCapturados",listaLeones);
	return "leon2.jsp"; //pagina a desplegar
}

//solo mostrar el listado de autos
	@RequestMapping("/mostrarleon")
	public String mostrar(Model model) {
		//obtener una lista de autos
		List<Leon> listaLeones = leonService.findAll();
		//pasamos la lista de autos al jsp
		model.addAttribute("leonesCapturados", listaLeones);
		return "leon2.jsp";
	}
	
}