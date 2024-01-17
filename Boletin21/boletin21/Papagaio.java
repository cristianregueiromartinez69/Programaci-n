
package boletin21;


public class Papagaio extends Aves implements IPodeCamiñar{
    
   private float peso;

    public Papagaio(float peso, String color) {
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
        System.out.println("Este papagayo es capaz de caminar");
    }

    @Override
    public void volar() {
        System.out.println("Este papagayo es capaz de volar");
    }
   
   
    
    
    
    
    
    
    
    
    
    
    
}
