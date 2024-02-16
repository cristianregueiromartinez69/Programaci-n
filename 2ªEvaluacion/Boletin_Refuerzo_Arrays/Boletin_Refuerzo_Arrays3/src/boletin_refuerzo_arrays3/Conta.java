
package boletin_refuerzo_arrays3;
import java.util.Arrays;


public class Conta {
    
    	public void contar3Array(int[]array) {

		int num3=0;
		for(int i=0;i<array.length;i++) {

			array[i]=(int)(Math.random()*30)+1;

			if(array[i]==3) {


				num3++;
			}


		}

		System.out.println("MI array: " + Arrays.toString(array));
		System.out.println("Número de 3 del array: " + num3);



	}


}
