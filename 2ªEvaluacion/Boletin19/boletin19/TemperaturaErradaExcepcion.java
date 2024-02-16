
package boletin19;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class TemperaturaErradaExcepcion{
    
    
    private boolean temperatura_correcta=false;

public void dameExcepcion() {

	while(!temperatura_correcta) {
		try {
		System.out.print("Introduce una temperatura en grados centigrados: ");
		Scanner sc=new Scanner(System.in);
		float grado_cent=sc.nextFloat();

		if(grado_cent<ConversorTemperaturas.GRADO_FALLO) {

			 throw new IllegalArgumentException("No se puede trabajar con esta temperatura");
		}

		int opcion=Integer.parseInt(JOptionPane.showInputDialog("¿Quieres pasarlo a grados fharenheit o a grados reamur?" +
				"\nOpcion 1: Grados fharenheit" + "\nOpcion 2: Grados reamur" ));

		switch(opcion) {

		case 1: ConversorTemperaturas.centigradosAFharenheit(grado_cent);
		temperatura_correcta=true;
		break;
		case 2: ConversorTemperaturas.centigradosAReamur(grado_cent);
		temperatura_correcta=true;
		break;
		default: System.out.println("Opcion incorrecta, volviendo al principio");
		TemperaturaErradaExcepcion t1=new TemperaturaErradaExcepcion();
		t1.dameExcepcion();
		}



		} catch (NumberFormatException e) {

            System.out.println("No es un grado válido. Por favor, intenta de nuevo.");

        } catch (IllegalArgumentException e) {

            System.out.println(e.getMessage() + ". Por favor, intenta de nuevo.");
	}




}













}
    
    
    
    
    
    
    
    
    
    

  }  
    
    
    
    
    

