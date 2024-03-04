
package boletin27_segundaversion;

import javax.swing.JOptionPane;

/**
 * Metodo para asegurarnos que el numero es positivo
 */
public class LibreriaPersonal {
    public static float FloatPositivo(String msg) {

		float num;
		do {
			num = Float.parseFloat(JOptionPane.showInputDialog(msg));
		} while (num <= 0);

		return num;

	}

	/**
	 * Metodo para asegurarnos que el numero es positivo
	 */
	public static int IntPositivo(String msg) {

		int num;
		do {
			num = Integer.parseInt(JOptionPane.showInputDialog(msg));
		} while (num < 0);

		return num;

	}

}


