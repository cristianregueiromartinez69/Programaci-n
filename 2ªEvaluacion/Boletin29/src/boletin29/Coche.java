
package boletin29;

public class Coche implements Vehiculo {

	@Override
	public void arrancar() {

		System.out.println("Arrancando el coche");
	}

	@Override
	public void detener() {

		System.out.println("Deteniendo el coche");
	}

	@Override
	public void acelerar() {

		System.out.println("Metiendole caña a este coche");
	}

}
