
package abstracta;


public class Rectangulo extends FiguraGeométrica {

	private float base;
	private float altura;
	private float area;

	public Rectangulo(float base, float altura) {
		this.base = base;
		this.altura = altura;
	}

	public float getBase() {
		return base;
	}

	public void setBase(float base) {
		this.base = base;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float calcularArea() {
		 area = base * altura;
		return area;
	}
	@Override
	public String toString() {
		return "Circulo:"
				+ "\nbase=" + base
				+ "\naltura: " + altura
				+ "\narea: " + area;
	}
}