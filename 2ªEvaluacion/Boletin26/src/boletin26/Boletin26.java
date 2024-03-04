
package boletin26;

import java.util.*;


public class Boletin26 {

    public static void main(String[] args) {

        	/**
		 * Llamamos a los metodos correspondientes y ejecutamos el programa
		 */
		System.out.println("Lista de edades");
		System.out.println(MiLista.misedades(MiLista.getEdades()));
		System.out.println();

		Operaciones <Integer> op = new Operaciones <>();
		op.dameMinimo(MiLista.getEdades());
		op.dameMaximo(MiLista.getEdades());
		op.BuscarObjeto(MiLista.getEdades());
		op.borraElemento(MiLista.getEdades());
        

        
    }
    
}
