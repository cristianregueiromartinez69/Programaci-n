
package boletin12_coche;

public class Garaxe {
    
 static int numeroCoches;
	  private Coche c1;
	  private Coche c2;
	  private Coche c3;
	  private Coche c4;
	  private Coche c5;

	    public Garaxe() {
	    }

	    public Garaxe(Coche c1, Coche c2, Coche c3, Coche c4, Coche c5) {
	        this.c1 = c1;
	        this.c2 = c2;
	        this.c3 = c3;
	        this.c4 = c4;
	        this.c5 = c5;
	    }


	    public Coche getC1() {
	        return c1;
	    }

	    public void setC1(Coche c1) {
	        this.c1 = c1;
	    }

	    public Coche getC2() {
	        return c2;
	    }

	    public void setC2(Coche c2) {
	        this.c2 = c2;
	    }

	    public Coche getC3() {
	        return c3;
	    }

	    public void setC3(Coche c3) {
	        this.c3 = c3;
	    }

	    public Coche getC4() {
	        return c4;
	    }

	    public void setC4(Coche c4) {
	        this.c4 = c4;
	    }

	    public Coche getC5() {
	        return c5;
	    }

	    public void setC5(Coche c5) {
	        this.c5 = c5;
	    }

	    @Override
	    public String toString() {
	        return "Garaxe{" + "coche1=" + c1 + ", coche2=" + c2 + ", coche3=" + c3 + ", coche4=" + c4 + ", coche5=" + c5 + '}';
	    }

          
  
      
      
  }  
    
    
    
    
    
    
    
    
    
    

