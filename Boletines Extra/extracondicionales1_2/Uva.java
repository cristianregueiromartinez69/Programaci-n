
package extracondicionales1_2;


public class Uva {
    
        private char tipo;
	private int tamaño;
	private double precio_ini;
	private double suma1,suma2,resta1,resta2;


	public Uva() {


	}

	public void establecePrecio(double pre) {

		precio_ini=pre;
		 suma1=precio_ini+0.20;
		 suma2=precio_ini+0.30;
		 resta1=precio_ini-0.30;
		 resta2=precio_ini-0.50;
	}










	public void estableceVenta(char t, int tañ) {

		if(t=='a') {
			if(tañ==1) {
				System.out.println("El precio es de: " + suma1 );
			}

		else {
			if(t=='a'){
				if(tañ==2) {
					System.out.println("El precio es de: " + suma2 );
				}
		}
				}
			}
		if(t=='b') {
		if(tañ==1) {
			System.out.println("El precio es de: " + resta1);
		}


		else {
			if(t=='b') {
			if(tañ==2){
				System.out.println("El precio es de: " + resta2);
			}


			}
		}
		}
		}

    
    
    
}
