
package boletin_repaso_estrucrep1_3;
import java.util.Scanner;

public class VariosNumeros {
    
    private int num;
    
    public void pideNumeros(){
        
        System.out.println("Escribe varios números: ");
        Scanner sc=new Scanner(System.in);
         num=sc.nextInt();
        while(num!=0){
            num=sc.nextInt();
            System.out.println("numero : " + num);
        }
        
        
        
    }
    
    
    
    
}
