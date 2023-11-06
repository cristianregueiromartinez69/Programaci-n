
package boletin9_1;


public class CantNumeros {
   
    private int positivo;
	private int negativo;
	private int cero;

	public void calcularNumeros() {
		positivo=0;
		negativo=0;
		cero=0;



		int contador=0;
		while(contador<10) {
			int num=LerDatos.lerEnteiro("Introduce número");

			if(num>0) {
				positivo++;
				contador++;

			}

			else {
				if(num<0) {
					negativo++;
					contador++;

				}
				else {
					cero++;
					contador++;
				}
			}







		}

		System.out.println("Numeros positivos: " + positivo);
		System.out.println("Numeros negativos: " + negativo);
		System.out.println("Numeros que son 0: " + cero);

    
    
    
    
    
    
    
    
    
    
    
            
        }
        
        
        
        
    
    
    
    
    
}
