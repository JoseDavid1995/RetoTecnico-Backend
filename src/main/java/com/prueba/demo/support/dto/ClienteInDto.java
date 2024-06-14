package com.prueba.demo.support.dto;

import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ClienteInDto {
    
    @NotBlank
    private String nombre;

    @NotBlank
    private String apellidoPaterno;

    @NotBlank
    private String apellidoMaterno;
 
}
