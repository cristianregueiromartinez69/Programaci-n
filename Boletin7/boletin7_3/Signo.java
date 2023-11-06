
package boletin7_3;


public class Signo {
    
  private int num1;

	public Signo() {

	}


	public void setNum1(int n1) {

	num1=n1;
	}

	public void dameSignos() {

		if(num1==0) {
			System.out.println("0");
		}
                else{
                    if(num1>0) {
			System.out.println("+");
                        
                  }  
                    else{
                        System.out.println("-");
                        
		}
                }
		
		
	}

  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
