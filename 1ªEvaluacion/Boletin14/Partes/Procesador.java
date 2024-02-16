
package Partes;


public class Procesador {
    
    private float velocidade;
    private float precio;

    public Procesador() {
    }

    public Procesador(float velocidade, float precio) {
        this.velocidade = velocidade;
        this.precio = precio;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Procesador: " + " velocidade=" + velocidade + ", precio=" + precio;
    }
    
    
    
    
    
    
    
    
    
    
}
