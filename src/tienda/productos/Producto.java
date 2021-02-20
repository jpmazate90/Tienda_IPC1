/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.productos;

/**
 *
 * @author jpmazate
 */
public class Producto {

    private String nombre;
    private double precio;
    private String descripcion;
    private int cantidad;

    public Producto(String nombre, double precio, String descripcion, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void informacionGeneral() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Descripcion: " + descripcion);
    }

    public void mostrarInfoCliente() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: " + precio);
        System.out.println("Descripcion: " + descripcion);
    }

}
