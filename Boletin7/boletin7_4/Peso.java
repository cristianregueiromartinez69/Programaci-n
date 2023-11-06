
package boletin7_4;


public class Peso {
 
    private String nom1,nom2;
	private double peso1,peso2;
	private double diferencia;

	public Peso() {

	}

	public void dameNombre1(String n1) {

		nom1=n1;
	}
	public void dameNombre2(String n2) {
		nom2=n2;
	}
	public void damePeso1(double p1) {
		peso1=p1;
	}
	public void damePeso2(double p2) {
		peso2=p2;
	}

	public void dimeDatos() {

		if(peso1>peso2) {
			System.out.println("nombre: " + nom1 + " peso: " + peso1 + " kg");
		}
		else {
			System.out.println("nombre: " + nom2 + " peso: " + peso2 + " kg");
		}


	}

	public void dimeDiferencia() {

		if(peso1>peso2) {
			diferencia=peso1-peso2;
			System.out.println("La diferencia de peso es de: " + diferencia + " kg");
		}
		else {
			diferencia=peso2-peso1;
			System.out.println("La diferencia de peso es de: " + diferencia + " kg");
		}
	}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
