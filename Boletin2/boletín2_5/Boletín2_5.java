
package boletín2_5;

import java.util.Scanner;
public class Boletín2_5 {

   
    public static void main(String[] args) {
       final float MILLA=1852;
       float d;  float distancia;
       System.out.println("Introduce una distancia: ");
       Scanner sc=new Scanner(System.in);
       d=sc.nextFloat();
       distancia=MILLA*d;
       System.out.println("distancia en metros: " + distancia);
       
    }
    
}
