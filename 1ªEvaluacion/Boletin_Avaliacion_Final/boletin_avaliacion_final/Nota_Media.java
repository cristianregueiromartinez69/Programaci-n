
package boletin_avaliacion_final;
import javax.swing.*;

public class Nota_Media {
    
    
    
    private final int NUMERO_BOLETINES=20;

public void calcularNotaMedia() {

Datos_Notas nota=new Datos_Notas();

String pregunta=JOptionPane.showInputDialog("¿Quieres calcular las notas de un alumno?"
		+ "\nresponde (si) si deseas calcular la nota del alumno "
		 + "\nresponde (no) si no deseas calcular la nota del alumno");

String res1="si";
String res2="no";

while(pregunta.equalsIgnoreCase(res1)) {
	float aux_media_prueba_escrita;
	float nota_prueba_escrita=0;
	for(int i=0;i<2;i++) {
	nota.setPrueba_escrita(Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la 1ª prueba escrita: ")));
	nota_prueba_escrita+=nota.getPrueba_escrita();

	}
aux_media_prueba_escrita=(nota_prueba_escrita/2)*0.4f;


	float nota_prueba_practica;
	nota.setPrueba_practica(Float.parseFloat(JOptionPane.showInputDialog("Introduce la nota de la prueba práctica: "))*0.4f);
	nota_prueba_practica=nota.getPrueba_practica();


	int boletin_hecho=Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de boletines completos: "));
	int diferencia=NUMERO_BOLETINES-boletin_hecho;
	float nota_boletin;
	if(diferencia<2) {

		nota.setBoletins(10*0.2f);
		nota_boletin=nota.getBoletins();
	}

	else if(diferencia>=2&&diferencia<=6) {

		nota.setBoletins(5*0.2f);
		nota_boletin=nota.getBoletins();
	}


	else {

		nota.setBoletins(0);
		nota_boletin=nota.getBoletins();
	}


	float nota_final=aux_media_prueba_escrita+nota_prueba_practica+nota_boletin;
	nota.setNota_media(nota_final);

	JOptionPane.showMessageDialog(null, "Nota del alumno: " +
	"\nPRUEBAS TEORICAS: " + aux_media_prueba_escrita
	 + "\nPRUEBAS PRÁCTICAS: " + nota_prueba_practica
	  + "\nBOLETINES: " + nota_boletin +
	  "\nNOTA TOTAL: " + nota.getNota_media());

	pregunta=JOptionPane.showInputDialog("¿Quieres volver a calcular las notas de un alumno?"
			+ "\nresponde (si) si deseas volver a calcular la nota de otro alumno "
			 + "\nresponde (no) si no deseas volver a calcular la nota de otro alumno");



}








}











    
    
    
    
    
    
    
    
    
    
    
}
