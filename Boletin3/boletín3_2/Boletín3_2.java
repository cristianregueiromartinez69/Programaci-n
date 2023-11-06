
package boletín3_2;

import java.util.Scanner;

public class Boletín3_2 {

 
    public static void main(String[] args) {
       
        float grados_centígrados,grados_farenheit,grados_kelvin;
        System.out.println("Introduce los grados centígrados: ");
        Scanner sc=new Scanner(System.in);
        grados_centígrados=sc.nextFloat();
        grados_farenheit=grados_centígrados*9/5+32;
        System.out.println("Estos " + grados_centígrados + " grados centígrados, son " + 
                grados_farenheit + " grados farenheit");
        System.out.println("Introduce los grados kelvin: ");
        grados_kelvin=sc.nextFloat();
        grados_kelvin=(float)(grados_kelvin-273.15);
        System.out.println("Estos " + grados_centígrados + " grados centígrados, son " + 
                grados_kelvin + " grados kelvin");
                        
        
        
        
        
        
    }
    
}
