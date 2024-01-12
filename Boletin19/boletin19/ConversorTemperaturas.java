
package boletin19;
import java.util.Scanner;

public class ConversorTemperaturas {
    
    

static final int GRADO_FALLO=80;

public static  float  centigradosAFharenheit(float cent){

    float grado_centigrado=cent;
    float grado_fharenheit=0;
    grado_fharenheit=(float)((9/5*grado_centigrado)+32.4);

    System.out.println("Tus " + grado_centigrado + " grados centigrados " + " son " +
    		   grado_fharenheit + " grados fharenheit ");
    return grado_fharenheit;


    }

  public static float centigradosAReamur(float cent){

    float grado_centigrado=cent;
    float grado_reamur=0;
    grado_reamur=(float)(4/5*grado_centigrado);

    System.out.println("Tus " + grado_centigrado + " grados centigrados " + " son " +
 		   grado_reamur + " grados reamur ");

    return grado_reamur;
   
   
   
    
    
    
    
}
}