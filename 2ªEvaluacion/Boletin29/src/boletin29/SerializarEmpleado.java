package boletin29;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class SerializarEmpleado {

	ArrayList<Empleado> misempleados = new ArrayList<>();

	public void GuardarEmpleado() {
		String afirmar = "si";
		String pregunta;
		JOptionPane.showMessageDialog(null, "Vamos a añadir a un empleado");
		do {

			try {
				String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado: ");
				int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ID del empleado: "));
				String departamento = JOptionPane
						.showInputDialog("Introduce el departamento en el que va a trabajar el empleado: ");
				misempleados.add(new Empleado(nombre, id, departamento));
			} catch (RuntimeException e) {
				System.out.println("Error al introducir los datos, vuelve a intentarlo");
				SerializarEmpleado error = new SerializarEmpleado();
				error.GuardarEmpleado();
			}
			try {
				FileOutputStream fileOut = new FileOutputStream("empleado.ser");
				ObjectOutputStream out = new ObjectOutputStream(fileOut);
				out.writeObject(misempleados);
				System.out.println("Objeto serializado guardado en persona.ser");
			} catch (Exception e) {
				e.printStackTrace();
			}
			pregunta = JOptionPane.showInputDialog("Quieres añadir otro empleado? ");
		} while (pregunta.equalsIgnoreCase(afirmar));

	}

	public void cargarEmpleado() {

		JOptionPane.showMessageDialog(null, "Vamos a cargar a un empleado");

		try {
			FileInputStream fu = new FileInputStream("empleado.ser");
			ObjectInputStream ois = new ObjectInputStream(fu);
			ArrayList<Empleado> empleadosdeserealizados = (ArrayList<Empleado>) ois.readObject();
			System.out.println("ArrayList de Libros deserializado correctamente:");
			for (Empleado miempleado : empleadosdeserealizados) {
				System.out.println(miempleado);
			}
			ois.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
