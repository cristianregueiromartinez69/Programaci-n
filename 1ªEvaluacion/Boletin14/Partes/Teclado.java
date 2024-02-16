
package Partes;


public class Teclado {
    
    
 private String marca;
 private float precio;

    public Teclado() {
    }

    public Teclado(String marca, float precio) {
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Teclado: " + " marca=" + marca + ", precio=" + precio + '}';
    }
 
 
    
    
    
    
    
    
    
    
    
}
