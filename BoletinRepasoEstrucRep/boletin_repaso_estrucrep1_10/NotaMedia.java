
package boletin_repaso_estrucrep1_10;
import javax.swing.*;

public class NotaMedia {
    
    private float nota;
private float media;
private float sum;

public void dameMedia() {
	sum=0;
	for(int i=6;i>0;i--) {
	nota=Integer.parseInt(JOptionPane.showInputDialog("Introduce tus notas: "));
	while(nota>10||nota<0) {
		nota=Integer.parseInt(JOptionPane.showInputDialog("Nota incorrecta, vuelve a introducirla: "));
	}
	sum=sum+nota;

	}
	media=sum/6;
	System.out.println("La media de los 6 módulos es de: " + media);

}
    
    
    
    
}
