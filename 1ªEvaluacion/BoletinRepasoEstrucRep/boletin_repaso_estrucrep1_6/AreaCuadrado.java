
package boletin_repaso_estrucrep1_6;
import javax.swing.*;

public class AreaCuadrado {
   
    
    private float area,lado;
    
    public void dimeArea(){
        
     lado=Float.parseFloat(JOptionPane.showInputDialog("Establece lado: "));
     do{
         lado=Float.parseFloat(JOptionPane.showInputDialog("!El lado no puede ser negativo!, vuelve a introducirlo: "));
     }while(lado<0);
     area=lado*lado;
        System.out.println("El area del cuadrado es: " + area);
     
    }
    
    
    
    
    
    
}
