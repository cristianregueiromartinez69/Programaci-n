
package boletin7_4;
import java.util.Scanner;

public class Boletin7_4 {

   
    public static void main(String[] args) {
      
      Peso obj4=new Peso();
		System.out.println("Introduce un nombre: ");
		Scanner sc=new Scanner(System.in);
		obj4.dameNombre1(sc.next());
		System.out.println("Introduce un nombre: ");
		obj4.dameNombre2(sc.next());
		System.out.println("Introduce el peso del primer nombre: ");
		obj4.damePeso1(sc.nextDouble());
		System.out.println("Introduce el peso del segundo nombre: ");
		obj4.damePeso2(sc.nextDouble());
		obj4.dimeDatos();
		obj4.dimeDiferencia();

  
        
        
        
    }
    
}
