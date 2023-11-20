
package boletin12_coche;
import java.util.Scanner;
import javax.swing.*;

public class Boletin12_Coche {
 static float pago;
 static float pago_total;
 static int horas;
    public static void main(String[] args) {
        
     Coche c1=new Coche();
	     Coche c2=new Coche();
	     Coche c3=new Coche();
	     Coche c4=new Coche();
	     Coche c5=new Coche();
	     Garaxe g=new Garaxe(c1,c2,c3,c4,c5);
	     Garaxe.numeroCoches=0;

	     while(Garaxe.numeroCoches<5){
	         System.out.println("Plazas disponibles");
	       c1.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Introduce la matrícula: ")));
	         c1.setMarca(JOptionPane.showInputDialog("Introduce la marca: "));
	         Garaxe.numeroCoches++;
	         System.out.println("Plazas disponibles");
	         c2.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Introduce la matrícula: ")));
	         c2.setMarca(JOptionPane.showInputDialog("Introduce la marca: "));
	         Garaxe.numeroCoches++;
	         System.out.println("Plazas disponibles");
	         c3.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Introduce la matrícula: ")));
	         c3.setMarca(JOptionPane.showInputDialog("Introduce la marca: "));
	         Garaxe.numeroCoches++;
	         System.out.println("Plazas disponibles");
	         c4.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Introduce la matrícula: ")));
	         c4.setMarca(JOptionPane.showInputDialog("Introduce la marca: "));
	         Garaxe.numeroCoches++;
	         System.out.println("Plazas disponibles");
	         c5.setMatricula(Integer.parseInt(JOptionPane.showInputDialog("Introduce la matrícula: ")));
	         c5.setMarca(JOptionPane.showInputDialog("Introduce la marca: "));
	         Garaxe.numeroCoches++;
	         }
	        System.out.println("Completo");

	        System.out.println("Introduce las horas que estuviste en el parking: ");
	       Scanner sc=new Scanner(System.in);
	       horas=sc.nextInt();

	       while(horas<=0) {
	    	   System.out.println("Hora incorrecta, vuelve a introducirla: ");
	    	   horas=sc.nextInt();
	       }



	       if(horas<=3){
	            System.out.println("Factura: ");
	            System.out.println("  Matricula: " + c5.getMatricula());
	            System.out.println("  Horas : " + horas);
	           pago_total=1.5f;
	              System.out.println(" pago total : " + pago_total + " euros ");
	            System.out.println(" Introduce el importe, por favor: ");
	            pago=sc.nextFloat();
	            while(pago<pago_total) {
	            	System.out.println("pago insuficiente");
	            	pago=sc.nextFloat();
	            }
	             System.out.println(" cartos recibidos: " + pago + " euros ");
	            float diferencia=pago-pago_total;
	              System.out.println(" Cartos devoltos: " + diferencia + " euros");
	            System.out.println(" Gracias por usar el aparcamiento");
	        }

	       else if(horas>3){
	           System.out.println("Factura: ");
	            System.out.println("  Matricula: " + c5.getMatricula());
	            System.out.println("  Horas : " + horas);
	           pago_total=1.5f;
	           float pago_añadido=horas*0.20f;
	           pago_total+=pago_añadido;
	              System.out.println(" pago total : " + pago_total + " euros ");
	            System.out.println(" Introduce el importe, por favor: ");
	            pago=sc.nextFloat();
	            while(pago<pago_total) {
	            	System.out.println("pago insuficiente");
	            	pago=sc.nextFloat();
	            }
	             System.out.println(" cartos recibidos: " + pago + " euros ");
	            float diferencia=pago-pago_total;
	              System.out.println(" Cartos devoltos: " + diferencia + " euros");
	            System.out.println(" Gracias por usar el aparcamiento");
	       }




     
        
        
        
        
        
    }
    
}
