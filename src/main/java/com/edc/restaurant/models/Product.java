package com.edc.restaurant.models;

import java.io.Serializable;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product implements Serializable{
    private String nombre;
    private BigDecimal precio;
    private String descripcion;
    private String icon;
}
