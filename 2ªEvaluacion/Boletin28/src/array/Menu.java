
package array;


import javax.swing.*;

public class Menu {

	private static final int AÑADIR_EMPLEADO = 1;
	private static final int MOSTRAR_INFORMACIÓN = 2;
	private static final int BUSCAR_EMPLEADO = 3;
	private static final int ASIGNAR_INSTRUMENTO = 4;
	private static final int SALIR_GESTORÍA = 5;

	public void MenuOpciones() {

		int opcion = 0;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la gestoría de mi prima la pepa"
					+ " por favor, introduce la opción que más desees" + "\nopcion 1, (teclea 1) añadir un empleado"
					+ "\nopcion 2, (teclea 2) mostrar todos los empleados"
					+ "\nopcion 3, (teclea 3) Buscar un empleado por su nombre"
					+ "\nopcion 4, (teclea 4) asignaar un instrumento a un empleado"
					+ "\nopcion 5, (teclea 5) salir de la gestoría"));
		} while (opcion < 1 || opcion > 5);
		GestorDeEmpleados gestor = new GestorDeEmpleados();
		switch (opcion) {

		case AÑADIR_EMPLEADO:
			gestor.agregarEmpleado(GestorDeEmpleados.getMisempleados());
			break;
		case MOSTRAR_INFORMACIÓN:
			gestor.mostrarEmpleados(GestorDeEmpleados.getMisempleados());
			break;
		case BUSCAR_EMPLEADO:
			gestor.BuscarEmpleadoPorNombre(JOptionPane.showInputDialog("Introduce el nombre a buscar: "),
					GestorDeEmpleados.getMisempleados());
			break;
		case ASIGNAR_INSTRUMENTO:
			gestor.tocar();
			break;
		case SALIR_GESTORÍA:

			break;
		}

	}
}
