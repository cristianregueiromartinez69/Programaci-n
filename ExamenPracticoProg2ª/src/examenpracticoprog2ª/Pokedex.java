package examenpracticoprog2ª;

public interface Pokedex {

    void agregarPokemon(String aux_nombre,
            String aux_tipo,
            int aux_nivel,
            String aux_nombre_ataque,
            String aux_tipo_ataque,
            float aux_poder_ataque, Integer Ataque_fisico, Integer velocidad);

    void buscar(String nombre);

    void mostrarInformacion(String nombre);

}
