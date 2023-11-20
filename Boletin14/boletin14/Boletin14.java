
package boletin14;
import Partes.*;
import javax.swing.*;

public class Boletin14 {

   static float precio_final; 
    public static void main(String[] args) {
        Monitor m1=new Monitor();
        Teclado t1=new Teclado();
        Procesador p1=new Procesador();
       Ordenador o1=new Ordenador(m1,t1,p1,100);
       
       m1.setMarca(JOptionPane.showInputDialog("marca monitor: "));
       m1.setPulgadas(Integer.parseInt(JOptionPane.showInputDialog("Pulgadas monitor: ")));
       m1.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Precio monitor: ")));
       t1.setMarca(JOptionPane.showInputDialog("Marca teclado: "));
       t1.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Precio teclado: ")));
       p1.setVelocidade(Float.parseFloat(JOptionPane.showInputDialog("Velocidad procesador: ")));
       p1.setPrecio(Float.parseFloat(JOptionPane.showInputDialog("Precio Procesador: ")));
       
       precio_final=m1.getPrecio()+t1.getPrecio()+p1.getPrecio();
       
        System.out.println("Características del ordenador: " + "\nMarca del monitor: " + m1.getMarca() +
                "\nPulgadas del monitor: " + m1.getPulgadas() + "\nPrecio del monitor: " + m1.getPrecio() + 
                "\nMarca del teclado: " + t1.getMarca() + "\nPrecio del teclado: " + t1.getPrecio() + 
                "\nVelocidad del procesador: " + p1.getVelocidade() + "\nPrecio del procesador: " + p1.getPrecio() + 
                "\nPrecio del ordenador: " + precio_final);
        
        System.out.println("Precio del ordenador: " + precio_final);
        System.out.println("Marca del teclado: " + o1.getTe().getMarca());
        System.out.println("Velocidad de la cpu: " + o1.getPro().getVelocidade());
       
    }
    
 
    
}
