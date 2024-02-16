
package boletinextra1;
import javax.swing.*;

public class Boletinextra1 {

    public static void main(String[] args) {
        
        Nombre_data person1=new Nombre_data(JOptionPane.showInputDialog("Introduce tu nombre: "),
        Integer.parseInt(JOptionPane.showInputDialog("Introduce tu fecha de nacimiento")));
        System.out.println("Tu nombre es: " + person1.dameNombre());
        System.out.println("Tu fecha de nacimiento es: " + person1.dameData());
       
    }
    
}
