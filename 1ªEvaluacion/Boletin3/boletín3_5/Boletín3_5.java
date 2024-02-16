
package boletín3_5;

import java.util.Scanner;
public class Boletín3_5 {

   
    public static void main(String[] args) {
        
        
        
		float sueldo_total,comisión,sueldo_bruto,sueldo_neto,sueldo_fijo;
		int ventas;  int dietas; float km; float irpf;
		System.out.println("Introduce tus ventas, por favor: ");
		Scanner sc=new Scanner(System.in);
		ventas=sc.nextInt();
		ventas=ventas*1000;
		comisión=ventas*5/100;
		sueldo_fijo=20000;
		System.out.println("Introduce los km realizados, por favor: ");
		km=sc.nextFloat();
		km=km*2;
		System.out.println("Introduce la cantidad de días que te desplazaste, por favor: ");
		dietas=sc.nextInt();
		dietas=dietas*30;
		sueldo_total=sueldo_fijo+comisión+km+dietas;
		sueldo_bruto=sueldo_total;
		irpf=sueldo_bruto*18/100;
		sueldo_neto=sueldo_bruto-irpf-36;
		System.out.println("Tu sueldo bruto es de: " + sueldo_bruto + " euros");
		System.out.println("Tu sueldo neto es de: " + sueldo_neto + " euros");

      
    }
    
}
