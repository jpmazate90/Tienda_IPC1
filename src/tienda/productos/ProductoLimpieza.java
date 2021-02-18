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
public class ProductoLimpieza extends Producto{
    
    private String olor;

    public ProductoLimpieza(String nombre, double precio, String descripcion, int cantidad,String olor) {
        super(nombre, precio, descripcion, cantidad);
        this.olor = olor;
    }

     

     

    
    @Override
    public void informacionGeneral(){
        System.out.println("Este es un producto de limpieza");
        System.out.println("Producto: "+ super.getNombre());
        System.out.println("Precio: "+ super.getPrecio());
        System.out.println("Cantidad: "+super.getCantidad());
        System.out.println("Descripcion: "+ super.getDescripcion());
        System.out.println("Olor: "+olor);
    }
    
    

    public String getOlor() {
        return olor;
    }

    public void setOlor(String olor) {
        this.olor = olor;
    }
    
    
    
}
