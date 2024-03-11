package boletin29;

public class Motocicleta implements Vehiculo {

	@Override
	public void arrancar() {

		System.out.println("Arrancando la mierda de moto");
	}

	@Override
	public void detener() {

		System.out.println("Deteniendo en seco la mierda de moto");
	}

	@Override
	public void acelerar() {

		System.out.println("Intentando arrancar la moto, pero es como la xavineta, echa humo y no arranca");
	}

}
