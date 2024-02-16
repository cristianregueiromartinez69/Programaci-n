
package boletin6_2;
import javax.swing.*;
import java.util.Scanner;
public class Boletin6_2 {


    public static void main(String[] args) {
        
  Satelite sat=new Satelite();
		Scanner sc=new Scanner(System.in);
		System.out.println("Introduce el meridiano, por favor: ");
		sat.setMeridiano(sc.nextDouble());                      // clase Scanner para dar valor
		System.out.println("Introduce el paralelo, por favor: ");
		sat.setParalelo(sc.nextDouble());
		System.out.println("Introduce la distancia a la tierra, por favor: ");
		sat.setDistanciatierra(sc.nextDouble());
		sat.verPosicion();

	    Satelite sat2=new Satelite(Double.parseDouble(JOptionPane.showInputDialog("Introduce el meridiano: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Introduce el paralelo: ")),
				Double.parseDouble(JOptionPane.showInputDialog("Introduce la distancia a la tierra: ")));
                                 //JOptionPane para dar valor
		sat2.verPosicion();



    }
    
}
