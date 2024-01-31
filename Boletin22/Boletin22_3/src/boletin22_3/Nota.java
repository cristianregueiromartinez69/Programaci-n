
package boletin22_3;
import javax.swing.*;
import java.util.*;
public class Nota {
    
  float[]nota=new float[30];
String[]alumno=new String[30];


public void dameNotas() {


	int aprobar=5;

	for(int i=0;i<nota.length&&i<alumno.length;i++) {

		alumno[i]=JOptionPane.showInputDialog("Introduce el nombre del alumno: ");
		nota[i]=(int)(Math.random()*10)+1;

		if(nota[i]>=aprobar) {

			System.out.println("Alumnos aprobados: " + alumno[i]);


		}



	}


	int indice=5;
	for(int i=0;i<nota.length;i++) {

		if(nota[i]==indice) {

			System.out.println("El alumno: " + alumno[indice] + " tiene una nota de: " + nota[i]);
		}
	}

	String pregunta=JOptionPane.showInputDialog("¿Quieres visualizar la nota de un alumno?" +
	"\nresponde (si) si deseas visualizarla " + "\nresponde (no) si no deseas visualizarla");

	String afirmar="si";
	String negar="no";

	while(pregunta.equalsIgnoreCase(afirmar)) {

		int opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero del alumno (1 al 30) para ver su nota: "));
		while(opcion<1||opcion>30) {
			opcion=Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto, tiene que ser del 1 al 30: "));
		}
		System.out.println("Nombre del alumno: " + alumno[opcion] + " Nota del alumno: " + nota[opcion]);
	     pregunta=JOptionPane.showInputDialog("¿Quieres voler a visualizar la nota de un alumno?" +
				"\nresponde (si) si deseas voler a  visualizarla " + "\nresponde (no) si no deseas volver a  visualizarla");
	}

	Arrays.sort(nota);
	JOptionPane.showMessageDialog(null, "Lista de notas ordenada por orden creciente: "
			+ Arrays.toString(nota));



}



    
    
}
