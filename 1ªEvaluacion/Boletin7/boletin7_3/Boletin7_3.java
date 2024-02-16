
package boletin7_3;
import java.util.Scanner;
public class Boletin7_3 {

  
    public static void main(String[] args) {
        
       	Signo obj3=new Signo();
		System.out.println("Introduce un número: ");
		Scanner sc=new Scanner(System.in);
		obj3.setNum1(sc.nextInt());
		obj3.dameSignos();
 
        
        
        
    }
    
}
