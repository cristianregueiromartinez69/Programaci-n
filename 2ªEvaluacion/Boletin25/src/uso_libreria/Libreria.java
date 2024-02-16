
package uso_libreria;
import java.util.*;
import javax.swing.*;

public class Libreria {
    
     //arraylist de objetos de la clase libro
	 static ArrayList<Libros>libro=new ArrayList<>();

      //metodo que recibe el arraylist de libros por parametro y añade libros
	    public void añadirLibro(ArrayList<Libros> añadelibro){
        try {

	        JOptionPane.showMessageDialog(null, "Introduce los datos del libro que deseas añadir");


	        añadelibro.add(new Libros(JOptionPane.showInputDialog("Escribe el título: "), JOptionPane.showInputDialog("Escribe el autor: "),
	                JOptionPane.showInputDialog("Escribe el ISBM del libro: "), Float.parseFloat(JOptionPane.showInputDialog("Escribe el precio del libro: ")),
	                Integer.parseInt(JOptionPane.showInputDialog("Introduce el número de unidades del libro: "))));

	               Menu m=new Menu();
	        m.menudeopciones();
        }catch(RuntimeException e) {
        	JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
    		Menu m=new Menu();
	        m.menudeopciones();

        }
	    }

	    //metodo que recibe el arraylist de libros por parametro y borra libros
	    //si no hay libros, hay un try catch que captura la excepcion y nos manda al menu de nuevo
	    public void borrarLibros(ArrayList<Libros> borralibro){
	    	try {
	         int i=0;
	        JOptionPane.showMessageDialog(null, "Procedemos a borrar libros");
	        System.out.println();
	         System.out.println("DATOS DE LOS LIBROS");
	        for(i=0;i<borralibro.size();i++){

	            System.out.println("Indice del libro: " + (i) + " datos del libro: " + borralibro.get(i));

	        }

	        System.out.println();
	        int indice=Integer.parseInt(JOptionPane.showInputDialog("Introduce el indice del libro que quieres borrar " +
	                "\n¡TEN EN CUENTA QUE BORARÁS TODA LA INFORMACIÓN Y LAS UNIDADES DE LOS LIBROS!"));



	        	borralibro.remove(indice);
	        	Menu m=new Menu();
		        m.menudeopciones();





	    	}catch(IndexOutOfBoundsException e) {
	    		JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
	    		Menu m=new Menu();
		        m.menudeopciones();

	    	}catch(RuntimeException e) {
	        	JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
	    		Menu m=new Menu();
		        m.menudeopciones();

	        }
	    }

       //metodo que visualiza los datos de los libros
	    public void datosLibros(ArrayList<Libros> datoslibros){
	    	try {
	        System.out.println();
	        JOptionPane.showMessageDialog(null, "DATOS DE LOS LIBROS");
	        System.out.println();


	        Collections.sort(datoslibros, Comparator.comparing(Libros::getTitulo));
	        System.out.println();
	        System.out.println("LOS LIBROS ESTÁN ORDENADOS ALFABETICAMENTE");
	        System.out.println();
	        for(Libros libro: libro){

	            System.out.println(libro);

	        }



	               Menu m=new Menu();
	        m.menudeopciones();
	    	}catch(IndexOutOfBoundsException e) {
	    		JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
	    		Menu m=new Menu();
		        m.menudeopciones();

	    	}catch(RuntimeException e) {
	        	JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
	    		Menu m=new Menu();
		        m.menudeopciones();

	        }
	    }

