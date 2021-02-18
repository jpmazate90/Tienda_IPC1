package tienda.personas;

import tienda.productos.Producto;

/**
 *
 * @author jpmazate
 */
public class Vendedor extends Persona{
    
    private Producto[] inventario;
    private double dinero;
    
    public Vendedor(String dpi, int edad, String nombre, Producto[] inventario) {
        super(dpi, edad, nombre);
        this.inventario = inventario;
        this.dinero = 0;
    }

    public Producto[] getInventario() {
        return inventario;
    }

    public void setInventario(Producto[] inventario) {
        this.inventario = inventario;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
    
    
    
    public boolean venderProducto(int posicion){
        if(posicion >= inventario.length || posicion <0){
            System.out.println("Ese producto no existe, selecciona otro por favor");
            return false;
        }else if(inventario[posicion].getCantidad() < 1){
                System.out.println("No hay mas productos en inventario");
                return false;
        }else{
            inventario[posicion].setCantidad(inventario[posicion].getCantidad()-1);
            this.dinero = this.dinero + inventario[posicion].getPrecio();
            return true;
        }
        
    }
    
    
    public void mostrarDatosPersonales(){
        System.out.println("Nombre: "+super.getNombre());
        System.out.println("Dpi: "+super.getDpi());
        System.out.println("Edad: "+super.getEdad());
        System.out.println("Dinero actual: "+this.dinero);
    }
    
    public void mostrarProductos(){
        for (int i = 0; i < inventario.length; i++) {
            System.out.println(i+".-: ");
            inventario[i].informacionGeneral();
        }
    }
    
    
    
    
    
}
