
package extracondicionales;
import javax.swing.*;

public class ExtraCondicionales {

   
    public static void main(String[] args) {
       
        Cifras cif=new Cifras();
        
        cif.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: ")));
        cif.decirCifras();
    }
    
}
