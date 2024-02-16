
package boletin_repaso_estrucrep1_5;
import javax.swing.*;

public class NoNegativoySuma {
   
      private int num;
      private int suma;
      
         public void dime4NumySuma(){
        suma=0;
        for(int i=4;i>0;i--){
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduce 4 números: "));
            while(num<0){
              num=Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto, vuelve a introducirlo: "));  
            }
            
            
            System.out.println("Numero: " + num);
            suma=suma+num;
            System.out.println("La suma es de: " + suma);
      
        }
        
          
          
    }
      
    
    
    
    
    
}
