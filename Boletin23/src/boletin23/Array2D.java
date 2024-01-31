
package boletin23;

import javax.swing.JOptionPane;


public class Array2D {
    
   
    public Array2D(){
        
        
    }
    
    
    public void Ejercicio1(){
        
       String texto="Esto es Java";
       
       int tamaño=texto.length();
       
        System.out.println("El tamaño del texto es de: " + tamaño);
        
        
    }
    
    public void Ejercicio2(){
        
      String texto="java";
     
      for(int i=0;i<texto.length();i++){
          
          char letra=texto.charAt(i);
          System.out.println("Letra: " + (i+1) + ": " + letra);
          
      }
        
        
    }
    
    public void Ejercicio3(){
        
        String texto="Java desde 0";
        
        StringBuilder textoalreves=new StringBuilder();
        
        for(int i=texto.length()-1;i>=0;i--){
            
          textoalreves.append(texto.charAt(i));
            
            
            
        }
          
        System.out.println(textoalreves.toString());
        
        
    }
    
    public void Ejercicio4(){
        
        String textoEspacio="James Gosling Created Java";
        
        String fueraespacios=textoEspacio.replaceAll("\\s", "");
        
        System.out.println("Texto original: " + textoEspacio);
        System.out.println("Texto sin espacios: " + fueraespacios);
        
    }
    
    public void Ejercicio5(){
        
      
       
        String texto = "java java java";


        texto = texto.toLowerCase();


        int contadorVocales = 0;
        int contadorConsonantes = 0;


        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

      
            if (esVocal(caracter)) {
                contadorVocales++;
            } else if (Character.isLetter(caracter)) {
                contadorConsonantes++;
            }
        }

      
        System.out.println("Texto: " + texto);
        System.out.println("Número de vocales: " + contadorVocales);
        System.out.println("Número de consonantes: " + contadorConsonantes);
    }

   
    private static boolean esVocal(char c) {
        return "aeiou".indexOf(c) != -1;
    }
    
    
    public void ejercicio6(){
        
      String web="www. javadesde0. com";  
        
        int longitud=web.length()/2;
        String parte1=web.substring(0, longitud);
        String parte2=web.substring(longitud);
        String textounido=parte1+parte2;
        
        System.out.println("Texto original: " + web);
        System.out.println("Primera parte del texto: " + parte1);
        System.out.println("Segunda parte del texto: " + parte2);
        System.out.println("Texto concatenado: " + textounido);
        
        
        
        
    }
    
    public void ejercicio7(){
       
        String texto="javeros";
        String mayuscula=texto.toUpperCase();
        System.out.println("Texto original: " + texto);
        System.out.println("Texto en mayusculas: " + mayuscula);
        String minuscula=mayuscula.toLowerCase();
        System.out.println("Texto en minuscula convertido: " + minuscula);
        
        
    }
    
    public void ejercicio8(){
        
       String texto1="java";
       String texto2="JavaScript";
       
       if(texto1.equalsIgnoreCase(texto2)){
           
           System.out.println("El texto es igual");
       }
        
       else{
           System.out.println("El texto es diferente");
       } 
        
    }
    
public void ejercicio9() {



		String texto="jeve jeve jeve";

		String remplazo=texto.replace('e', 'a');
		System.out.println("Texto original: " + texto);
		System.out.println("Nuevo texto: " + remplazo);

	}


	public void ejercicio10() {

		String texto="ABCD";
		int valorasci=0;
		for(int i=0;i<texto.length();i++) {

			char letra=texto.charAt(i);
			valorasci=(int)letra;
			System.out.println("Letra: " + letra + " valor ASCII: " + valorasci);

		}



	}
        
        
        	public void ejercicio11() {

		String texto="Hola, son alumno de DAM1, e son programador dende o 2021";
		int contadorletras=0;
		int contadornumeros=0;
		int contadorespacios=0;
		for(int i=0;i<texto.length();i++) {

			char busqueda=texto.charAt(i);

			if(Character.isLetter(busqueda)) {


				contadorletras++;
			}
			else if(Character.isDigit(busqueda)) {

				contadornumeros++;
			}
			else if(Character.isWhitespace(busqueda)) {


				contadorespacios++;
			}

		}

		JOptionPane.showMessageDialog(null, "Texto original: " + texto
				+ "\ndatos del texto:" + "\nNumero de letras: " + contadorletras
				 + "\nNumero de digitos: " + contadornumeros + "\nNumero de espacios en blanco: " + contadorespacios);

	}


    
}

     
    
    
    

