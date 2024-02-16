
package boletin21;


public class Morcego extends Mamifero implements IPoderVoar {
    
    private float peso;

    public Morcego(float peso, String color) {
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
        System.out.println("Este morcego es capaz de caminar");
    }

    @Override
    public void volar() {
        System.out.println("Este morcego es capaz de volar");
    }
    
    
    
    
}
