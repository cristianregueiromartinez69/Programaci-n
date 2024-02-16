
package boletin17;


public class Persoa {
    
    
  private String nombre;
	   private String apellidos;
	   private String nif;

	    public Persoa() {


	    }

	    public Persoa(String nombre, String apellidos, String nif) {
	        this.nombre = nombre;
	        this.apellidos = apellidos;
	        this.nif = nif;
	    }





	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellidos() {
	        return apellidos;
	    }

	    public void setApellidos(String apellidos) {
	        this.apellidos = apellidos;
	    }

	    public String getNif() {
	        return nif;
	    }

	    public void setNif(String nif) {
	        this.nif = nif;
	    }

	    @Override
	    public String toString() {
	        return "Persoa: " + "\nnombre: " + nombre + ", \napellidos: " + apellidos + ", \nnif: " + nif;
	    }










    
    
    
    
    
    
    
}
