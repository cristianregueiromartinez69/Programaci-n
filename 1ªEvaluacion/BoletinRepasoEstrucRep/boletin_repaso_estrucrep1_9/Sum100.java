
package boletin_repaso_estrucrep1_9;
import java.util.Scanner;

public class Sum100 {
    
   	private int num;
	private int sum;
	public void cuentaNumeros() {
		sum=0;
		System.out.println("Escribe números: ");
		Scanner sc=new Scanner(System.in);
		while(sum<=100) {
			num=sc.nextInt();
			sum=sum+num;
		}

		System.out.println("El resultado es: " + sum); 
    
    
    
    
}
}