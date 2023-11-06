
package boletín2_4;
import java.util.Scanner;

public class Boletín2_4 {

    
    public static void main(String[] args) {
        
        float num1,num2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce un número: ");
        num1=sc.nextFloat();
        System.out.println("Introduce un número");
        num2=sc.nextFloat();
        float resultado_suma=num1+num2;
        float resultado_resta=num1-num2;
        float resultado_producto=num1*num2;
        float resultado_división=num1/num2;
        
        System.out.println("el resultado de la suma es: " + resultado_suma);
        System.out.println("el resultado de la resta es: " + resultado_resta);
        System.out.println("el resultado del producto es: " + resultado_producto);
        System.out.println("el resultado de la división es: " + resultado_división);
        
        
       
    }
    
}
