package examenpracticoprog2ª;

import java.util.*;
import javax.swing.*;

public class PokedexImpl implements Pokedex {

    static ArrayList<Pokemon> misPokemon = new ArrayList<>();
    static ArrayList<AtaquePokemon> misAtaques = new ArrayList<>();
    static ArrayList<AtaquePokemon> ataqueActual = new ArrayList <>();
    Menu menu = new Menu();

    @Override
    public void agregarPokemon(String aux_nombre,
            String aux_tipo,
            int aux_nivel,
            String aux_nombre_ataque,
            String aux_tipo_ataque,
            float aux_poder_ataque, Integer velocidad, Integer Ataque_fisico) {
        int indice=0;
        try {
            
            if(misAtaques.isEmpty()){
                misAtaques.add(new AtaquePokemon(aux_nombre_ataque, aux_tipo_ataque, aux_poder_ataque));
                indice++;
            misPokemon.add(new Pokemon(aux_nombre, aux_tipo, aux_nivel, Ataque_fisico, velocidad, misAtaques));
            }
            else{
                for(Pokemon ataques:misPokemon){
                     misPokemon.add(new Pokemon(aux_nombre, aux_tipo, aux_nivel, Ataque_fisico, velocidad, misAtaques));
                    ataques.setListaAtaques(misAtaques);
                    misPokemon.set(indice, ataques);
                    indice++;
                    JOptionPane.showMessageDialog(null, "Pokemon con ataques añadidos correctamente");
            menu.MenuOptions();
                }
            }
              JOptionPane.showMessageDialog(null, "Pokemon con ataques añadidos correctamente");
            menu.MenuOptions();
            
        } catch (RuntimeException e) {
            JOptionPane.showMessageDialog(null, "vaya, ha ocurrido un error, volviendo al menu");
            menu.MenuOptions();

        }

    }

    @Override
    public void buscar(String nombre) {
        if (misPokemon.isEmpty()) {
            JOptionPane.showMessageDialog(null, "vaya, no hay pokemons registrados todavia, volviendo al menu");
                  menu.MenuOptions();
        }
        Boolean marca = false;
        for (Pokemon busca_pokemon : misPokemon) {

            if (nombre.equalsIgnoreCase(busca_pokemon.getNombre())) {
                JOptionPane.showMessageDialog(null, "Pokemon encontrado: " + busca_pokemon.getNombre());
                marca = true;
                      menu.MenuOptions();
            }
        }

        if (marca == false) {
            JOptionPane.showMessageDialog(null, "Pokemon no encontrado, volviendo al menu");
                  menu.MenuOptions();
        }

    }

    @Override
    public void mostrarInformacion(String nombre) {

        if (misPokemon.isEmpty()) {
            JOptionPane.showMessageDialog(null, "vaya, no hay pokemons registrados todavia, volviendo al menu");
                  menu.MenuOptions();
        }
        Boolean marca = false;
        for (Pokemon busca_pokemon : misPokemon) {

            if (nombre.equalsIgnoreCase(busca_pokemon.getNombre())) {
                JOptionPane.showMessageDialog(null, "Pokemon encontrado: " + "\nNombre: " + busca_pokemon.getNombre() + "\nTipo: " + busca_pokemon.getTipo()
                        + "\nNivel: " + busca_pokemon.getNivel() + "\nLista de ataques: " + busca_pokemon.getListaAtaques());
                marca = true;
                      menu.MenuOptions();
            }
        }

        if (marca == false) {
            JOptionPane.showMessageDialog(null, "Pokemon no encontrado, volviendo al menu");
                  menu.MenuOptions();
        }

    }

    public void InfoAdicional(String nombre) {

        if (misPokemon.isEmpty()) {
            JOptionPane.showMessageDialog(null, "vaya, No hay pokemons registrados todavía, volviendo al menu, volviendo al menu");
                  menu.MenuOptions();
        }
        Boolean marca = false;
        int indice=0;
        for (Pokemon busca_pokemon : misPokemon) {

            if (nombre.equalsIgnoreCase(busca_pokemon.getNombre())) {
                JOptionPane.showMessageDialog(null, "Vamos a agregar características nuevas al pokemon");
                Integer aux_ataque_fisico = Libreria.IntPositivo("Introduce el valor del ataque base del pokemon");
                Integer aux_velocidad = Libreria.IntPositivo("Introduce el valor de la velocidad del Pokemon");
                busca_pokemon.setAtaque_fisico(aux_ataque_fisico);
                misPokemon.set(indice, busca_pokemon);
                busca_pokemon.setVelocidad(aux_velocidad);
                misPokemon.set(indice, busca_pokemon);
                JOptionPane.showMessageDialog(null, "Características agregadas correctamente" + misPokemon);
                      menu.MenuOptions();
                

            }
            indice++;
        }

        if (marca == false) {
            JOptionPane.showMessageDialog(null, "Pokemon no encontrado, volviendo al menu");
                  menu.MenuOptions();
        }

    }

}
