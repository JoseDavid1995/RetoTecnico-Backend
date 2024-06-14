package com.prueba.demo.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.demo.core.entity.Estudiante;
import com.prueba.demo.repository.EstudianteRepository;
import com.prueba.demo.service.EstudianteService;
import com.prueba.demo.support.dto.Respuesta;

@Service
public class EstudianteServiceImpl implements EstudianteService {
 

	@Autowired
	EstudianteRepository estudianteRepository;

 
 

	@Override
	public Respuesta<?> getListarEstudiante() throws Exception {

		
		List<Estudiante> response = estudianteRepository.findAll();

		List<Estudiante> listaEstudiantes = new ArrayList<>();

		for (Estudiante estudiante : response) {
			if (estudiante.getEstado() == 0) {
				listaEstudiantes.add(estudiante);
			}
		}
		return new Respuesta<>(true, listaEstudiantes);
	}

 

	@Override
	public Respuesta<?> registrarEstudiante(Estudiante estudiante) throws Exception {

		if (estudiante.getId() == null) {
			estudianteRepository.save(estudiante);
		}
		return new Respuesta<>(true, "Se registró correctamente");
	}

	@Override
	public Respuesta<?> updateEstudiante(Long id, Estudiante estudiante) throws Exception {

		
		Optional<Estudiante>  p =  estudianteRepository.findById(id); 	
		
		if (p.isPresent()) {
			p.get().setNombre(estudiante.getNombre());
			p.get().setApellido(estudiante.getApellido());
			p.get().setEmail(estudiante.getEmail());
			p.get().setCreditos(estudiante.getCreditos());
			p.get().setSemestre(estudiante.getSemestre());
			p.get().setPromedio(estudiante.getPromedio());
			estudianteRepository.save(p.get());
		}
 
		return new Respuesta<>(true, "Se actualizó correctamente");
	}


	@Override
	public Respuesta<?> eliminarEstudiante(Long id) throws Exception {

		
		Optional<Estudiante>  p =  estudianteRepository.findById(id); 	
		
		if (p.isPresent()) {
			p.get().setEstado(1);
		
			estudianteRepository.save(p.get());
		}
 
		return new Respuesta<>(true, "Se borró correctamente");
	}
 
}