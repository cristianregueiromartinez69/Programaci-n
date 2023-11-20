
package Partes;


public class Monitor {
   
    private String marca;
    private int pulgadas;
    private float precio;

    public Monitor() {
    }

    public Monitor(String marca, int pulgadas, float precio) {
        this.marca = marca;
        this.pulgadas = pulgadas;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Monitor: " + " marca=" + marca + ", pulgadas=" + pulgadas + ", precio=" + precio;
    }
    
    
    
    
    
    
    
    
}
