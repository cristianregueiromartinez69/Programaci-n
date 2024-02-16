
package extracondicionales;


public class Cifras {
    
 private int num1;
 
 public Cifras(){
     
 }
    
    
  public void setNum1(int n1){
      
      num1=n1;
  }  
    
  public void decirCifras(){
      
    if(num1>9999){
        System.out.println("El número tiene 5 cifras");
    }  
    else{
        if(num1>999){
            System.out.println("Tu número tiene 4 cifras");
        }
        else{
            if(num1>99){
                System.out.println("Tu número tiene 3 cifras");
            }
            else{
                 if(num1>9){
              System.out.println("Tu número tiene 2 cifras");
          }
                 else{
                     if(num1>0){
              System.out.println("Tu número tiene 1 cifra");
                 }
            }
        }       
          
       
          
    }
    
    
  }  
  
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
}