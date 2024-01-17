
package boletin21;


public class Tigre extends Mamifero  implements IPodeNadar{
    
    private float peso;

    public Tigre(float peso, String color) {
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
        System.out.println("Este tigre puede caminar");
    }

    @Override
    public void nadar() {
        System.out.println("Este tigre puede nadar");
    }
    
    
    
    
    
    
    
}
