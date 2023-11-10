
package boletin11_2;
import javax.swing.*;

public class AdivNum2 {
    private int num1,num2;
	private int num_intentos;
	private int distancia;

	public void juegoNumeros() {

	num1=(int)(Math.random()*50+1);
	num2=Integer.parseInt(JOptionPane.showInputDialog("Adivina el número: "));
	num_intentos=10;


	while(num1!=num2&num_intentos>0) {
		num2=Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto, tienes " + num_intentos + " intentos "));
		distancia=num1-num2;
	if(distancia>20) {
		System.out.println("Moi lonxe ");
		num_intentos--;
	}
	else if(distancia<=20&distancia>=10) {
				System.out.println("lonxe ");
				num_intentos--;
			}
			else if(distancia<10&distancia>=5) {
					System.out.println("preto ");
					num_intentos--;
				}
				else if(distancia<5) {
						System.out.println("Moi preto ");
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
