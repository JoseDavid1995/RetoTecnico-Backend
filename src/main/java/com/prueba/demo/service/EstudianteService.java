package com.prueba.demo.service;
 
import com.prueba.demo.core.entity.Estudiante;
import com.prueba.demo.support.dto.Respuesta;
 

public interface EstudianteService {

	Respuesta<?> getListarEstudiante() throws Exception;
	Respuesta<?> registrarEstudiante(Estudiante product) throws Exception;
	Respuesta<?> updateEstudiante(Long id, Estudiante estudiante) throws Exception ;
	Respuesta<?> eliminarEstudiante(Long id) throws Exception;

}
