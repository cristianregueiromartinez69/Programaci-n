
package boletin17;
import java.util.Scanner;
import javax.swing.*;

public class Conta {
   
    
  private long num_conta;
	  private double saldo;
	  private Persoa cliente;

	    public Conta() {

	    }

	    public Conta(long num_conta, Persoa cliente) {
	        this.num_conta = num_conta;
	        this.cliente = cliente;
	    }


	    public long getNum_conta() {
	        return num_conta;
	    }

	    public void setNum_conta(long num_conta) {
	        this.num_conta = num_conta;
	    }

	    public double getSaldo() {
	        return saldo;
	    }

	    public void setSaldo(double saldo) {
	        this.saldo = saldo;
	    }

	    public Persoa getCliente() {
	        return cliente;
	    }

	    public void setCliente(Persoa cliente) {
	        this.cliente = cliente;
	    }

	    public void ingresar(double cant){
	        saldo+=cant;
	        System.out.println("Su saldo actual es de: " + saldo);
	   }

	    public void retirar(double cant){

	       if(saldo==0){
	           System.out.println("No se puede retirar dinero de la cuenta");
	       }
	       else if(saldo>0){
	           saldo-=cant;
	       }

	       }


	    public void actualizarSaldo(){



       for(int i=0;i<6;i++) {
    	   int opcion=Integer.parseInt(JOptionPane.showInputDialog("Seleccione la cuenta que desea hacer:" + 
                  "\nteclea 1 para corriente y teclea 2 para ahorro" + "\nopcion 1: cuenta corriente" + "\nopcion 2: cuenta ahorro:"));
	        //indicamos que seleccione un tipo de cuenta
           switch(opcion){
                            //cuenta corriente e introducimos los datos del cliente
	           case 1:  Persoa p1=new Persoa(JOptionPane.showInputDialog("Introduce el nombre: "),
	        		   JOptionPane.showInputDialog("Introduce los apellidos: "),
	        		   JOptionPane.showInputDialog("Introduce tu dni: "));

	        	   Conta cr1=new CuentaCorriente(Long.parseLong(JOptionPane.showInputDialog("Introduce la cuenta: ")),
	           p1);
	           cr1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo: ")));
                   while(cr1.getSaldo()<=0){
                       cr1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("No se admiten los saldos negativos o sin saldo, vuelve a introducirlo: "))); 
                   }
	           String in="ingreso";
	           String re="retirada";

	           String accion=JOptionPane.showInputDialog("¿Deseas realizar un ingreso o retirada?" + "\n si es así, teclea ingreso para realizar ingreso o retirada para realizar retirada" + 
                           "\n si no es así, teclea no");
	           if(accion.equalsIgnoreCase(in)) {
	        	   cr1.ingresar(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a ingresar: ")));

	           }
	           else if(accion.equalsIgnoreCase(re)) {
	        	   cr1.retirar(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a retirar: ")));
	           }
	           double interes=(cr1.getSaldo()*CuentaCorriente.getInteresFijo())/100;
	               JOptionPane.showConfirmDialog(null, "Datos de la cuenta: " + "\ncliente: " + 
                               p1 + "\nsaldo: " + cr1.getSaldo() + " euros" + "\ntipo de interes de la cuenta: " + CuentaCorriente.getInteresFijo() + " %");

	           break;
                         //cuenta ahorro e introducimos los datos del cliente
	           case 2:
	        	   Persoa p2=new Persoa(JOptionPane.showInputDialog("Introduce el nombre: "),
	        			   JOptionPane.showInputDialog("Introduce los apellidos: "),
	        			   JOptionPane.showInputDialog("Introduce el dni: "));
	        	   Conta ca1=new CuentaAhorro(1.2,1000,Long.parseLong(JOptionPane.showInputDialog("Introduce la cuenta: ")),
	           p2);
	          ca1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Introduce el saldo, tiene que ser mayor o igual que 1000: ")));
	          while(ca1.getSaldo()<1000) {
	        	  ca1.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("Saldo incorrecto, vuelve a intentarlo: ")));
	          }
	           accion=JOptionPane.showInputDialog("¿Deseas realizar un ingreso o retirada?" + "\n si es así, teclea ingreso para realizar ingreso o retirada para realizar retirada" + 
                           "\n si no es así, teclea no");
	           in="ingreso";
	           re="retirada";
	           if(accion.equalsIgnoreCase(in)) {
	        	   ca1.ingresar(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a ingresar: ")));

	           }
	           else if(accion.equalsIgnoreCase(re)) {
	        	   ca1.retirar(Double.parseDouble(JOptionPane.showInputDialog("Introduce la cantidad a retirar: ")));
	           }

	          double interes2=(ca1.getSaldo()*CuentaCorriente.getInteresFijo())/100;
	         JOptionPane.showConfirmDialog(null, "Datos de la cuenta: " + "\ncliente: " + 
                               p2 + "\nsaldo: " + ca1.getSaldo() + " euros" + "\ntipo de interes de la cuenta: " + CuentaAhorro.getInteres_variable() + " %");

                   break;
                   default: System.out.println("Opcion incorrecta, vuelve a intentarlo");
	      }

       }
	    }








	    @Override
	    public String toString() {
	        return "Conta: " + "numero de conta: " + num_conta + ", saldo: " + saldo + ", cliente: " + cliente;
	    }











    
    
    
    
    
    
    
}
