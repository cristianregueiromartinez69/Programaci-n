
package extras3_1;
import javax.swing.*;

public class Paddel {
    
private float cota;
	private float desconto;
	private int edad;
	private int socio;

	public void establecePrecios() {

  cota=800;
		edad=LerDatos.lerEnteiro("Introduce la edad: ");
         while(edad<=65) {
        	 edad=LerDatos.lerEnteiro("Introduce la edad: ");
         }
		if(edad>65) {
			desconto=(40*800)/100;
			cota=cota-desconto;
			System.out.println("La cuota para los mayores de 65 años es de: " + cota);


		}
	   edad=LerDatos.lerEnteiro("Introduce la edad: ");
		while(edad>=21) {
			 edad=LerDatos.lerEnteiro("Introduce la edad: ");
		}
			socio=Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 si tienes padres socios. Introduce 2 si no es así "));
			while(socio>2) {
				socio=Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 si tienes padres socios. Introduce 2 si no es así "));
			}
		   while(socio<1) {
			   socio=Integer.parseInt(JOptionPane.showInputDialog("Introduce 1 si tienes padres socios. Introduce 2 si no es así "));
		   }
			if(edad<21&socio==2) {
				cota=800;
				desconto=(25*800)/100;
				cota=cota-desconto;
				System.out.println("La cuota para los menores de 21 años con padres no socios es de: " + cota);
			}
			else {
				if(edad<21&socio==1) {
					cota=800;
					desconto=(45*800)/100;
					cota=cota-desconto;
					System.out.println("La cuota para los menores de 21 años con padres socios es de: " + cota);
				}
			}
    
    
    
}
}