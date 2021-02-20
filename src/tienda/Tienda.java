/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda;

import java.util.Date;
import tienda.personas.Cliente;
import tienda.personas.InicializadorPersonas;
import tienda.personas.Vendedor;
import tienda.productos.InicializadorProductos;
import tienda.productos.Producto;
import tienda.productos.ProductoAlimenticio;
import tienda.productos.ProductoLimpieza;
import tienda.tiendas.Mercado;

/**
 *
 * @author jpmazate
 */
public class Tienda {

    /**
     * @param args the command line arguments
     */
    static InicializadorPersonas inicializadorPersonas = new InicializadorPersonas();
    static InicializadorProductos inicializadorProductos = new InicializadorProductos();

    public static void main(String[] args) {

        Cliente cliente1 = inicializadorPersonas.crearCliente("2929383834545", 25, "cliente 1");
        Vendedor vendedor1 = inicializadorPersonas.crearVendedor("2828393947483", 30, "vendedor 1", inicializadorProductos.obtenerProductosVendedor());

        Mercado mercado = new Mercado(cliente1, vendedor1);
        mercado.iniciarMercado();
        

    }

}
