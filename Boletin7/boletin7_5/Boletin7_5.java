
package boletin7_5;
import javax.swing.*;

public class Boletin7_5 {

  
    public static void main(String[] args) {
       
        
       Mayor obj5=new Mayor();
		obj5.setNum1(Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: ")));
		obj5.setNum2(Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: ")));
		obj5.setNum3(Integer.parseInt(JOptionPane.showInputDialog("Introduce un número: ")));
		obj5.dameMayor();
 
        
    }
    
}
