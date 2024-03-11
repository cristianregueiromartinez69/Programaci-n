
package boletin28;

import array.*;

import generico.*;
import java.util.*;
import abstracta.*;
import javax.swing.*;
import interfaz.*;
public class Boletin28 {

    
    public static void main(String[] args) {
      
        System.out.println();
		System.out.println("EJERCICIO 1");
		System.out.println();
		Menu menu = new Menu();
		menu.MenuOpciones();// ejercicio de las colecciones

		/**
		 * ejercicio de los genericos
		 */
		System.out.println();
		System.out.println("EJERCICIO 2");
		System.out.println();
		Caja<Integer> misedades = new Caja<>();
		ArrayList<Integer> damedades = new ArrayList<>();
		ArrayList<String> damenombres = new ArrayList<>();
		ArrayList<Empleado> damebecarios = new ArrayList<>();

		misedades.agregar(3);
		damedades.add(misedades.obtener());
		misedades.agregar(10);
		damedades.add(misedades.obtener());
		misedades.agregar(20);
		damedades.add(misedades.obtener());
		misedades.agregar(30);
		damedades.add(misedades.obtener());
		misedades.agregar(50);
		damedades.add(misedades.obtener());
		misedades.agregar(12);
		damedades.add(misedades.obtener());

		for (int e : damedades) {
			System.out.println(e);
		}

		Caja<String> misnombres = new Caja<>();
		misnombres.agregar("Paco");
		damenombres.add(misnombres.obtener());
		misnombres.agregar("Lucius");
		damenombres.add(misnombres.obtener());
		misnombres.agregar("Angel");
		damenombres.add(misnombres.obtener());
		misnombres.agregar("Jenny");
		damenombres.add(misnombres.obtener());
		misnombres.agregar("Alejandro");
		damenombres.add(misnombres.obtener());
		misnombres.agregar("Dimitri");
		damenombres.add(misnombres.obtener());

		for (String e : damenombres) {
			System.out.println(e);
		}

		Caja<Empleado> misempleados = new Caja<>();
		misempleados.agregar(new Empleado("Javier", "Comercio", 3000));
		damebecarios.add(misempleados.obtener());
		misempleados.agregar(new Empleado("Rodolfo", "Moda", 1234));
		damebecarios.add(misempleados.obtener());
		misempleados.agregar(new Empleado("Veronica", "Porno", 6000));
		damebecarios.add(misempleados.obtener());
		misempleados.agregar(new Empleado("Angel", "Boxeo", 2500));
		damebecarios.add(misempleados.obtener());
		misempleados.agregar(new Empleado("Johnny sims", "Enfermeria", 4000));
		damebecarios.add(misempleados.obtener());
		misempleados.agregar(new Empleado("Messi", "Deportes", 20000));
		damebecarios.add(misempleados.obtener());
		for (Empleado e : damebecarios) {
			System.out.println(e);
		}

		/**
		 * ejercicio clase abstracta
		 */
		System.out.println();
		System.out.println("EJERCICIO 3");
		System.out.println();
		FiguraGeométrica micirculo = new Circulo(3);
		System.out.println("El area del circulo es de: " + micirculo.calcularArea());
		FiguraGeométrica mirectangulo = new Rectangulo(10, 4);
		System.out.println("El area del rectangulo es de: " + mirectangulo.calcularArea());

		/**
		 * Ejercicio Interfaz
		 */
		System.out.println();
		System.out.println("EJERCICIO 4");
		System.out.println();
		Guitarra miguitarra = new Guitarra();
		miguitarra.tocar();
		Piano mipiano = new Piano();
		mipiano.tocar();

		/**
		 * Integración final de los ejercicios de repaso
		 */System.out.println();
			System.out.println("AMPLIACION EJERCICIO 1");
			System.out.println();
          Menu2 menu2 = new Menu2();
          menu2.MenuOpciones2();  //interfaz en la clase GestorDeEmpleados

          /**
           * Caja para almacenar FigurasGeometricas
           */System.out.println();
			System.out.println("AMPLIACION EJERCICIO 2");
			System.out.println();
          Caja <FiguraGeométrica> misfiguras = new Caja <>();
           misfiguras.agregar(mirectangulo);
           System.out.println("Este es mi rectangulo: " + misfiguras.obtener());
          misfiguras.agregar(micirculo);
          System.out.println("Este es mi círculo: " + misfiguras.obtener());

          /**
           * Añadiendo metodo tocando instrumento
           */System.out.println();
			System.out.println("AMPLIACION EJERCICIO 3 y 4");
			System.out.println();
          Menu2 menu3 = new Menu2();
  		menu3.MenuOpciones2(); //metodo tocar en los empleados
    }
    
}
