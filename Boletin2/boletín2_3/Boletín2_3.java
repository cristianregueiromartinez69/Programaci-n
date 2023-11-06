
package boletín2_3;

import java.util.*;
public class Boletín2_3 {

    
    public static void main(String[] args) {
        
        float euro,dolar,cambio;
       
        System.out.println(" Introduce un valor de euro: ");
        Scanner sc=new Scanner(System.in);
        euro=sc.nextFloat();
        System.out.println("introduce el cambio: ");
        cambio=sc.nextFloat();
        dolar=euro*cambio;
        System.out.println("tus " + euro + " euros, son " + dolar + " dolares");
        System.out.println(euro +"euros ="+(euro*cambio)+"dolares");
        
    }
    
}
