
package boletin9_3;


public class AreaRec {
    
   private float base,altura,area;

	public void establecePositivo() {

       base=LerDatos.lerFloatPositivo("Introduce la base: ");
       altura=LerDatos.lerFloatPositivo("Introduce la altura");
       
       area=base*altura;
		
            System.out.println("El area del rectangulo es de: " + area);
}
}