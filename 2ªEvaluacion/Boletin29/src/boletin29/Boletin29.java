
package boletin29;


public class Boletin29 {

   
    public static void main(String[] args) {
       
  
		System.out.println("EJERCICIO 1");
		System.out.println();
		ArrayMultidimensional miarray = new ArrayMultidimensional();
		miarray.darValor();
		System.out.println("El numero máximo del array es de: " + miarray.dameMáximo());
		System.out.println();
		System.out.println("EJERCICIO 2");
		System.out.println();
		Genericos<String> Nombres = new Genericos<>();
		Nombres.setValor("Adrian");
		System.out.println(Nombres.getValor());
		Nombres.setValor("Jorge");
		System.out.println(Nombres.getValor());
		Nombres.setValor("Javier");
		System.out.println(Nombres.getValor());
		Genericos<Float> sueldos = new Genericos<>();
		sueldos.setValor(2500f);
		System.out.println(sueldos.getValor() + "€");
		sueldos.setValor(1340f);
		System.out.println(sueldos.getValor() + "€");
		sueldos.setValor(30000f);
		System.out.println(sueldos.getValor() + "€");
		System.out.println();
		System.out.println("EJERCICIO 3");
		System.out.println();
		System.out.println("EJERCICIO CON LA CLASE ABSTRACTA");
		System.out.println();
		Figura micirculo = new Circulo();
		micirculo.dibujar();
		Figura micuadrado = new Cuadrado();
		micuadrado.dibujar();
		System.out.println();
		System.out.println("EJERCICIO CON LA INTERFAZ");
		System.out.println();
		Coche micoche = new Coche();
		micoche.arrancar();
		micoche.detener();
		micoche.arrancar();
		Motocicleta mimoto = new Motocicleta();
		mimoto.arrancar();
		mimoto.detener();
		mimoto.acelerar();
		System.out.println();
		System.out.println("EJERCICIO 4");
		System.out.println();
		Excepciones division = new Excepciones();
		System.out.println(division.tratarExcepcion());
		System.out.println();
		System.out.println("EJERCICIO 5");
		System.out.println();
		SerializarEmpleado ser = new SerializarEmpleado();
		ser.GuardarEmpleado();
		ser.cargarEmpleado();
		System.out.println();
		System.out.println("EJERCICIO 6");
		System.out.println();
		Coleccion micoleccion = new Coleccion();
		micoleccion.añadeValorArrayString();
		micoleccion.añadeValoryEliminaValorEdades();
        
    }
    
}
