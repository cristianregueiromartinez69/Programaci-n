
package boletin_refuerzo_arrays1;
import java.util.Arrays;

public class Boletin_Refuerzo_Arrays1 {

  
    public static void main(String[] args) {
      
        	int[]num=new int[6];

	for(int i=0;i<num.length;i++) {

		num[i]=(int)(Math.random()*50)+1;


	}

		System.out.println("Mi array: " + Arrays.toString(num));
        
        
    }
    
}
