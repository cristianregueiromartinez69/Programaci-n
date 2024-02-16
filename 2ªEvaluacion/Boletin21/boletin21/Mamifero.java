
package boletin21;


public abstract class Mamifero implements IPodeCamiñar {
    
    private String color;

    public Mamifero(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public abstract void camiñar();
    
    
    
    
    
    
    
    
    
    
    
    
    
}
