
package boletin6_3;


public class Circulo {
    
 private double radio;
	final double PI=3.14;

	public Circulo(){

	}

	public Circulo(double r) {

		radio=r;
	}

	public void setRadio(double r) {

		radio=r;
	}

	public double calcularArea() {  //metodo para calcular area del circulo

		double area=PI*Math.pow(radio, 2);
		return area;
	}

	public double calcularLonxitude() {  //metodo para calcular longitud de la circunferencia

		double lonxitude=2*PI*radio;
		return lonxitude;
	}


    
    
    
    
    
    
    
    
}
