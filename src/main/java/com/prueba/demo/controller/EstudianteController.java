package com.prueba.demo.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.demo.core.entity.Estudiante;
import com.prueba.demo.service.EstudianteService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/estudiante")
@Api(value = "HelloWorld Resource", description = "shows hello world")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {

	private static final Logger log = LoggerFactory.getLogger(EstudianteController.class);

	@Autowired
	private EstudianteService estudianteService;
 
	@ApiOperation(value = "Listar Estudiante")
	@RequestMapping(value = "/getListarEstudiante", method = RequestMethod.GET)
	public ResponseEntity<Object> getListarEstudiante() { 

		try {
			return ResponseEntity.ok(estudianteService.getListarEstudiante());
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return new org.springframework.http.ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}

	@ApiOperation(value = "registrar Estudiante")
	@RequestMapping(value = "/registrarEstudiante", method = RequestMethod.POST)
	public ResponseEntity<Object> registrarEstudiante(@Valid @RequestBody Estudiante dto) { 

		try {
			return ResponseEntity.ok(estudianteService.registrarEstudiante(dto));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return new org.springframework.http.ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}

	@ApiOperation(value = "actualizar Estudiante")
	@RequestMapping(value = "/actualizarEstudiante/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Object> actualizarEstudiante(@PathVariable("id") Long id, @Valid @RequestBody Estudiante dto) { 

		try {
			return ResponseEntity.ok(estudianteService.updateEstudiante(id, dto));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return new org.springframework.http.ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}

	@ApiOperation(value = "Eliminar Estudiante")
	@RequestMapping(value = "/eliminarEstudiante/{idEstudiante}", method = RequestMethod.PUT)
	public ResponseEntity<Object> eliminarEstudiante(@PathVariable("idEstudiante") Long id) { 

		try {
			return ResponseEntity.ok(estudianteService.eliminarEstudiante(id));
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			return new org.springframework.http.ResponseEntity<>(e, HttpStatus.BAD_REQUEST);
		}
	}
 

 
}
