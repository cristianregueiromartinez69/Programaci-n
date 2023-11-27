
package boletin16;


public class Revista extends Publicacion{
    
    
    private int numero;

    public Revista(int numero) {
        this.numero = numero;
    }

    public Revista(int numero, int codigo, String titulo, int ano_publicacion) {
        super(codigo, titulo, ano_publicacion);
        this.numero = numero;
    }

    @Override
    public int getAno_publicacion() {
        return this.getAno_publicacion(); 
    }

    @Override
    public int getCodigo() {
        return this.getCodigo(); 
    }

    @Override
    public String toString() {
        return super.toString() + " Revista: " + " numero: " + numero;
    }

   
    
    
    
}
