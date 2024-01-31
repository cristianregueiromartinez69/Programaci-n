
package boletin22_2;
import javax.swing.*;

public class Programacion {
    
   float[]nota=new float[30];
    private float media;

    public void dameNotaMedia(){

        float aprobado=5;
        float num_aprobado=0;
        float num_suspenso=0;
        float nota_max=0;
        float suma=0;



       for (int i=0;i<nota.length;i++){
    	   try {
         nota[i]=Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota del alumno: "));

         while(nota[i]<0||nota[i]>10) {

        	 nota[i]=Float.parseFloat(JOptionPane.showInputDialog("Nota incorrecta, vuelve a introducirla: "));
         }

         if(nota[i]>=aprobado){


           num_aprobado++;
         }

         else if(nota[i]<aprobado){

        	num_suspenso++;
         }

         if(nota[i]>nota_max){

           nota_max=nota[i];
         }

         suma+=nota[i];
    	   }catch(NumberFormatException e) {

    		   nota[i]=Float.parseFloat(JOptionPane.showInputDialog("Número inválido, vuelve a introducirlo: "));
           }
       }

       media=suma/30;

       JOptionPane.showMessageDialog(null, "Datos de las notas: " +
               "\nNumero de aprobados: " + num_aprobado
       + "\nNumero de suspensos: " + num_suspenso + "\nnota media de la clase: " + media +
               "\nNota más alta de la clase: " + nota_max);







    }
























    
    
    
}
