
package boletin16;


public class Libro extends Publicacion {
    
    private boolean prestado;

    public Libro(boolean prestado) {
        this.prestado = prestado;
    }

    public Libro(int codigo, String titulo, int ano_publicacion) {
        super(codigo, titulo, ano_publicacion);
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
        return super.toString() + " Libro: " + " prestado: " + prestado;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
