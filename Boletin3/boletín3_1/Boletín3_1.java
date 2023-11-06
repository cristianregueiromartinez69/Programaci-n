
package boletín3_1;
import java.util.Scanner;
public class Boletín3_1 {

   
    public static void main(String[] args) {
        
        float precio_tarifa,precio_pagado,porcentaje_descuento,resultado;
        
        System.out.println("Introduce el precio de la tarifa: ");
        Scanner sc=new Scanner(System.in);
        precio_tarifa=sc.nextFloat();
        System.out.println("Introduce el precio pagado: ");
        precio_pagado=sc.nextFloat();
        resultado=precio_tarifa-precio_pagado;
        porcentaje_descuento=resultado/precio_tarifa*100;
        System.out.println("El porcentaje de descuento es: " + porcentaje_descuento);
        
        
       
        
        
        
    }
    
}
