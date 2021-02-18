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
public class ProductoAlimenticio extends Producto{
    
    private Date fechaCaducidad;

    public ProductoAlimenticio(String nombre, double precio, String descripcion,int cantidad, Date fechaCaducidad) {
        super(nombre, precio, descripcion,cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }
    
    
    @Override
    public void informacionGeneral(){
        System.out.println("Este es un producto alimenticio");
        System.out.println("Producto: "+ super.getNombre());
        System.out.println("Precio: "+ super.getPrecio());
        System.out.println("Cantidad: "+super.getCantidad());
        System.out.println("Descripcion: "+ super.getDescripcion());
        System.out.println("FechaCaducidad: "+fechaCaducidad.toString());
    }
    
    
}
