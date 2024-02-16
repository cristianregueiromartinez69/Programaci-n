
package boletin21;


public class Gato extends Felino implements IPodeNadar {
    
    private float peso;

    public Gato(float peso, String color) {
        super(peso, color);
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
        
        System.out.println("Este gato puede caminar");
        
    }

    @Override
    public void nadar() {
        
        System.out.println("Este gato es capaz de nadar, anque no le gusta el agua");
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
}
