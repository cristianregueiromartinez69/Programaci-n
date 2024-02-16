
package boletin24;


public class Boletin24 {

  
    public static void main(String[] args) {
       
      
  
       	Datos_Equipos d=new Datos_Equipos();
	d.valoresGoles(Goles_Equipos.goles);
       d.GolesDeLosEquipos(Goles_Equipos.goles);
       d.ListaEquiposMenosGoles(Goles_Equipos.goles);
       d.masGolesXJornada(Goles_Equipos.goles);
       d.EquipoyJornadaconMasgoles(Goles_Equipos.goles);
       d.ConsultasEquipos();
  
       
        
        
    }
    
}
