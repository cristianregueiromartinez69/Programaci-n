
package boletin_refuerzo_arrays2;

import java.util.Scanner;

public class Boletin_Refuerzo_Arrays2 {


    public static void main(String[] args) {
       
        
       	Ver v=new Ver();

		System.out.println("Introduce el numero de posiciones que quieres que tenga el array: ");
		Scanner sc=new Scanner(System.in);
		int posicion=sc.nextInt();
		int[]num=new int[posicion];

		v.imprimeArray(num);
 
        
        
    }
    
}
