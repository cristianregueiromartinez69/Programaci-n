
package boletin17;


public class CuentaAhorro extends Conta {
   
    
    private static double interes_variable;
    private double saldo_minimo=1000;

    public CuentaAhorro() {

    }

    public CuentaAhorro(double interes_variable, double saldo_minimo, long num_conta, Persoa cliente) {
        super(num_conta, cliente);
        this.interes_variable = interes_variable;
        this.saldo_minimo = saldo_minimo;
    }

    public static double getInteres_variable() {
        return interes_variable;
    }

    public static void setInteres_variable(double interes_variable) {
        CuentaAhorro.interes_variable = interes_variable;
    }

    

    public double getSaldo_minimo() {
        return saldo_minimo;
    }

    public void setSaldo_minimo(double saldo_minimo) {
        this.saldo_minimo = saldo_minimo;
    }




    public void cambioInteres(double iv){

        interes_variable=iv;
    }


    @Override
    public String toString() {
        return "CuentaAhorro: " + "interes variable=" + interes_variable + ", saldo minimo=" + saldo_minimo;
    }






    
    
    
}
