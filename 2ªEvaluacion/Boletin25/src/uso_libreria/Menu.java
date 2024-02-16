
package uso_libreria;
import javax.swing.*;

public class Menu {
    
  //clase menu con el metodo para seleccionar las distintas acciones que queremos hacer con nuestra libreria
	//para salir del programa solo tenemos que seleccionar la ultima opcion

	  public void menudeopciones(){

	        Libreria li=new Libreria();
	        JOptionPane.showMessageDialog(null, "Bienvenido/a a la biblioteca");
	        int opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce las opciones que deseas hacer en la biblioteca: " +
	                "\nopcion 1(teclea 1) añadir un libro" + "\nopcion 2 (teclea 2) borrar un libro" + "\nopcion 3(teclea 3) consultar datos de los libros" +
	                "\nopcion 4(teclea 4) modificar unidades de los libros" + "\nopcion 5(teclea 5) realizar consultas de los libros" +
	                "\nopcion6 (teclea6) salir de la biblioteca"));

	        while(opcion<1||opcion>6){

	             opcion=Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto, por favor, Introduce las opciones que deseas hacer en la biblioteca: " +
	                "\nopcion 1(teclea 1) añadir un libro" + "\nopcion 2 (teclea 2) borrar un libro" + "\nopcion 3(teclea 3) consultar datos de los libros" +
	                "\nopcion 4(teclea 4) modificar unidades de los libros" + "\nopcion 5(teclea 5) realizar consultas de los libros" +
	                "\nopcion 6 (teclea6) salir de la biblioteca"));

	        }

	        switch(opcion){

	            case 1: li.añadirLibro(Libreria.libro);
	            break;
	            case 2: li.borrarLibros(Libreria.libro);
	            break;
	            case 3: li.datosLibros(Libreria.libro);
	            break;
	            case 4: li.dardebajalibroXunidad(Libreria.libro);
	            break;
	            case 5: li.consultasLibros(Libreria.libro);
	            break;
	            case 6:
	            	System.exit(0);
	            break;


	        }




	    }






    
    
}
