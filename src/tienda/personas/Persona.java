/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tienda.personas;

/**
 *
 * @author jpmazate
 */
public class Persona {
    
    private String dpi;
    private int edad;
    private String nombre;

    public Persona(String dpi, int edad, String nombre) {
        this.dpi = dpi;
        this.edad = edad;
        this.nombre = nombre;
    }
    
   

    public String getDpi() {
        return dpi;
    }

    public void setDpi(String dpi) {
        this.dpi = dpi;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public void mostrarDatosPersonales(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Edad: "+this.edad);
        System.out.println("Dpi: "+this.dpi);
    }
    
    
    
}
