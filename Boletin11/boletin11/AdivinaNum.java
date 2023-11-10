
package boletin11;
import javax.swing.*;

public class AdivinaNum {
    
   private int num1;
	private int num2;
	private int num_intentos;

	public void adivinaNumero() {

	num1=Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero entre en 1 y el 50"));
        
        while(num1>50){
            num1=Integer.parseInt(JOptionPane.showInputDialog("NO, tiene que ser entre el 1 y el 50"));
        }
        
        while(num1<1){
            num1=Integer.parseInt(JOptionPane.showInputDialog("NO, tiene que ser entre el 1 y el 50"));
        }
        num_intentos=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de intentos: "));
	
        
     
        num2=Integer.parseInt(JOptionPane.showInputDialog("Adivina el número: "));
	
	while(num_intentos>0&&num1!=num2) {

		if(num2>num1) {
			num2=Integer.parseInt(JOptionPane.showInputDialog("Más abajo: "));
			num_intentos--;
		}
		else if(num2<num1) {
			num2=Integer.parseInt(JOptionPane.showInputDialog("Más arriba: "));
			num_intentos--;
		}

	}
		if(num_intentos==0) {
			System.out.println("Vuelve a intentarlo");
		}
		if(num1==num2) {
		System.out.println("Acertaste");
		}

	}

    
    
}
