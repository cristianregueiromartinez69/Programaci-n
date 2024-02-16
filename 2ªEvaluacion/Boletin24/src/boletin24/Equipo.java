
package boletin24;
import java.util.Arrays;
import java.util.Scanner;

public class Equipo {
    
static String nombres[]= {"Girona","Real Madrid","Atletico de Madrid","Barcelona","Athletic de Bilbao",
			"Real sociedad","Betis","Valencia","Las Palmas","Getafe","Alaves","Osasuna","Rayo Vallecano",
			"Villarreal","Mallorca","Sevilla","Celta de Vigo","Cadiz","Granada","Almeria"};




	public Equipo() {


	}


	public static String[] getNombres() {
		return nombres;
	}


	public static void setNombres(String[] nombres) {
		Equipo.nombres = nombres;
	}


    
    
    
}
