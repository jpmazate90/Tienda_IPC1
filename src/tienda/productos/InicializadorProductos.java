/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.productos;

import java.util.Date;

/**
 *
 * @author jpmazate
 */
public class InicializadorProductos {

    private static final int TIPOS_PRODUCTOS = 2;

    public Producto[] obtenerProductosVendedor() {
        //creando productos estaticos, estos podrian crearse pidiendolo al usuario para hacerlo dinamico
        ProductoLimpieza axion = new ProductoLimpieza("axion", 20.50, "Bueno para manchas",10, "frambuesa");
        ProductoAlimenticio panBolsa = new ProductoAlimenticio("pan bimbo", 15.99, "Pan blanco",5, new Date());
        
        //creando arreglo a devolver
        Producto[] productosVendedor = new Producto[TIPOS_PRODUCTOS];
        
        productosVendedor[0] = axion;
        productosVendedor[1] = panBolsa;
        return productosVendedor;

    }

}