       //metodo para modificar las unidades de un libro
	    //si no hay libros, el try catch captura la excepcion y nos manda al menu
	    public void dardebajalibroXunidad(ArrayList<Libros> borrarunidadeslibro){
              try {
	        System.out.println();
	        JOptionPane.showMessageDialog(null, "VAMOS A BORRAR UNIDADES DE UN LIBRO");
	        System.out.println();
	           System.out.println("DATOS DE LOS LIBROS");
	        for(int i=0;i<borrarunidadeslibro.size();i++){

	            System.out.println("Indice del libro: " + (i) + " datos del libro: " + borrarunidadeslibro.get(i));

	        }

	        System.out.println();
	        int indice=Integer.parseInt(JOptionPane.showInputDialog("Introduce el indice del libro del que deseas borrar unidades" +
	                "\n¡TEN EN CUENTA QUE MODIFICARAS LAS UNIDADES DE LOS LIBROS!"));

	        Libros modificacionunidad=borrarunidadeslibro.get(indice);
	        modificacionunidad.setNumero_unidades(Integer.parseInt(JOptionPane.showInputDialog("Introduce el nuevo numero de unidades del libro")));

	        if(modificacionunidad.getNumero_unidades()<=0){


	            borrarunidadeslibro.remove(indice);

	        }



	               Menu m=new Menu();
	        m.menudeopciones();
              }catch(IndexOutOfBoundsException e) {
  	    		JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
  	    		Menu m=new Menu();
  		        m.menudeopciones();

  	    	}catch(RuntimeException e) {
  	        	JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
  	    		Menu m=new Menu();
  		        m.menudeopciones();

  	        }

	    }

	   //metodo para realizar consultas sobre libros
	    //si no hay libros, el try catch captura la excepcion y nos manda al menu
	    public void consultasLibros(ArrayList<Libros> consultaslibros){
           try {
	        System.out.println();
	        JOptionPane.showMessageDialog(null, "VAMOS CON LAS CONSULTAS DE LOS LIBROS");
	        String pregunta=JOptionPane.showInputDialog("¿Quieres consultar la información de algún libro?" +
	                "\nresponde (si) si deseas hacerlo " + "\nresponde otra cosa si no deseas hacerlo");
	        String afirmar="si";


	        while(pregunta.equalsIgnoreCase(afirmar)){




	        for(int i=0;i<consultaslibros.size();i++){

	            System.out.println("Indice del libro: " + (i) + " datos del libro: " + consultaslibros.get(i));

	        }

	        int indice=Integer.parseInt(JOptionPane.showInputDialog("Introduce el indice del libro del que deseas realizar consultas"));

	         int opcion=Integer.parseInt(JOptionPane.showInputDialog("Introduce que quieres consultar de los libros: " +
	                 "\nopcion 1 (teclea 1) el titulo del libro " + "\nopcion 2(teclea 2) el autor del libro " + "\nopcion 3(teclea 3) el ISBM del libro " +
	                 "\nopcion 4(teclea 4) el precio del libro " + "\nopcion 5 (teclea 5) el numero de unidades del libro"));

	         while(opcion<1||opcion>5){

	                   opcion=Integer.parseInt(JOptionPane.showInputDialog("Numero invalido, por favor, Introduce que quieres consultar de los libros: " +
	                 "\nopcion 1 (teclea 1) el titulo del libro " + "\nopcion 2(teclea 2) el autor del libro " + "\nopcion 3(teclea 3) el ISBM del libro " +
	                 "\nopcion 4(teclea 4) el precio del libro " + "\nopcion 5 (teclea 5) el numero de unidades del libro"));
	         }
	           Libros consultasdelibros=consultaslibros.get(indice);

	            switch(opcion){

	                case 1:

	                     JOptionPane.showMessageDialog(null, consultasdelibros.getTitulo());
	                break;
	                case 2:
	                	JOptionPane.showMessageDialog(null, consultasdelibros.getAutor());
	                break;
	                case 3:
	                	JOptionPane.showMessageDialog(null, consultasdelibros.getISBN());
	                break;
	                case 4:
	                	JOptionPane.showMessageDialog(null, consultasdelibros.getPrezo());
	                break;
	                case 5:
	                	JOptionPane.showMessageDialog(null, consultasdelibros.getNumero_unidades());
	                break;


	            }
	            pregunta=JOptionPane.showInputDialog("¿Quieres volver aconsultar la información de algún libro?" +
		                "\nresponde (si) si deseas hacerlo " + "\nresponde otra cosa si no deseas hacerlo");

	        }


	               Menu m=new Menu();
	        m.menudeopciones();
           }catch(IndexOutOfBoundsException e) {
	    		JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
	    		Menu m=new Menu();
		        m.menudeopciones();

	    	}catch(RuntimeException e) {
	        	JOptionPane.showMessageDialog(null, "Vaya, algo ha salido mal, volviendo al menu");
	    		Menu m=new Menu();
		        m.menudeopciones();

	        }

	    }














    
    
}
