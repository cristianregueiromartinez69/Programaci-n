package boletin27_segundaversion;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.*;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.FileReader;
import java.io.BufferedReader;
/**
 * Clase biblioteca en donde vamos a gestionar todos los metodos de nuestros
 * ficheros
 *
 * @author cristian
 * @version 1.2
 */
public class Biblioteca {

    public static ArrayList<Libro> mislibros = new ArrayList<>(); // Lista donde guardaremos los libros
	public static LinkedList<String> misficheros = new LinkedList<>(); // lista donde guardaremos las rutas de los
																		// ficheros
	public static TreeSet<String> titulos = new TreeSet<>(); // lista donde guardaremos el nombre de los titulos por
																// orden alfabetico
	public static String ruta_archivo = ""; // la variable que será la ruta del archivo

	/**
	 * Metodo para añadir ficheros a la libreria
	 */
	public void añadeLibro() {

		Boolean encontrado = false;
		try {
			/**
			 * Mientras encontrado sea diferente de falso, nos seguirá pidiendo datos
			 */
			while (!encontrado) {
				ruta_archivo = JOptionPane.showInputDialog("Introduce el nuevo libro, (tiene que acabar en .txt)");
				/**
				 * Si el archivo no tiene la extension .txt, la vuelve a pedir, si la tiene,
				 * vamos al if
				 */
				if (ruta_archivo != null && ruta_archivo.endsWith(".txt")) {
					encontrado = true;
					misficheros.add(ruta_archivo); // se añade el fichero a la lista
					String aux_nombre = JOptionPane.showInputDialog("Introduce el nombre del libro");
					String aux_autor = JOptionPane.showInputDialog("Introduce el nombre del autor del libro: ");
					float aux_precio = LibreriaPersonal.FloatPositivo("Introduce el precio del Libro: ");
					int aux_unidades = LibreriaPersonal.IntPositivo("Introduce las unidades del libro: ");
					// pedimos que introduzca los datos
					/**
					 * Una vez los datos se introducen, se pasan a escribir al archivo
					 */
					FileWriter fr = new FileWriter(ruta_archivo);
					BufferedWriter bf = new BufferedWriter(fr);
					bf.write("Nombre del libro: " + aux_nombre + "\n");
					bf.write("Nombre del autor: " + aux_autor + "\n");
					bf.write("Precio del libro: " + aux_precio + "€" + "\n");
					bf.write("Unidades del libro: " + aux_unidades + "\n");
					bf.close();
					mislibros.add(new Libro(aux_nombre, aux_autor, aux_precio, aux_unidades)); // se añade un libro a la
																								// lista
					titulos.add(aux_nombre); // se añade un titulo a la lista
					Menu volveramenu = Menu.getInstance();
					volveramenu.MenuOpciones();

				} else {
					JOptionPane.showMessageDialog(null, "Incorrecto");
				}
			}
			/**
			 * Capturamos las excepciones que se puedan producir durante el programa
			 */
		} catch (IOException e) {

			JOptionPane.showMessageDialog(null, "Vaya, ha ocurrido un error inesperado, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones();
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null,
					"Vaya, ha ocurrido un error durante la introduccion de datos, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones();

		}

	}

	/**
	 * Metodo para que me diga el precio de un libro
	 */
	public void damePrecio() {
		if (mislibros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Vaya, Parece que no hay ningun libro, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones(); // si la lista está vacía, vamos al menu
		}
		try {
			Float aux_precio = 0f;
			Boolean marca = null;
			/**
			 * declaramos una variable titulo y pedimos al usuario que introduzca el titulo
			 * de un libro. Si coincide con alguno, le dará su precio Si no coinciden,
			 * volvemos al menu
			 */
			String titulo = JOptionPane.showInputDialog("Introduce o título do libro a modificar o prezo:"
					+ "\nTITULOS DE LOS LIBROS REGISTRADOS: " + "\n" + titulos);

			for (Libro l : mislibros) {

				if (titulo.equalsIgnoreCase(l.getNombre())) {
					aux_precio = l.getPrecio();
					marca = true;
					JOptionPane.showMessageDialog(null, "El precio del libro es de: " + aux_precio + "€");
					Menu volveramenu = Menu.getInstance();
					volveramenu.MenuOpciones();

				}

			}
			if (marca == null) {
				JOptionPane.showMessageDialog(null,
						"Vaya, Parece que no hay ningun libro que coincida, volviendo al menu");
				Menu volveramenu = Menu.getInstance();
				volveramenu.MenuOpciones();
			}
			/**
			 * capturamos las excepciones que se puedan dar en el programa
			 */
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null,
					"Vaya, ha ocurrido un error durante la introduccion de datos, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones();
		}
	}

	/**
	 * Metodo para que me dea los datos de un libro
	 */
	public void dameDatos() {
		try {

			if (mislibros.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Vaya, Parece que no hay ningun libro, volviendo al menu");
				Menu volveramenu = Menu.getInstance();
				volveramenu.MenuOpciones(); // si la lista está vacía, vamos al menu
			}

			String pregunta = JOptionPane.showInputDialog("¿Deseas realizar una consulta sobre algún libro? "
					+ "\nResponde (si) si quieres realizar una consulta "
					+ "\nresponde (no) si no quieres realizar una consulta");
			String afirmar = "si";
			String negar = "no";
			/**
			 * preguntamos al usuario si quiere realizar una consulta si dice que si, entra
			 * en el while si dice que no se sale y vuelve al menu
			 */
			while (pregunta.equalsIgnoreCase(afirmar)) {

				try {

					String titulo_consulta = JOptionPane
							.showInputDialog("Introduce el titulo del libro del que quieres saber los datos"
									+ "\nTITULOS DE LOS LIBROS REGISTRADOS: " + "\n" + titulos);
					ArrayList<String> aux_consulta = new ArrayList<>();

					int indice = 0;
					Boolean marca = null;
					/**
					 * Misma práctica que en los metodos anteriores, si alguno de los titulos
					 * coincide con los que están en la biblioteca, será leído por la clase
					 * FileReader
					 */
					for (Libro consulta : mislibros) {

						if (consulta.getNombre().equalsIgnoreCase(titulo_consulta)) {

							try {
								if (titulos.contains(consulta.getNombre())) {
									FileReader fr = new FileReader(misficheros.get(indice));
									BufferedReader br = new BufferedReader(fr);

									String linea;

									while ((linea = br.readLine()) != null) {
										System.out.println(linea);
									}

									br.close();

								}
							} catch (IOException e) {

								JOptionPane.showMessageDialog(null,
										"Vaya, ha ocurrido un error inesperado, volviendo al menu");
								Menu volveramenu = Menu.getInstance();
								volveramenu.MenuOpciones();
							}

						}

						indice++;
					}
					if (marca == null) {
						JOptionPane.showMessageDialog(null,
								"Vaya, Parece que no hay ningun libro que coincida, volviendo al menu");
						Menu volveramenu = Menu.getInstance();
						volveramenu.MenuOpciones(); // si no coincide ningun libro, volvemos al menu
					}

				} catch (RuntimeException e) {

					JOptionPane.showMessageDialog(null,
							"Vaya, ha ocurrido un error durante la introduccion de datos, volviendo al menu");
					Menu volveramenu = Menu.getInstance();
					volveramenu.MenuOpciones();
				}

				pregunta = JOptionPane.showInputDialog("¿Deseas volver a  realizar una consulta sobre algún libro? "
						+ "\nResponde (si) si quieres volver a  realizar una consulta "
						+ "\nresponde (no) si no quieres volver a realizar una consulta");
				afirmar = "si";
				negar = "no";
			}
			/**
			 * si contestamos que no, volveremos al menu
			 */
			if (pregunta.equalsIgnoreCase(negar)) {
				JOptionPane.showMessageDialog(null, "Muy bien, volviendo al menu");
				Menu volveramenu = Menu.getInstance();
				volveramenu.MenuOpciones();
			}
			/**
			 * capturamos cualquier excepcion que se pueda producir durante el programa
			 */
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null,
					"Vaya, ha ocurrido un error durante la introduccion de datos, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones();
		}
	}

	/**
	 * Metodo para borrar libros de a biblioteca
	 */
	public void borradLibro() {
		if (mislibros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Vaya, Parece que no hay ningun libro, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones(); // si la lista está vacía, volvemos al menu
		}
		try {

			Boolean marca = null;
			int indice = 0;
			JOptionPane.showMessageDialog(null,
					"Vamos a revisar los libros que tengan 0 unidades"
							+ "Si hay alguno que las tenga, será eliminado y se lo indicaremos con un mensaje"
							+ "En caso contrario, tambien se lo indicaremos");
			for (Libro borralibro : mislibros) {
				/**
				 * Aquí lo que hacemos es recorrer la lista de los libros y mirar si hay alguno
				 * que tenga las unidades al 0. En caso de que sea así, borramos cualquier
				 * registro del libro, también su fichero
				 */
				if (borralibro.getUnidades() == 0) {
					marca = true;
					mislibros.remove(indice);
					if (titulos.contains(borralibro.getNombre())) {
						titulos.remove(borralibro.getNombre());
					}
					File archivo = new File(misficheros.get(indice));
					if (archivo.exists()) {

						if (archivo.delete()) {
							JOptionPane.showMessageDialog(null, "Archivo borrado existosamente");
							Menu volveramenu = Menu.getInstance();
							volveramenu.MenuOpciones();
						} else {
							JOptionPane.showMessageDialog(null, "Lo sentimos, no hemos podido borrar el archivo");
							Menu volveramenu = Menu.getInstance();
							volveramenu.MenuOpciones();
						}
					}

				}

				indice++;
			}
			/**
			 * Si no hay ningún libro con 0 unidades, volvemos al menu
			 */
			if (marca == null) {
				JOptionPane.showMessageDialog(null, "No hay ningun libro con 0 unidades, volviendo al menu");
				Menu volveramenu = Menu.getInstance();
				volveramenu.MenuOpciones();

			}
			/**
			 * Capturamos cualquier excepción que se pueda producir durante el programa
			 */
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null,
					"Vaya, ha ocurrido un error durante la introduccion de datos, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones();

		}
	}

	/**
	 * Método para modificar el precio de un libro
	 */
	public void modificarPrecio() {
		if (mislibros.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Vaya, Parece que no hay ningun libro, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones(); // si la lista está vacía, volvemos al menú
		}
		try {

			Boolean marca = null;

			String titulo = JOptionPane
					.showInputDialog("Introduce el título del libro del que quieres modificar el precio:"
							+ "\nTITULOS DE LOS LIBROS REGISTRADOS: " + "\n" + titulos);
			int indice = 0;
			StringBuilder listaLibros = new StringBuilder(); // clase string builder para modificar el precio
			for (Libro modificaprecio : mislibros) {
				/**
				 * Mismo metodo que en los casos anteriores. Si el titulo dado, coincide con
				 * alguno de la lista entrará en el if, si no volvemos al menu
				 */
				if (titulo.equalsIgnoreCase(modificaprecio.getNombre())) {
					marca = true;
					Float nuevo_precio = LibreriaPersonal.FloatPositivo("Introduce el nuevo precio del Libro: "); // nuevo
																													// precio
																													// del
																													// libro
					/**
					 * Modificamos el fichero e incluímos el nuevo precio del libro
					 */
					listaLibros.append("Nombre del libro: ").append(modificaprecio.getNombre()).append("\n");
					listaLibros.append("Nombre del autor: ").append(modificaprecio.getAutor()).append("\n");
					listaLibros.append("Precio del libro: ").append(nuevo_precio).append("€\n");
					listaLibros.append("Unidades del libro: ").append(modificaprecio.getUnidades()).append("\n");

					try {
						/**
						 * Una vez hecho lo anterior, toca escribir de nuevo el fichero, modificando el
						 * precio
						 */
						FileWriter writer = new FileWriter(misficheros.get(indice));
						writer.write(listaLibros.toString());
						writer.close();

						System.out.println(
								"Precio del libro '" + modificaprecio.getNombre() + "' modificado correctamente.");
						// si todo salió bien, sacaremos un mensaje en la consola
						/**
						 * Modificamos el precio del libro en la lista para que quede reflejado
						 */
						modificaprecio.setPrecio(nuevo_precio);
						mislibros.set(indice, modificaprecio);

						Menu volveramenu = Menu.getInstance();
						volveramenu.MenuOpciones();
					} catch (IOException e) {
						System.out.println("Ocurrió un error al modificar el precio del libro: " + e.getMessage());
						Menu volveramenu = Menu.getInstance();
						volveramenu.MenuOpciones();
					}

				}
				indice++;
			}
			if (marca == null) {
				JOptionPane.showMessageDialog(null,
						"Vaya, Parece que no hay ningun libro que coincida, volviendo al menu");
				Menu volveramenu = Menu.getInstance();
				volveramenu.MenuOpciones(); // si no hay coincidencia, volvemos al menu
			}
			/**
			 * Capturamos cualquier excepcion que se pueda cometer durante el programa
			 */
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null,
					"Vaya, ha ocurrido un error durante la introduccion de datos, volviendo al menu");
			Menu volveramenu = Menu.getInstance();
			volveramenu.MenuOpciones();
		}
	}
}
