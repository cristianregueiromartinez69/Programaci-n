
package boletin_repaso_estrucrep1_4;
import javax.swing.*;

public class NoNegativo {
    
    private int num;
    
    public void dime4Num(){
        
        for(int i=4;i>0;i--){
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduce 4 números: "));
            while(num<0){
              num=Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto, vuelve a introducirlo: "));  
            }
            System.out.println("Numero: " + num);
            
      
        }
        
          
          
    }
    
    
}
