
package boletin6_1;


public class Coche {
    
   private int velocidade;

	public Coche() {
		velocidade=0;
	}

	public int getVelocidade() {

		return velocidade;
	}

	public void acelerar(int valor) { //metodo para darle valor a aceleracion

		velocidade=velocidade+valor;
	}
	public int getAceleracion() {
		return velocidade;
	}
	public void frenar(int menos) {  //metodo para darle valor a la frenada

		velocidade=velocidade-menos;
	}
	public int getFrenada() {

		return velocidade;
	}

    
    
    
    
    
}
