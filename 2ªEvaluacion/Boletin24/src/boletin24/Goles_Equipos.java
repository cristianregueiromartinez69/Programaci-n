
package boletin24;
import java.util.*;

public class Goles_Equipos {
    

  private String equipo;
	private int suma;
	static int goles[][]=new int[20][38];
	public static ArrayList <Goles_Equipos>golazo=new ArrayList<>();

	public Goles_Equipos() {



	}



	public Goles_Equipos(String equipo, int suma) {

		this.equipo=equipo;
		this.suma=suma;

	}



	public static int[][] getGoles() {
		return goles;
	}



	public static void setGoles(int[][] goles) {
		Goles_Equipos.goles = goles;
	}



	public String getEquipo() {
		return equipo;
	}



	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}



	public int getSuma() {
		return suma;
	}



	public void setSuma(int suma) {
		this.suma = suma;
	}



	@Override
	public String toString() {
		return "Equipo: " + equipo + ", goles: " + suma;
	}






















    
    
}
