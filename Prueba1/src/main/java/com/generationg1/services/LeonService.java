package com.generationg1.services;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generationg1.models.Leon;
import com.generationg1.repositories.LeonRepository;

@Service
public class LeonService {
	//llamar al repositorio
	@Autowired
	LeonRepository leonRepository;
	
	//guardar el auto
	public void saveLeon(@Valid Leon leon) {
		// TODO Auto-generated method stub
		leonRepository.save(leon);
	}

// obtener la lista de autos
	public List<Leon> findAll() {
		
		return leonRepository.findAll();
	}


	/**Logica de negocio,o validaciones del sistema
	 * desde aqui se puede llamar al repository y sus metodos**/

}