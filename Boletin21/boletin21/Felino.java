
package boletin21;


public class Felino extends Mamifero implements IPodeNadar{
    
 private float peso;

    public Felino(float peso, String color) {
        super(color);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public void camiñar() {
        System.out.println("Este felino puede caminar");
    }

    @Override
    public void nadar() {
        System.out.println("Este felino puede nadar");
    }
 
 
    
    
    
    
    
    
    
    
    
    
}
