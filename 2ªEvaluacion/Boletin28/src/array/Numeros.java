
package array;
import javax.swing.*;
public class Numeros {


	public static float FloatPositivo(String msg) {

		float num;
		do {
			num=Float.parseFloat(JOptionPane.showInputDialog(msg));
		}while(num<0);

		return num;

	}

	public static int IntPositivo(String msg) {

		int num;
		do {
			num=Integer.parseInt(JOptionPane.showInputDialog(msg));
		}while(num<0);

		return num;

	}





}
