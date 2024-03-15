
package examenpracticoprog2ª;
import java.util.*;
import javax.swing.*;

public class Libreria {
    	public static float FloatPositivo(String msg) {
		Boolean marca = false;
		float num=0;
		while (!marca) {

			try {

				do {
					num = Float.parseFloat(JOptionPane.showInputDialog(msg));
				} while (num < 0);
                if(num>0) {
                	marca = true;

                }


			} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debes introducir un numero valido");
			}
		}
		return num;


	}

	public static int IntPositivo(String msg) {

		Boolean marca = false;
		int num=0;
		while (!marca) {

			try {

				do {
					num = Integer.parseInt(JOptionPane.showInputDialog(msg));
				} while (num < 0);
                if(num>0) {
                	marca = true;

                }


			} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "Debes introducir un numero valido");
			}
		}
		return num;
}
    
}
