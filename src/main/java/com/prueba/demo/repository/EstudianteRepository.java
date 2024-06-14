package com.prueba.demo.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.demo.core.entity.Estudiante;


 
public interface EstudianteRepository extends JpaRepository<Estudiante, Long>{
 
}