
package boletin21;


public class Avestruz extends Aves implements IPodeCamiñar {
    
    private float peso;

    public Avestruz(float peso, String golor) {
        super(golor);
        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    

  
    
    
    
    @Override
    public void volar() {
      
        System.out.println("Esta avestruz es capaz de volar"); 
        
    }

    @Override
    public void camiñar() {
       
        System.out.println("Esta avestruz es capaz de caminar");
        
    }
    
    
    
    
    
    
    
    
    
}
