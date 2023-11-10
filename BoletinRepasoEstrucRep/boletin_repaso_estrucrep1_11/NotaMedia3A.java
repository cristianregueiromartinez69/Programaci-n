
package boletin_repaso_estrucrep1_11;
import javax.swing.*;

public class NotaMedia3A {
  
    
 private float num1,num2,num3;
	private float media;
	private float sum;

	public void dameMedia3() {
	sum=0;
	for(int i=0;i<6;i++) {
		num1=Float.parseFloat(JOptionPane.showInputDialog("Introduce tus notas: "));
		while(num1>10||num1<0) {
			num1=Float.parseFloat(JOptionPane.showInputDialog("Nota incorrecta, vuelve a introducirla: "));
		}
		sum=sum+num1;
	}
		media=sum/6;
		System.out.println("La media del 1º alumno es de: " + media);

		sum=0;
		for(int i=0;i<6;i++) {
			num2=Float.parseFloat(JOptionPane.showInputDialog("Introduce tus notas: "));
			while(num2>10||num2<0) {
				num2=Float.parseFloat(JOptionPane.showInputDialog("Nota incorrecta, vuelve a introducirla: "));
			}
			sum=sum+num2;
		}
			media=sum/6;
			System.out.println("La media del 2º alumno es de es de: " + media);

			sum=0;
			for(int i=0;i<6;i++) {
				num3=Float.parseFloat(JOptionPane.showInputDialog("Introduce tus notas: "));
				while(num3>10||num3<0) {
					num3=Float.parseFloat(JOptionPane.showInputDialog("Nota incorrecta, vuelve a introducirla: "));
				}
				sum=sum+num3;
			}
				media=sum/6;
				System.out.println("La media del 3º alumno es de: " + media);

	}

   
    
    
    
    
}
