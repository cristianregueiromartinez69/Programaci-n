
package boletin_repaso_estrucrep1_12;
import javax.swing.*;
import java.util.Scanner;

public class NotaGeneral {
   
    private float not;
	private float sum;
	private float media;
	private String respuesta;
        private String contestar;
        

	public void dameMediasTodos() {
	//vamos introduciendo notas y al final de todo preguntamos si queremos consultar otras
	Scanner sc=new Scanner(System.in);
	do{
            System.out.println("Introduce las notas: ");
		for(int i=0;i<6;i++) {
			not=sc.nextFloat();
			while(not>10||not<0) {
				System.out.println("Nota incorrecta, vuelve a introducirla: ");
				not=sc.nextFloat();
			}
			sum=sum+not;
		}
		media=sum/6;
		System.out.println("La media del 1º alumno es de: " + media);

		sum=0;
		System.out.println("Introduce las notas: ");
		for(int i=0;i<6;i++) {
			not=sc.nextFloat();
			while(not>10||not<0) {
				System.out.println("Nota incorrecta, vuelve a introducirla: ");
				not=sc.nextFloat();
			}
			sum=sum+not;
		}
		media=sum/6;
		System.out.println("La media del 2º alumno es de: " + media);

		sum=0;
		System.out.println("Introduce las notas: ");
		for(int i=0;i<6;i++) {
			not=sc.nextFloat();
			while(not>10||not<0) {
				System.out.println("Nota incorrecta, vuelve a introducirla: ");
				not=sc.nextFloat();
			}
			sum=sum+not;
		}
		media=sum/6;
		System.out.println("La media del 3º alumno es de: " + media);

		sum=0;
		System.out.println("Introduce las notas: ");
		for(int i=0;i<6;i++) {
			not=sc.nextFloat();
			while(not>10||not<0) {
				System.out.println("Nota incorrecta, vuelve a introducirla: ");
				not=sc.nextFloat();
			}
			sum=sum+not;
		}
		media=sum/6;
		System.out.println("La media del 4º alumno es de: " + media);

		sum=0;
		System.out.println("Introduce las notas: ");
		for(int i=0;i<6;i++) {
			not=sc.nextFloat();
			while(not>10||not<0) {
				System.out.println("Nota incorrecta, vuelve a introducirla: ");
				not=sc.nextFloat();
			}
			sum=sum+not;
		}
		media=sum/6;
		System.out.println("La media del 5º alumno es de: " + media);

		respuesta=JOptionPane.showInputDialog("¿Quieres consultar otras medias?");
                contestar="si";
	}while(respuesta.equalsIgnoreCase(contestar));
            System.out.println("Vuelve a iniciar si quieres visualizar las medias de los alumnos");

//si la respuesta es si, volvemos a repetir el proceso, si no acabamos

	}

    
    
    
    
    
    
}
