
package boletin6_3;
import javax.swing.*;

public class Boletin6_3 {

    
    public static void main(String[] args) {
        
       Circulo cir=new Circulo(); //Instanciamos objeto, metemos valores con JOptionPane y visualizamos
		cir.setRadio(Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio : ")));
		System.out.println("El area del círculo es: " + cir.calcularArea());
		System.out.println("La longitud de la circunferencia es de: " + cir.calcularLonxitude());
		Circulo cir2=new Circulo(Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio: ")));
		System.out.println("El area del círculo es: " + cir2.calcularArea());
		System.out.println("La longitud de la circunferencia es de: " + cir2.calcularLonxitude());



        
    }
    
}
