
package array;

import java.util.*;
import javax.swing.*;
import interfaz.*;

public class GestorDeEmpleados implements InstrumentoMusical {

	private static ArrayList<Empleado> misempleados = new ArrayList<>();
	Menu menu = new Menu();

	public void agregarEmpleado(ArrayList<Empleado> array) {
		try {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado: ");
			String departamento = JOptionPane.showInputDialog("Introduce el nombre del departamento del empleado: ");
			Float sueldo = Numeros.FloatPositivo("Introduce el sueldo del empleado: ");
			array.add(new Empleado(nombre, departamento, sueldo));
			menu.MenuOpciones();
		} catch (RuntimeException e) {
			System.out.println("Vaya!, ha ocurrido un error al introducir los datos");
			menu.MenuOpciones();
		}

	}

	public void mostrarEmpleados(ArrayList<Empleado> array) {

		if (array.isEmpty()) {
			System.out.println("No hay empleados todavía, volviendo al menu");
			menu.MenuOpciones();
		}
		for (Empleado e : array) {

			System.out.println(e);

		}
		menu.MenuOpciones();

	}

	public void BuscarEmpleadoPorNombre(String nombreabuscar, ArrayList<Empleado> array) {
		if (array.isEmpty()) {
			System.out.println("No hay empleados todavía, volviendo al menu");
			menu.MenuOpciones();
		}
		int indice = 0;
		Boolean marca = null;
		for (Empleado e : array) {

			if (e.getNombre().equalsIgnoreCase(nombreabuscar)) {
				marca = true;
				System.out.println(array.get(indice));
				menu.MenuOpciones();
			}
			indice++;
		}
		if (marca == null) {
			System.out.println("No hay coincidencias, volviendo al menu");
			menu.MenuOpciones();
		}

	}

	@Override
	public void tocar() {

		System.out.println("Vamos a asignar un instrumento a un empleado, escoge entre estos nombres");
		System.out.println();
		for (Empleado e : misempleados) {

			System.out.println("Nombres de los empleados: " + e.getNombre());

		}
		String nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
		Boolean marca = null;
		for (Empleado e : misempleados) {

			if (nombre.equalsIgnoreCase(e.getNombre())) {
				String instrumento = JOptionPane.showInputDialog("Introduce el instrumento que va a tocar: ");

				System.out
						.println("El empleado " + e.getNombre() + ", toca la/el" + instrumento + " y lo hace de pena");
				menu.MenuOpciones();

			}

		}
		if (marca == null) {
			System.out.println("No hay coincidencias, volviendo al menu");
			menu.MenuOpciones();
		}

	}

	public static ArrayList<Empleado> getMisempleados() {
		return misempleados;
	}

	public static void setMisempleados(ArrayList<Empleado> misempleados) {
		GestorDeEmpleados.misempleados = misempleados;
	}



}
