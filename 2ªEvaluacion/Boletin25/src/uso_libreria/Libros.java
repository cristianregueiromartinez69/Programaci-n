
package uso_libreria;


public class Libros {
    
   //clase libros con sus atributos, getter y setter y sus constructores

	  private String titulo;
	    private String autor;
	    private String ISBN;
	    private float prezo;
	    private int numero_unidades;

	    public Libros() {

	    }

	    public Libros(String titulo, String autor, String ISBN, float prezo, int numero_unidades) {

	        this.titulo = titulo;
	        this.autor = autor;
	        this.ISBN = ISBN;
	        this.prezo = prezo;
	        this.numero_unidades = numero_unidades;

	    }

	    public String getTitulo() {
	        return titulo;
	    }

	    public void setTitulo(String titulo) {
	        this.titulo = titulo;
	    }

	    public String getAutor() {
	        return autor;
	    }

	    public void setAutor(String autor) {
	        this.autor = autor;
	    }

	    public String getISBN() {
	        return ISBN;
	    }

	    public void setISBN(String ISBN) {
	        this.ISBN = ISBN;
	    }

	    public float getPrezo() {
	        return prezo;
	    }

	    public void setPrezo(float prezo) {
	        this.prezo = prezo;
	    }

	    public int getNumero_unidades() {
	        return numero_unidades;
	    }

	    public void setNumero_unidades(int numero_unidades) {
	        this.numero_unidades = numero_unidades;
	    }

	    @Override
	    public String toString() {
	        return "Libro: " + "\ntitulo: " + titulo + "\nautor: " + autor + "\nISBN: " + ISBN + "\nprezo: " + prezo + "\nunidades: " + numero_unidades;
	    }











    
    
    
    
    
}
