
package boletin21;
import javax.swing.*;

public class Boletin21 {


    public static void main(String[] args) {
      
   Gato objgato1=new Gato(Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso del gato: ")),
   JOptionPane.showInputDialog("Introduce el color del gato: "));
   
   JOptionPane.showMessageDialog(null, "Descripcion del gato: " + "\npeso del gato: " + objgato1.getPeso()
    + "\ncolor del gato: " + objgato1.getColor());
   
   objgato1.camiñar();
   objgato1.nadar();
   
   Papagaio objpa1=new Papagaio(Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso del papagayo: ")),
   JOptionPane.showInputDialog("Introduce el color del papagayo: "));
   
    JOptionPane.showMessageDialog(null, "Descripcion del papagayo: " + "\npeso del papagayo: " + objpa1.getPeso()
    + "\ncolor del papagayo: " + objpa1.getGolor());
   
  objpa1.camiñar();
  objpa1.volar();
  
  Avestruz objAv1=new Avestruz(Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso de la avestruz: ")),
   JOptionPane.showInputDialog("Introduce el color de la avestruz: "));
  
  
    JOptionPane.showMessageDialog(null, "Descripcion de la avestruz: " + "\npeso de la avestruz: " +  objAv1.getPeso()
    + "\ncolor de la avestruz: " +  objAv1.getGolor());
   
  objAv1.camiñar();
  objAv1.volar();
  
  Morcego objmor1=new Morcego(Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso del murcielago: ")),
   JOptionPane.showInputDialog("Introduce el color del murcielago: "));
  
  JOptionPane.showMessageDialog(null, "Descripcion del murcielago: " + "\npeso del murcielago: " + objmor1.getPeso()
    + "\ncolor del murcielago: " + objmor1.getColor());
   
  objmor1.camiñar();
  objmor1.volar();
  
  Tigre objtigre1=new Tigre(Float.parseFloat(JOptionPane.showInputDialog("Introduce el peso del tigre ")),
   JOptionPane.showInputDialog("Introduce el color del tigre "));
  
    JOptionPane.showMessageDialog(null, "Descripcion del tigre: " + "\npeso del tigre " +  objtigre1.getPeso()
    + "\ncolor del tigre: " +  objtigre1.getColor());
   
  objtigre1.camiñar();
  objtigre1.nadar();
  
  
   
       
       
        
        
        
    }
    
}
