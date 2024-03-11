
package array;
import javax.swing.JOptionPane;


public class Menu2 {

	private static final int AÑADIR_EMPLEADO = 1;
	private static final int ELIMINAR_EMPLEADO = 2;
	private static final int LISTAR_EMPLEADO = 3;
	private static final int ASIGNAR_INSTRUMENTO = 4;
	private static final int SALIR_GESTORÍA = 5;

	public void MenuOpciones2() {
		int opcion = 0;
		do {
			opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a la gestoría de mi prima la pepa"
					+ " por favor, introduce la opción que más desees" + "\nopcion 1, (teclea 1) añadir un empleado"
					+ "\nopcion 2, (teclea 2) borrar a un empleado"
					+ "\nopcion 3, (teclea 3) listar los empleados con su informacion"
					+ "\nopcion 4, (teclea 4) asignar un instrumento a un empleado"
					+ "\nopcion 5, (teclea 5) salir de la gestoría"));
		} while (opcion < 1 || opcion > 5);
		GestorDeEmpleados2 gestor2 = new GestorDeEmpleados2();
		switch (opcion) {

		case AÑADIR_EMPLEADO:
			gestor2.agregar();
			break;
		case ELIMINAR_EMPLEADO:
			gestor2.eliminar(JOptionPane.showInputDialog("Introduce el nombre a buscar para despedir al becario: "));
			break;
		case LISTAR_EMPLEADO:
			gestor2.listar();

			break;
		case ASIGNAR_INSTRUMENTO:
			gestor2.tocar();
			break;
		case SALIR_GESTORÍA:
			break;
		}

	}

}