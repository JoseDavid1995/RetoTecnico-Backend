package com.prueba.demo.support.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductoInDto {
    
    private Long idProduct;
    private Integer quantity;

    
}
