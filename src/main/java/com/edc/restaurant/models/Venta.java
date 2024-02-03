package com.edc.restaurant.models;

import java.util.Date;
import java.util.Set;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Venta {
    private Set<ProductoCantidad> productosOrdenadoPorVenta;
    private Date fecha;
}
