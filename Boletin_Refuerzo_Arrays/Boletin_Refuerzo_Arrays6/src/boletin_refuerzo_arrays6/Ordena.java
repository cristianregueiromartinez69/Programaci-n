
package boletin_refuerzo_arrays6;

import java.util.Arrays;


public class Ordena {
    
    
    public String ordenarElementosArray(int array[]) {

		for(int i=0;i<array.length;i++) {

			array[i]=(int)(Math.random()*100)+1;

		}

		System.out.println("Array sin ordenar: " + Arrays.toString(array));

		Arrays.sort(array);
		System.out.print("Array ordenado: ");
		return Arrays.toString(array);


	}
    
}
