
package boletin22_4;
import java.util.Scanner;
import javax.swing.*;

public class Nif {
    

private int dni;
	int[]letra= {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22};

	public void dameLetra() {

		dni=Integer.parseInt(JOptionPane.showInputDialog("Introduce 8 digitos: "));
		String comprobar=Integer.toString(dni);
		int f=8;
		while(f!=comprobar.length()) {

			dni=Integer.parseInt(JOptionPane.showInputDialog("No hay 8 digitos, vuelve a introducirlo: "));
			 comprobar=Integer.toString(dni);
		}

		float divide=dni%23f;
		int division=(int)divide;
		System.out.println(division);

		if(letra[3]==division) {

			System.out.println("El dni es: " + dni + "A");
		}

		else if(letra[11]==division) {

			System.out.println("El dni es: " + dni + "B");

		}
		else if(letra[20]==division) {

			System.out.println("El dni es: " + dni + "C");

		}
		else if(letra[9]==division) {

			System.out.println("El dni es: " + dni + "D");

		}
		else if(letra[22]==division) {

			System.out.println("El dni es: " + dni + "E");

		}
		else if(letra[7]==division) {

			System.out.println("El dni es: " + dni + "F");

		}
		else if(letra[4]==division) {

			System.out.println("El dni es: " + dni + "G");

		}
		else if(letra[18]==division) {

			System.out.println("El dni es: " + dni + "H");

		}
		else if(letra[13]==division) {

			System.out.println("El dni es: " + dni + "J");

		}
		else if(letra[21]==division) {

			System.out.println("El dni es: " + dni + "K");

		}
		else if(letra[19]==division) {

			System.out.println("El dni es: " + dni + "L");

		}
		else if(letra[5]==division) {

			System.out.println("El dni es: " + dni + "M");

		}
		else if(letra[12]==division) {

			System.out.println("El dni es: " + dni + "N");

		}
		else if(letra[8]==division) {

			System.out.println("El dni es: " + dni + "P");

		}
		else if(letra[16]==division) {

			System.out.println("El dni es: " + dni + "Q");

		}
		else if(letra[1]==division) {

			System.out.println("El dni es: " + dni + "R");

		}
		else if(letra[15]==division) {

			System.out.println("El dni es: " + dni + "S");

		}
		else if(letra[0]==division) {

			System.out.println("El dni es: " + dni + "T");

		}
		else if(letra[17]==division) {

			System.out.println("El dni es: " + dni + "V");

		}
		else if(letra[2]==division) {

			System.out.println("El dni es: " + dni + "W");

		}
		else if(letra[10]==division) {

			System.out.println("El dni es: " + dni + "X");

		}
		else if(letra[6]==division) {

			System.out.println("El dni es: " + dni + "Y");

		}
		else if(letra[14]==division) {

			System.out.println("El dni es: " + dni + "Z");

		}

	}

















    
}
    
    
    
    
    
    

