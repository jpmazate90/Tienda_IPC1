/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.personas;

import tienda.productos.Producto;

/**
 *
 * @author jpmazate
 */
public class InicializadorPersonas {
    
    
    public Cliente crearCliente(String dpi,int edad, String nombre){
        Cliente cliente = new Cliente(dpi, edad, nombre);
        return cliente;
    }
    
    public Vendedor crearVendedor(String dpi,int edad, String nombre,Producto[] productos){
        Vendedor vendedor = new Vendedor(dpi, edad, nombre,productos);
        return vendedor;
    }
    
}
