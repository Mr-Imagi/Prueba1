package com.generationg1.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generationg1.models.Leon;

@Repository
public interface LeonRepository extends JpaRepository<Leon, Long> {
/** la interfaz solo definen los metodos, no los implementan
 * el extends añadido nos permitira trabajar con repositorios incluidos
 * en la T, va el objeto a trabajar, y en el ID el tipo de dato de la foreign key a trbajar
 * en este archivo se trabajar la base de datos, como querys o metodos que se conectan a la base de datos*/
	
}
