
package boletin7_5;


public class Mayor {
 
    private int num1,num2,num3;

     public Mayor() {

     }

     public void setNum1(int n1) {
    	 num1=n1;
     }
	public void setNum2(int n2) {
		num2=n2;
	}
	public void setNum3(int n3) {
		num3=n3;
	}

	public void dameMayor() {

		if(num3>num1&num3>num2) {
			System.out.println("El número mayor es: " + num3);
		}
		else {
			if(num2>num1&num2>num3) {
				System.out.println("El número mayor es: " + num2);
			}
                        else{
                            System.out.println("El número mayor es: " + num1);
                        }
		}

	}

    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
