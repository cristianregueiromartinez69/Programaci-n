
package boletin18_1;

import javax.swing.JOptionPane;


public class Llamadas {
    
    
   private int tiempo;
	private String dia;
	private String horario;
	private float euros;
	private String pregunta;
	private String res1,res2;

	public Llamadas() {

	}


	public Llamadas(int tiempo, String dia, String horario) {

		this.tiempo = tiempo;
		this.dia = dia;
		this.horario = horario;

	}



	public int getTiempo() {
		return tiempo;
	}



	public void setTiempo(int tiempo) {
		this.tiempo = tiempo;
	}



	public String getDia() {
		return dia;
	}



	public void setDia(String dia) {
		this.dia = dia;
	}



	public String getHorario() {
		return horario;
	}



	public void setHorario(String horario) {
		this.horario = horario;
	}



	public float getEuros() {
		return euros;
	}



	public void setEuros(float euros) {
		this.euros = euros;
	}




	public void precioLlamadas() {

		res1="si";
		res2="no";
		String dia1="no en domingo";
		String dia2="domingo";
		String tiempo1="mañana";
		String tiempo2="tarde";


	pregunta=JOptionPane.showInputDialog("¿Quieres realizar una llamada?, si es si, responde si, en caso contrario, responde no");

		while(pregunta.equalsIgnoreCase(res1)) {

			tiempo=Integer.parseInt(JOptionPane.showInputDialog("¿Cuanto tiempo vas a llamar? "));
		    dia=JOptionPane.showInputDialog("¿Que día vas a llamar?, si no es en domingo, responde no en domingo, si es en domingo, reponde domingo");
			horario=JOptionPane.showInputDialog("¿En que horario vas a llamar?, si es de mañana, responde mañana, si es de tarde, responde tarde ");

			//si el horario es por la mañana y es distinto de domingo


			if(tiempo<=5&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo1)) {

				euros=1*tiempo;
				float precio_final=euros*0.15f;
				precio_final+=euros;
				System.out.println("tiempo de llamada: " + tiempo + " minutos");
				System.out.println("El precio a pagar es de: " + precio_final + " euros");
			}
				else if(tiempo>5&&tiempo<=8&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo1)) {


					euros=1.80f*tiempo-5f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
			}
				else if(tiempo>8&&tiempo<=10&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo1)) {


					euros=2.50f*tiempo-10.4f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
				}

				else if(tiempo>10&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo1)) {

					euros=3f*tiempo-15.4f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
				}

			//si el horario es de tarde y es distinto de domingo

				else if(tiempo<=5&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo2)) {

					euros=1f*tiempo;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
			}
				else if(tiempo>5&&tiempo<=8&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo2)) {

					euros=1.80f*tiempo-5f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
			}
				else if(tiempo>8&&tiempo<=10&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo2)) {


					euros=2.50f*tiempo-10.4f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
				}

				else if(tiempo>10&&dia.equalsIgnoreCase(dia1)&&horario.equalsIgnoreCase(tiempo2)) {

					euros=3f*tiempo-15.4f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
				}

			//si el dia es en domingo

				else if(tiempo<=5&&dia.equalsIgnoreCase(dia2)||horario.equalsIgnoreCase(tiempo1)||horario.equalsIgnoreCase(tiempo2)) {

					euros=1f*tiempo;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
			}
				else if(tiempo>5&&tiempo<=8&&dia.equalsIgnoreCase(dia2)||horario.equalsIgnoreCase(tiempo1)||horario.equalsIgnoreCase(tiempo2)) {

					euros=1.80f*tiempo-5;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
			}
				else if(tiempo>8&&tiempo<=10&&dia.equalsIgnoreCase(dia2)||horario.equalsIgnoreCase(tiempo1)||horario.equalsIgnoreCase(tiempo2)) {


					euros=2.50f*tiempo-10.4f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
				}
				else if(tiempo>10&&dia.equalsIgnoreCase(dia2)||horario.equalsIgnoreCase(tiempo1)||horario.equalsIgnoreCase(tiempo2)) {

					euros=3f*tiempo-15.4f;
					float precio_final=euros*0.15f;
					precio_final+=euros;
					System.out.println("tiempo de llamada: " + tiempo + " minutos");
					System.out.println("El precio a pagar es de: " + precio_final + " euros");
				}



			pregunta=JOptionPane.showInputDialog("¿Quieres volver a realizar una llamada? ");





		}
















    
    
    
    
    
    
        }   
    
}
