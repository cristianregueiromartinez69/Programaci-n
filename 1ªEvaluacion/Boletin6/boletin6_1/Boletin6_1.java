
package boletin6_1;
import javax.swing.*;

public class Boletin6_1 {

    
    public static void main(String[] args) {
        
                Coche seat=new Coche();
		System.out.println("La velocidad es: " + seat.getVelocidade());
		seat.acelerar(Integer.parseInt(JOptionPane.showInputDialog("Introduce la aceleracion: "))); //pedimos la aceleración
		System.out.println("Tu velodidad actual es de: " + seat.getAceleracion() + " km/h");
		seat.frenar(Integer.parseInt(JOptionPane.showInputDialog("Introduce la frenada: "))); //pedimos la frenada
		System.out.println("Tu velodidad actual es de: " + seat.getFrenada() + " km/h");

       
    }
    
}
