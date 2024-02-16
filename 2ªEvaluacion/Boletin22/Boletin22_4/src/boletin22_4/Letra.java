
package boletin22_4;

import java.util.*;


public class Letra {
    
    private char letra;
	private int num;

	static ArrayList<Letra>dameletra=new ArrayList<>();

	public Letra() {



	}



	public Letra(char letra, int num) {
		super();
		this.letra = letra;
		this.num = num;
	}



	public char getLetra() {
		return letra;
	}

	public void setLetra(char letra) {
		this.letra = letra;
	}

	public int getNum() {
		return num;
	}

	public void setResto(int num) {
		this.num = num;
	}

	public static ArrayList<Letra> getDameletra() {
		return dameletra;
	}

	public static void setDameletra(ArrayList<Letra> dameletra) {
		Letra.dameletra = dameletra;
	}

	@Override
	public String toString() {
		return "Letra: " + letra + "\nnumero: " + num;
	}















    
    
    
    
}
