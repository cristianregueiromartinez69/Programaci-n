
package boletin_repaso_estrucrep1_8;
import javax.swing.*;

public class VariasAreas {
    
    private float area,lado;
    
    public  void dimeAreas(){
       lado=Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado: "));
       
      while(lado>0){
          lado=Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado: "));
           if(lado<0){
               lado=Float.parseFloat(JOptionPane.showInputDialog("No se admiten numeros negativos, vuelve a ponerlo: "));
           }
         
         area=lado*lado;
          System.out.println("El area del cuadrado es: " + area);
          
      }  
        
        
    }
    
    
    
}
