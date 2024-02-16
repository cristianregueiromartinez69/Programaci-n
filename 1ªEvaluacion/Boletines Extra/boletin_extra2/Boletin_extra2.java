
package boletin_extra2;
import javax.swing.*;
import java.util.Scanner;

public class Boletin_extra2 {

 
    public static void main(String[] args) {
       Conta cuenta1=new Conta();
		cuenta1.setNombre(JOptionPane.showInputDialog("Introduce tu nombre: "));
		cuenta1.setNumerocuenta(JOptionPane.showInputDialog("Introduce el número de cuenta: "));
		cuenta1.setTipointeres(Double.parseDouble(JOptionPane.showInputDialog("Introduce el tipo de interés: ")));
		cuenta1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo: ")));
		cuenta1.Caracteristicas_generales();
		cuenta1.setIngreso(Double.parseDouble(JOptionPane.showInputDialog("Introduce el ingreso: ")));
        System.out.println("Tu saldo actual es de: " + cuenta1.getIngreso() + " euros");
        cuenta1.setReintegro(Double.parseDouble(JOptionPane.showInputDialog("Introduce el reintegro: ")));
        System.out.println("Tu saldo actual es de: " + cuenta1.getReintegro() + " euros");

        Conta cuenta2=new Conta(JOptionPane.showInputDialog("Introduce tu nombre: " ),
        		JOptionPane.showInputDialog("Introduce tu número de cuenta"),
        		Double.parseDouble(JOptionPane.showInputDialog("Introduce el tipo de interés: ")),
        		Double.parseDouble(JOptionPane.showInputDialog("Introduce el salario: ")));
        System.out.println("Introduce el ingreso");
        Scanner sc=new Scanner(System.in);

        cuenta2.setIngreso(sc.nextDouble());
        System.out.println("Tu saldo actual es de : " + cuenta2.getIngreso());
        System.out.println("Introduce el reintegro");
        cuenta2.setReintegro(sc.nextDouble());
        System.out.println("Tu saldo actual es de : " + cuenta2.getReintegro());
        cuenta1.Transferencia(JOptionPane.showInputDialog("Introduce el numero de cuenta para transferir: "),
        		Double.parseDouble(JOptionPane.showInputDialog("Introduce el dinero a transferir")));
        System.out.println("Su transferencia se ha realizado correctamente");
        
        
        
    }
    
}
