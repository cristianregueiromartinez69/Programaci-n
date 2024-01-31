
package boletin22_1;


public class AlReves {
    
   int[]num=new int[6];
   
   public void dameNumeroReves(){
       
     for(int i=0;i<num.length;i++){
         
         num[i]=(int)(Math.random()*50)+1;
         System.out.println(num[i]); 
     }  
      
     for(int i=5;i>=0;i--){
         
         System.out.println("Numeros al reves: " + num[i]);
        
         
     }
       
       
   }
    
    
    
    
    
    
}
