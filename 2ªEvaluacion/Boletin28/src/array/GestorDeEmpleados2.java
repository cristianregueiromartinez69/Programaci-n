
package array;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import interfaz.*;

public class GestorDeEmpleados2 implements Administrable, InstrumentoMusical {
	private static ArrayList<Empleado> misempleados2 = new ArrayList<>();
	Menu2 menu2 = new Menu2();

	@Override
	public void agregar() {
		try {
			String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado: ");
			String departamento = JOptionPane.showInputDialog("Introduce el nombre del departamento del empleado: ");
			Float sueldo = Numeros.FloatPositivo("Introduce el sueldo del empleado: ");
			misempleados2.add(new Empleado(nombre, departamento, sueldo));
			menu2.MenuOpciones2();
		} catch (RuntimeException e) {
			System.out.println("Vaya!, ha ocurrido un error al introducir los datos");
			menu2.MenuOpciones2();
		}
	}

	@Override
	public void eliminar(String nombreabuscar) {
		if (misempleados2.isEmpty()) {
			System.out.println("No hay empleados todavía, volviendo al menu");
			menu2.MenuOpciones2();
		}
		int indice = 0;
		Boolean marca = null;
		for (Empleado e : misempleados2) {

			if (e.getNombre().equalsIgnoreCase(nombreabuscar)) {
				marca = true;
				misempleados2.remove(indice);
				System.out.println("Empleado borrado exitosamente");
			}
			indice++;
		}

		if (marca == null) {
			System.out.println("No hay coincidencias, volviendo al menu");
			menu2.MenuOpciones2();
		}

	}

	@Override
	public void listar() {
		if (misempleados2.isEmpty()) {
			System.out.println("No hay empleados todavía, volviendo al menu");
			menu2.MenuOpciones2();
		}
		for (Empleado e : misempleados2) {

			System.out.println(e);

		}
		menu2.MenuOpciones2();
	}

	@Override
	public void tocar() {
		System.out.println("Vamos a asignar un instrumento a un empleado, escoge entre estos nombres");
		System.out.println();
		for (Empleado e : misempleados2) {

			System.out.println("Nombres de los empleados: " + e.getNombre());

		}
		String nombre = JOptionPane.showInputDialog("Introduce el nombre: ");
		Boolean marca = null;
		for (Empleado e : misempleados2) {

			if (nombre.equalsIgnoreCase(e.getNombre())) {
				String instrumento = JOptionPane.showInputDialog("Introduce el instrumento que va a tocar: ");

				System.out
						.println("El empleado " + e.getNombre() + ", toca la/el" + instrumento + " y lo hace de pena");
				menu2.MenuOpciones2();

			}

		}
		if (marca == null) {
			System.out.println("No hay coincidencias, volviendo al menu");
			menu2.MenuOpciones2();
		}

	}

}
