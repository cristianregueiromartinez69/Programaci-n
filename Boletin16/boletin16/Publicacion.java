
package boletin16;


public class Publicacion {
    
    
    private int codigo;
    private String titulo;
    private int ano_publicacion;

    public Publicacion() {
    }

    public Publicacion(int codigo, String titulo, int ano_publicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.ano_publicacion = ano_publicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno_publicacion() {
        return ano_publicacion;
    }

    public void setAno_publicacion(int ano_publicacion) {
        this.ano_publicacion = ano_publicacion;
    }

    @Override
    public String toString() {
        return "Publicacion: " + " codigo: " + codigo + ", titulo: " + titulo + ", año de publicacion: " + ano_publicacion;
    }
    
    
    
    
    
    
    
    
}
