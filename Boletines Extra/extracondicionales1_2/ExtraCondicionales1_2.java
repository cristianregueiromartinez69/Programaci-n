
package extracondicionales1_2;
import java.util.Scanner;

public class ExtraCondicionales1_2 {

  
    public static void main(String[] args) {
       
        Uva fruta=new Uva();
		System.out.println("Establece el precio inicial: ");
		Scanner sc=new Scanner(System.in);
		fruta.establecePrecio(sc.nextDouble());
		System.out.println("Establece tipo y tamaño: ");
		fruta.estableceVenta(sc.next().charAt(0), sc.nextInt());
        
        
    }
    
}
