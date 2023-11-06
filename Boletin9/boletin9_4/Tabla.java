
package boletin9_4;


public class Tabla {
    
    	private int num1;
	private int num2;

	private int resultado;

	public void dameTabla() {
	num2=1;
	int contador=10;
	num1=LerDatos.lerEnteiro("Introduce un número: ");
	  while(num1<=0){
                          
                           num1=LerDatos.lerEnteiro("Numero incorrecto, vuelve a introducirlo: ");
                       }
        System.out.println("Tabla del " + num1);
        
		while(contador>0) {

                     
			resultado=num1*num2;


			System.out.println(num1 + " x " + num2 + " = " + resultado);
			num2++;
		    contador--;
                    


		}


	}
    
    
    
}
