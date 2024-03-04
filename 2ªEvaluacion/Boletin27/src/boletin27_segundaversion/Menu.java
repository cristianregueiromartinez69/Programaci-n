package boletin27_segundaversion;

import javax.swing.*;
import java.util.*;

/**
 * Clase menu en donde eligiremos las opciones a ejecutar de nuestra biblioteca
 *
 * @author cristian
 * @version 1.2
 */
public class Menu {

   
	/**
	 * atributos estaticos y finales que serás las acciones que haremos en la
	 * biblioteca
	 *
	 */
	private static final int AÑADIR_LIBRO = 1;
	private static final int CONSULTAR_PRECIO_LIBRO = 2;
	private static final int MOSTRAR_DATOS_LIBRO = 3;
	private static final int BORRAR_LIBRO = 4;
	private static final int MODIFICAR_PRECIO_LIBRO = 5;
	private static final int SALIR_LIBRERIA = 6;
	/**
	 * esta es nuestra instancia que de momento es nula
	 */
	private static Menu instance = null;

	/**
	 * Constructor privado para nuestro singleton, ya que vamos a instanciar la
	 * clase varias veces
	 */
	private Menu() {

	}

	/**
	 * Nuestro metodo MenuOpciones para escoger la accion en la biblioteca
	 */
	public void MenuOpciones() {
		try {

			int opcion = 0;
			do {
				/**
				 * pedimos al usuario que introduzca la opcion que mas le guste pero si es menor
				 * que 1 o mayor que 6, tendrá que volver a hacerlo
				 */
				opcion = Integer.parseInt(
						JOptionPane.showInputDialog("Bienvenido a la libreria, introduce la opcion que más te agrade: "
								+ "\nEN TODAS LAS OPCIONES DEBES TECLEAR LO QUE APARECE ENTRE PARENTESIS"
								+ "\nOpcion 1: (añadir un libro) " + "\nOpcion 2: (consultar un precio de un libro)"
								+ "\nOpcion 3: (mostrar los datos de un libro)"
								+ "\nOpcion 4: (borrar un libro con 0 unidades)"
								+ "\nOpcion 5: (ponerle un nuevo precio a un libro)"
								+ "\nOpcion 6: (salir de la biblioteca)"));
			} while (opcion < 1 || opcion > 6);

			Biblioteca menubiblioteca = new Biblioteca();
			/**
			 * Dependiendo de la opcion escogida, llamamos a un metodo o a otro
			 */
			switch (opcion) {

			case AÑADIR_LIBRO:
				menubiblioteca.añadeLibro();
				break;
			case CONSULTAR_PRECIO_LIBRO:
				menubiblioteca.damePrecio();
				break;
			case MOSTRAR_DATOS_LIBRO:
				menubiblioteca.dameDatos();
				break;
			case BORRAR_LIBRO:
				menubiblioteca.borradLibro();
				break;
			case MODIFICAR_PRECIO_LIBRO:
				menubiblioteca.modificarPrecio();
				break;
			case SALIR_LIBRERIA:
				System.exit(0);
				break;

			}
			/**
			 * En caso de introducir algo que no es un numero, recogemos la excepcion y
			 * volvemos al menu
			 */
		} catch (RuntimeException e) {
			JOptionPane.showMessageDialog(null,
					"Vaya, parece que algo ha salido mal en la introducción de datos, volviendo al menu");
			Menu menu = Menu.getInstance();
			menu.MenuOpciones();
		}
	}

	/**
	 * Metodos getter de los atributos estaticos y finales
	 *
	 * @return: el valor correspondiente
	 */
	public static int getAñadirLibro() {
		return AÑADIR_LIBRO;
	}

	public static int getConsultarPrecioLibro() {
		return CONSULTAR_PRECIO_LIBRO;
	}

	public static int getMostrarDatosLibro() {
		return MOSTRAR_DATOS_LIBRO;
	}

	public static int getBorrarLibro() {
		return BORRAR_LIBRO;
	}

	public static int getModificarPrecioLibro() {
		return MODIFICAR_PRECIO_LIBRO;
	}

	public static int getSalirLibreria() {
		return SALIR_LIBRERIA;
	}

	/**
	 * metodo que nos servirá para instanciar la clase menu las veces que queramos
	 * pero siendo siempre el mismo objeto
	 *
	 * @return: el objeto de tipo menu
	 */
	public static Menu getInstance() {

		if (instance == null) {

			instance = new Menu();
		}
		return instance;

	}


}
