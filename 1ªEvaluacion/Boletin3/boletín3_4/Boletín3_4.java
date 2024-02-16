
package boletín3_4;
import java.util.Scanner;
public class Boletín3_4 {

   
    public static void main(String[] args) {

        
        	int cant_euros;
		int billetes_100,billetes_20,billetes_5,monedas_euro;
		System.out.println("Introduce la cantidad que deseas desglosar: ");
		Scanner sc=new Scanner(System.in);
		cant_euros=sc.nextInt();
		billetes_100=cant_euros/100;
		billetes_20=cant_euros/20;
		billetes_5=cant_euros/5;
		monedas_euro=cant_euros;
		System.out.println("tus " + cant_euros + "euros" +  " se desglosan de la siguiente manera: ");
		System.out.println("tus billetes de 100 son: " + billetes_100);
		System.out.println("tus billetes de 20 son: " + billetes_20);
		System.out.println("tus billetes de 5 son: " + billetes_5);
		System.out.println("tus monedas de 1 euro son: " + monedas_euro);

    }
    
}
