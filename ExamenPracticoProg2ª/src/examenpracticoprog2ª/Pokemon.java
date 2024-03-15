
package examenpracticoprog2ª;
import java.util.*;

public class Pokemon {
    
    private String nombre;
    private String tipo;
    private int nivel;
    private int Ataque_fisico;
    private int velocidad;
    private ArrayList <AtaquePokemon> listaAtaques;

    public Pokemon() {
    }

    public Pokemon(String nombre, String tipo, int nivel, Integer Ataque_fisico, Integer velocidad, ArrayList<AtaquePokemon> listaAtaques) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nivel = nivel;
        this.Ataque_fisico = Ataque_fisico;
        this.velocidad = velocidad;
        this.listaAtaques = listaAtaques;
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

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public ArrayList<AtaquePokemon> getListaAtaques() {
        return listaAtaques;
    }

    public void setListaAtaques(ArrayList<AtaquePokemon> listaAtaques) {
        this.listaAtaques = listaAtaques;
    }

    public Integer getAtaque_fisico() {
        return Ataque_fisico;
    }

    public void setAtaque_fisico(Integer Ataque_fisico) {
        this.Ataque_fisico = Ataque_fisico;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    
    @Override
    public String toString() {
        return "\nPokemon: " + "\nnombre: " + nombre + "\ntipo: " + tipo + "\nnivel: " + nivel + "\nlistaAtaques: " + listaAtaques + "\nAtaque fisico base del pokemon: " + Ataque_fisico + "\nvelocidad base del pokemon: " + velocidad;
    }
    
    
    
}
