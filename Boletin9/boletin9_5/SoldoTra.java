
package boletin9_5;


public class SoldoTra {
    
    private float tra1,tra2,numtra;
	private float salario;
	private float porcentaxe;

	public void dameSalarios() {

		tra1=0;
		tra2=0;
		numtra=0;
		int contador=0;
                salario=LerDatos.lerfloatsueldo("Introduce el salario: ");
		while(salario>0) {

			salario=LerDatos.lerfloatsueldo("Introduce el salario: ");
			if(salario>=1000&salario<=1750) {
				tra1++;
				contador++;
			}
			else {
				if(salario<1000) {
				tra2++;
				contador++;
				}

			}

		}

		numtra=tra1+tra2;
		porcentaxe=(tra2/numtra)*100;

		System.out.println("Número de trabajadores que ganan entre 1000 y 1750 euros: " + tra1);
		System.out.println("Porcentaje de trabajadores que ganan menos de 1000 euros: " + porcentaxe + "%");


	}


    
    
    
    
    
    
    
    
    
    
    
}
