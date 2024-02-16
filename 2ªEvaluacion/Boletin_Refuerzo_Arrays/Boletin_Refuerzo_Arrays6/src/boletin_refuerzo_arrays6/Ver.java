
package boletin_refuerzo_arrays6;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Ver {
    
    
    public void contar3e5Array(int[]array) {

		int num3=0;
		int num5=0;
		for(int i=0;i<array.length;i++) {

			array[i]=(int)(Math.random()*30)+1;

			if(array[i]==3) {


				num3++;
			}

			else if(array[i]==5) {


				num5++;
			}




		}

		if(num5!=0) {

		JOptionPane.showMessageDialog(null, "Numeros 5 encontrados: " + num5);

		}

		else if(num5==0) {

			JOptionPane.showMessageDialog(null, "Lo sentimos, no se ha encontrado ningún 5");
		}

		System.out.println("Mi array: " + Arrays.toString(array));
		System.out.println("Número de 3 del array: " + num3);



	}

	public void verArray(int array[]) {

		for(int i=0;i<array.length;i++) {

			array[i]=(int)(Math.random()*100)+1;



		}

		System.out.println("Los elementos del array: " + Arrays.toString(array));

	}







    
}
