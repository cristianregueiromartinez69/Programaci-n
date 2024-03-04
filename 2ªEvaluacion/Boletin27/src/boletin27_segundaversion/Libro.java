
package boletin27_segundaversion;

import java.io.File;

/**
 * Clase Libro con sus atributos y metodos
 *
 * @author cristian
 * @version 1.2
 */
public class Libro {
    
         /**
	 * atributos privados de la clase libro
	 */
	private String nombre;
	private String autor;
	private float precio;
	private int unidades;

	/**
	 * Contructor que le da un estado inicial a nuestro objeto Libro
	 *
	 * @param nombre:   nombre del libro
	 * @param autor:    autor del libro
	 * @param precio:   precio del libro
	 * @param unidades: numero de unidades del libro
	 */
	public Libro(String nombre, String autor, float precio, int unidades) {
		this.nombre = nombre;
		this.autor = autor;
		this.precio = precio;
		this.unidades = unidades;

	}

	/**
	 * Constructor sin parametros por si nos hiciera falta para algo
	 */
	public Libro() {

	}

	/**
	 * Metodos getter y setter de los atributos de la clase libro
	 *
	 * @return: el valor correspondiente
	 */
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getUnidades() {
		return unidades;
	}

	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}

	/**
	 * Metodo tostring para imprimir los atributos del libro
	 */

	@Override
	public String toString() {
		return "Libro: " + "\nnombre: " + nombre + "\nautor: " + autor + "\nprecio: " + precio + "\nunidades: "
				+ unidades;
	}

    
}
