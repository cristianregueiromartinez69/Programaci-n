
package boletin18_2;
import javax.swing.JOptionPane;

public class Transporte {
    
   
    private int zona_loc;
	private float peso;

	private String loc1="America del Norte";
	private String loc2="America Central";
	private String loc3="America del Sur";
	private String loc4="Europa";
	private String loc5="Asia";
       private String pregunta;
       private String afirmacionn="si";
       private String negacion="no";

	public Transporte() {

	}


	public Transporte(int zona_loc, float peso) {

		this.zona_loc = zona_loc;
		this.peso = peso;

	}


	public int getZona_loc() {
		return zona_loc;
	}


	public void setZona_loc(int zona_loc) {
		this.zona_loc = zona_loc;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		this.peso = peso;
	}






	public void destino() {

           pregunta=JOptionPane.showInputDialog("¿Deseas realizar un envío de un paquete?" + "\nsi la respuesta es sí, teclea si" + "\nsi la respuesta es no, teclea no");
               while(pregunta.equalsIgnoreCase(afirmacionn)){
		zona_loc=Integer.parseInt(JOptionPane.showInputDialog("Introduce la zona de destino: " +
		"\n opcion 1: " + loc1 + "\nopcion 2: " + loc2 + "\nopcion 3: " + loc3 +
		"\nopcion 4: " + loc4 + "\nopcion 5: " + loc5));
		peso=Float.parseFloat(JOptionPane.showInputDialog("Establece el peso del paquete: "));
		while(peso>5) {
			peso=Float.parseFloat(JOptionPane.showInputDialog("peso superior a 5 kg, no se puede enviar, intentalo de nuevo: "));
		}

		switch(zona_loc) {

		case 1: if(peso==1) {

			float precio_destino=50;
			float coste_destino=24;
			float precio_final=precio_destino+coste_destino;
			System.out.println("El precio por el envío es de: " + precio_final);
		}
		else if(peso>1) {
			float precio_destino=50;
			float coste_destino=24;
			coste_destino=coste_destino*peso;
			float precio_final=precio_destino+coste_destino;
			System.out.println("El precio por el envío es de: " + precio_final);
		}
                pregunta=JOptionPane.showInputDialog("¿Quieres realizar otro envío?" + "\nsi la respuesta es sí, teclea si" + "\nsi la respuesta es no, teclea no");
		break;
		case 2:
			if(peso==1) {

				float precio_destino=70;
				float coste_destino=20;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
			else if(peso>1) {
				float precio_destino=70;
				float coste_destino=20;
				coste_destino=coste_destino*peso;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
                        pregunta=JOptionPane.showInputDialog("¿Quieres realizar otro envío?" + "\nsi la respuesta es sí, teclea si" + "\nsi la respuesta es no, teclea no");
		break;
		case 3:
			if(peso==1) {

				float precio_destino=120;
				float coste_destino=21;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
			else if(peso>1) {
				float precio_destino=120;
				float coste_destino=21;
				coste_destino=coste_destino*peso;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
                        pregunta=JOptionPane.showInputDialog("¿Quieres realizar otro envío?" + "\nsi la respuesta es sí, teclea si" + "\nsi la respuesta es no, teclea no");
			break;
		case 4:
			if(peso==1) {

				float precio_destino=30;
				float coste_destino=10;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
			else if(peso>1) {
				float precio_destino=30;
				float coste_destino=10;
				coste_destino=coste_destino*peso;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
                        pregunta=JOptionPane.showInputDialog("¿Quieres realizar otro envío?" + "\nsi la respuesta es sí, teclea si" + "\nsi la respuesta es no, teclea no");
			break;
		case 5:
			if(peso==1) {

				float precio_destino=39;
				float coste_destino=18;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
			else if(peso>1) {
				float precio_destino=39;
				float coste_destino=18;
				coste_destino=coste_destino*peso;
				float precio_final=precio_destino+coste_destino;
				System.out.println("El precio por el envío es de: " + precio_final);
			}
                        pregunta=JOptionPane.showInputDialog("¿Quieres realizar otro envío?" + "\nsi la respuesta es sí, teclea si" + "\nsi la respuesta es no, teclea no");
			break;
                        
			default: System.out.println("Opcion incorrecta");
                       

		}




	}



        }




    
    
    
    
    
    
    
}
