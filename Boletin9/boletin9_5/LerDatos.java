
package boletin9_5;
import javax.swing.*;
public class LerDatos {
    
    
    public static int lerEnteiro(String mensaxe){
        
        int resposta=Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;

    }
    public static float lerFloatPositivo(String mensaxe){
        float dato;
        do{
        dato= Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        }while(dato<=0);
        return dato;
   
    }
    public static float lerfloatsueldo(String mensaxe){
        float respuesta=Float.parseFloat(JOptionPane.showInputDialog(mensaxe));
        return respuesta;
    }
    
}
