package boletin26;
import java.util.*;
import javax.swing.*;



/**
 * Clase generica que extiende de Comparable para realizar diferentes operaciones
 * @param <T> un dato de cualquier tipo, ya que es generico
 */
public class Operaciones<T extends Comparable<T>> {

/**
 * Este metodo calcula el dato minimo de un arraylist
 * @param el arraylist que pasemos por parametro al llamar al metodo
 */
	public void dameMinimo(ArrayList<T> array) {

		if(array.isEmpty()) {

			throw new IllegalArgumentException("Vaya, algo ha salido mal");
		}
		else {

			T min=array.iterator().next();
			for(T elemento:array) {

				if(elemento.compareTo(min)<0) {

					min=elemento;
				}
			}

			System.out.println("El elemento minimo es: " + min);

		}

	}

    /**
     * Este metodo calcula el dato maximo de un arraylist de cualquier tipo
     * @param el arraylist que pasaremos por parametro al llamar al metodo
     */
	public void dameMaximo(ArrayList<T> array) {

		if(array.isEmpty()) {

			throw new IllegalArgumentException("Vaya, algo ha salido mal");
		}
		else {

			T max=array.iterator().next();
			for(T elemento:array) {

				if(elemento.compareTo(max)>0) {

					max=elemento;
				}
			}

			System.out.println("El elemento maximo es: " + max);

		}

	}

	/**
	 * Este metodo busca un numero dentro del arraylist
	 * @param el arraylist que pasaremos por parametro al llamar al metodo
	 */

	public void BuscarObjeto(ArrayList<T> array) {

	if(array.isEmpty()) {

			throw new IllegalArgumentException("Vaya, algo ha salido mal");
		}



	int numero=0;
	int indice=0;
	int no_encontrado=-1;
	try {
	 numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a buscar: "));
	}catch(NumberFormatException f) {
		System.out.println("Numero incorrecto");

	}
	System.out.println("Busqueda de elemento:");
	System.out.println();

	for(T elemento:array) {

		if(elemento.equals(numero)) {

			System.out.println("El indice del elemento buscado es: " + indice);
			break;
		}

		/**
		 * Si no encuentra nada, devuelve -1
		 */

		else {

			System.out.println(no_encontrado);

		}
		indice++;

	}



	}
	/**
	 * este metodo borra un elemento que nosotros le digamos
	 * @param el arraylist que pasaremos por parametro al llamar al metodo
	 */

	public void borraElemento(ArrayList<T> array) {

     if(array.isEmpty()) {

			throw new IllegalArgumentException("Vaya, algo ha salido mal");
		}


     int numero=0;
     try {
    	 numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero a borrar: "));
    	}catch(NumberFormatException f) {
    		System.out.println("Numero incorrecto");

    	}

     int indice=0;
     Integer no_encontrado=0;
     System.out.println("Elementos a borrar: ");
     System.out.println();
     for(T elemento:array) {

    	 if(elemento.equals(numero)) {

    		 System.out.println("Numero a borrar: " + array.remove(indice));
    		 break;

    	 }

    	 /**
    	  * SI no hay nada, devuelve un nulo
    	  */

    	 else {
    		 no_encontrado=null;
    	System.out.println(no_encontrado);

    	 }



     }



	}






}


