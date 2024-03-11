
package abstracta;


public class Circulo extends FiguraGeométrica {

	private float radio;
	private float area;

	public Circulo(float radio) {
		this.radio = radio;
	}

	public float getRadio() {
		return radio;
	}

	public void setRadio(float radio) {
		this.radio = radio;
	}

	public float calcularArea() {
		 area = (float) (Math.PI * Math.pow(radio, 2));
		return area;
	}

	@Override
	public String toString() {
		return "Circulo:"
				+ "\nradio=" + radio
				+ "\nArea: " + area;
	}


}