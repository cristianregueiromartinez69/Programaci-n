
package examenpracticoprog2ª;
import java.util.*;
import javax.swing.*;

public class Menu {
    
    private static final int AGREGAR_POKEMON = 1;
    private static final int BUSCAR_POKEMON = 2;
    private static final int MOSTRAR_INFO_POKEMON = 3;
    private static final int AÑADIR_CARACTERÍSTICAS_POKEMON= 4;
    private static final int APAGAR_POKEDEX = 5;
    
    public Menu(){
        
    }
    
    public void MenuOptions(){
        int opcion;
        PokedexImpl misOperaciones = new PokedexImpl();
        Menu menu = new Menu();
        
            do{
                
          
            opcion=Libreria.IntPositivo("BIENVENIDO A LA POKEDEX DE OAK, SOY ROTOM, INTRODUCE LA OPCION QUE MÁS DESEAS: " + 
                    "\n opcion 1: agregar un pokemon a la pokedex" + "\nopcion 2: buscar un pokemon en la pokedex" + "\nopcion 3: mostrar informacion de un pokemon" + 
                    "\nopcion 4: Añadir caracteristicas nuevas a un pokemon ya registrado" + "\nopcion 5: salir y bye rotom");
              }while(opcion<0&&opcion>5);
            
            switch(opcion){
                
                case AGREGAR_POKEMON:
                    try{
                    
                    misOperaciones.agregarPokemon(JOptionPane.showInputDialog("Introduce un nombre para el nuevo pokemon: "), JOptionPane.showInputDialog("Introduce un tipo para el nuevo pokemon: "), Libreria.IntPositivo("Introduce el nivel del pokemon"), JOptionPane.showInputDialog("Introduce el nombre del ataque del pokemon: "), JOptionPane.showInputDialog("Introduce el tipo de ataque del pokemon: "), Libreria.FloatPositivo("Introduce el poder de ataque del tipo para el pokemon: "), Libreria.IntPositivo("Introduce la velocidad del pokemon base: "), Libreria.IntPositivo("Introduce el ataque fisico del pokemon base"));
                }catch(RuntimeException e){
                    JOptionPane.showMessageDialog(null, "Vaya, ha ocurrido un error, volviendo al menu");
                    menu.MenuOptions();
                    
                }
                    break;
                case BUSCAR_POKEMON:
                    misOperaciones.buscar(JOptionPane.showInputDialog("Introduce el nombre dle pokemon que quieres buscar: " + PokedexImpl.misPokemon));
                    break;
                case MOSTRAR_INFO_POKEMON:
                    misOperaciones.mostrarInformacion(JOptionPane.showInputDialog("Introduce el nombre dle pokemon que quieres buscar toda la informacion: " + PokedexImpl.misPokemon));
                    break;
                case AÑADIR_CARACTERÍSTICAS_POKEMON:
                    misOperaciones.InfoAdicional(JOptionPane.showInputDialog("Introduce el nombre del pokemon del que quieres agregar caracteristicas adicionales: " + PokedexImpl.misPokemon));
                    break;
                case APAGAR_POKEDEX:
                    JOptionPane.showMessageDialog(null, "HASTA LUEGO ROTOM");
                    System.exit(0);
                    break;
                
            }
       
            
            
        }
        
        
        
        
    }
    
    
    

