
package boletin_extra2;

public class Conta {
    
        private String nombre;
	private String numero_cuenta;
	private double tipo_interes;
	private double saldo;

	public Conta(){

	}

	public Conta(String nom, String numC, double tipo_i, double sal){

		nombre=nom;
		numC=numero_cuenta;
		tipo_interes=tipo_i;
		saldo=sal;
	}


	public void setNombre(String nom) {
		nombre=nom;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNumerocuenta(String numC) {
		numero_cuenta=numC;

	}
	public String getNumerocuenta() {
		return numero_cuenta;
	}
	public void setTipointeres(double tipo_i) {
		tipo_interes=tipo_i;
	}
	public double getTipointeres() {
		return tipo_interes;
	}
	public void setSaldo(double sal) {
		saldo=sal;
	}
	public double getSaldo() {
		return saldo;
	}
	public void Caracteristicas_generales() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Número de cuenta: " + numero_cuenta);
		System.out.println("Tipo de interés: " + tipo_interes + "%");
		System.out.println("Saldo: " + saldo + " euros");


	}
	public void setIngreso(double ing) {
		saldo=saldo+ing;
	}
	public double getIngreso() {
		return saldo;
	}
	public void setReintegro(double re) {
		saldo=saldo-re;
	}
	public double getReintegro() {
		return saldo;
	}
	public void Transferencia(String numCuenta, double trans) {

		double Transferencia=trans;

	}



  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
