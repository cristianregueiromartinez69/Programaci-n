package boletin29;

import javax.swing.JOptionPane;

public class Excepciones {

	private int num1;
	private int num2;

	public Excepciones(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public Excepciones() {

	}

	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}

	public Float tratarExcepcion() {
		Float resultado = null;

		try {
			num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero: "));
			num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el primer numero: "));

			resultado = (float) (num1 / num2);
			return resultado;
		} catch (ArithmeticException e) {
			System.out.println("Vaya, no se ha podido realizar la division, vuelve a intentarlo");
			Excepciones miexcepcion = new Excepciones();
			miexcepcion.tratarExcepcion();

		} catch (RuntimeException e) {

			System.out.println("Error al introducir los datos, vuelve a intentarlo");
			Excepciones miexcepcion = new Excepciones();
			miexcepcion.tratarExcepcion();
		}
		return resultado;

	}
}
