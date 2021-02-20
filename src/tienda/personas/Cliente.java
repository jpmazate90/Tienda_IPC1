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
public class Cliente extends Persona {

    private final int TAMANIO_INICIAL = 0;
    private Producto[] productosComprados;

    public Cliente(String dpi, int edad, String nombre) {
        super(dpi, edad, nombre);
        productosComprados = new Producto[TAMANIO_INICIAL];
    }

    public void agregarProducto(Producto productoAComprar) {
        this.productosComprados = aumentarArreglo();
        this.productosComprados[this.productosComprados.length - 1] = productoAComprar;
    }

    public Producto[] aumentarArreglo() {
        Producto[] arregloAuxiliar = new Producto[this.productosComprados.length + 1];
        for (int i = 0; i < this.productosComprados.length; i++) {
            arregloAuxiliar[i] = this.productosComprados[i];
        }
        return arregloAuxiliar;
    }

    public void mostrarProductosCliente() {
        System.out.println("-----------PRODUCTOS COMPRADOS------------");
        for (int i = 0; i < productosComprados.length; i++) {
            System.out.println("---------------------------------------");
            System.out.println("Producto #" + (i + 1));
            productosComprados[i].mostrarInfoCliente();
        }
    }

}
