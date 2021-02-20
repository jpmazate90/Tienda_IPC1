/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.tiendas;

import java.util.Scanner;
import tienda.personas.Cliente;
import tienda.personas.Vendedor;

/**
 *
 * @author jpmazate
 */
public class Mercado {

    private Cliente cliente;
    private Vendedor vendedor;
    private Scanner scan = new Scanner(System.in);

    public void iniciarMercado() {

        boolean salir = false;
        int opcion;
        do {

            System.out.println("\nBIENVENIDO AL MERCADO \n");
            System.out.println("1.- Mostrar Productos del Vendedor");
            System.out.println("2.- Mostrar Productos que tiene el cliente");
            System.out.println("3.- Comprar producto");
            System.out.println("4.- Salir");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    mostrarVendedor();
                    break;
                case 2:
                    mostrarCliente();
                    break;
                case 3:
                    comprarProducto();
                    break;
                case 4:
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida, selecciona otra por favor");
                    break;
            }

        } while (salir == false);

    }

    public Mercado(Cliente cliente, Vendedor vendedor) {
        this.cliente = cliente;
        this.vendedor = vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public void comprarProducto() {
        int numeroProducto;
        boolean finalizado = false;
        do {
            System.out.println("\nSelecciona que producto quieres:");
            vendedor.mostrarProductos();
            numeroProducto = scan.nextInt();
            finalizado = vendedor.venderProducto(numeroProducto);
            
            if(finalizado){
                cliente.agregarProducto(vendedor.getInventario()[numeroProducto]);   
            }
        } while (finalizado == false);
        

    }

    public void mostrarVendedor() {
        vendedor.mostrarDatosPersonales();
        vendedor.mostrarProductos();
    }

    public void mostrarCliente() {
        cliente.mostrarDatosPersonales();
        cliente.mostrarProductosCliente();
    }

}
