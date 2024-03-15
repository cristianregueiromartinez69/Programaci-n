
package examenpracticoprog2ª;


public class AtaquePokemon {
    
    private String nombre;
    private String tipo;
    private float poder;

    public AtaquePokemon() {
    }

    public AtaquePokemon(String nombre, String tipo, float poder) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.poder = poder;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getPoder() {
        return poder;
    }

    public void setPoder(float poder) {
        this.poder = poder;
    }

    @Override
    public String toString() {
        return "\nAtaque: " + "\nnombre: " + nombre + "\ntipo: " + tipo + "\npoder: " + poder;
    }
    
    
    
}
