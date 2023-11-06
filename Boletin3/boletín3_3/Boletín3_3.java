
package boletín3_3;

import java.util.Scanner;
public class Boletín3_3 {

   
    
    public static void main(String[] args) {
                int billetes_de_100;
		int billetes_de_20;
		int billetes_de_5;
		int monedas_euro;
		int euros;
		System.out.println("Introduce el número de billetes de 100: ");
		Scanner sc=new Scanner(System.in);
		billetes_de_100=sc.nextInt();
		billetes_de_100=billetes_de_100*100;
		System.out.println("Introduce un número de billetes de 20: ");
		billetes_de_20=sc.nextInt();
		billetes_de_20=billetes_de_20*20;
		System.out.println(" Introduce un número de billetes de 5: ");
		billetes_de_5=sc.nextInt();
		billetes_de_5=billetes_de_5*5;
		System.out.println(" Introduce un número de monedas de 1 euro: ");
		monedas_euro=sc.nextInt();
		euros=billetes_de_100+billetes_de_20+billetes_de_5+monedas_euro;
		System.out.println("La cantidad introducida equivale a: " + euros + " euros");



    }
    
}
