
package boletin17;


public class CuentaCorriente extends Conta {
    
    
    
    private static final double  INTERES_FIJO=1.5d;

	    public CuentaCorriente() {
	    }

	    public CuentaCorriente(long num_conta, Persoa cliente) {
	        super(num_conta, cliente);
	    }






		public static double getInteresFijo() {
			return INTERES_FIJO;
		}

		@Override
	    public String toString() {
	        return "CuentaCorriente: " + "interes fijo de la cuenta: " + INTERES_FIJO;
	    }



}

    
    
    
    
    
    
    
    
    
    
    
    
    
    

