
package boletin9_1;
import javax.swing.*;
public class LerDatos {
    
    
    public static int lerEnteiro(String mensaxe){
        
        int resposta=Integer.parseInt(JOptionPane.showInputDialog("Introduce número"));
        return resposta;
        
        //tambien podemos hacer esto
        //return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        
    }
    
    
}
