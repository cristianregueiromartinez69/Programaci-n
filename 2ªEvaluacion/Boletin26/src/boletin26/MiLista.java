package boletin26;
import java.util.*;
/**
 * Clase MiLista donde tenemos el arraylist que utilizaremos en este programa
 */
public class MiLista {

	/**
	 * Mi arraylist que lo hacemos privado, será de edades, por tanto es Integer
	 */
	private static ArrayList<Integer>edades=new ArrayList<>();

	public MiLista() {



	}

	/**
	 * Metodo que recibe por parametro Un arrayList de Integers y añade valores con el math.random
	 * @param un arraylist de enteros
	 * @return el arraylist de enteros
	 */
	public static ArrayList<Integer> misedades(ArrayList<Integer> edad){

		for(int i=0;i<15;i++) {
			int num=(int)(Math.random()*100)+1;
			edad.add(num);

		}



		return edad;
	}

	/**
	 * Metodo getter que devuelve el arraylist de edades
	 * @return el arraylist de edades
	 */

	public static ArrayList<Integer> getEdades() {
		return edades;
	}






}
