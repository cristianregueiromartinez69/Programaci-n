
package boletin29;

import java.util.*;

public class Coleccion {

	ArrayList<String> nombres = new ArrayList<>();
	HashSet<Integer> edades = new HashSet<>();
	Scanner sc = new Scanner(System.in);

	public void añadeValorArrayString() {

		for (int i = 0; i < 8; i++) {
			System.out.println("Escribe un nombre: ");
			nombres.add(sc.nextLine());
		}

		for (String nombre : nombres) {
			System.out.println(nombre);
		}
	}

	public void añadeValoryEliminaValorEdades() {

		for (int i = 0; i < 8; i++) {
			System.out.println("Escribe una edad: ");
			edades.add(sc.nextInt());
		}
		System.out.println("Lista antes de eliminar: ");
		for (int edad : edades) {

			System.out.println(edad);

		}

		Iterator<Integer> iterador = edades.iterator();
		while (iterador.hasNext()) {
			int numero = iterador.next();
			if (numero % 2 == 0) {
				iterador.remove();
			}
		}
		System.out.println();
		System.out.println("Lista después de eliminar: ");
		for (int edad : edades) {

			System.out.println(edad);

		}

	}

}
