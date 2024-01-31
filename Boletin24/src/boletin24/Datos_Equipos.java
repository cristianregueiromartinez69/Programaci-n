
package boletin24;

import java.util.Arrays;
import javax.swing.JOptionPane;


public class Datos_Equipos {
    
    
    public void valoresGoles(int array[][]) {

		for(int i=0;i<array.length;i++) {
			System.out.print(Equipo.nombres[i] + "  ");
			for(int j=0;j<array[i].length;j++) {

				array[i][j]=(int)(Math.random()*7)+1;
		        System.out.print(Jornadas.jornada[j] + ": " + array[i][j] + " ");

			}
			System.out.print("  Goles");
	          System.out.println();
		}


	}

	public void GolesDeLosEquipos(int array[][]) {

		int suma=0;
		System.out.println();
		System.out.println("Datos de los goles de los equipos:");
		System.out.println();

		for(int i=0;i<array.length;i++) {
			suma=0;
			System.out.print(Equipo.nombres[i] + ",  ");
			for(int j=0;j<array[i].length;j++) {

				suma+=array[i][j];

			}


			System.out.print("Numero de goles: " + suma);

			System.out.println();

		}



	}


	public void ListaEquiposMenosGoles(int array[][]) {
		System.out.println("Goles ordenados");
		System.out.println();
		int[] sumasFilas = calcularSumasFilas(array);
		 Arrays.sort(sumasFilas);
		 System.out.println("Sumas de los goles ordenados: " + Arrays.toString(sumasFilas));


	}

	 private static int[] calcularSumasFilas(int[][] array) {
	        int[] sumas = new int[array.length];

	        for (int i = 0; i < array.length; i++) {
	            sumas[i] = Arrays.stream(array[i]).sum();
	        }

	        return sumas;
	    }

	public void masGolesXJornada(int array[][]) {


        int numEquipos = Goles_Equipos.goles.length;
        int numJornadas = Goles_Equipos.goles[0].length;
        System.out.println();
      System.out.println("DATOS DE LOS EQUIPOS QUE MÁS GOLES MARCAN EN CADA JORNADA");
      System.out.println();
      String nombreequipo="";
        for (int jornada = 0; jornada < numJornadas; jornada++) {
            int maxGoles = Integer.MIN_VALUE;
            int equipoMaxGoles = 0;

            for (int equipo = 0; equipo < numEquipos; equipo++) {
                int golesEnJornada = Goles_Equipos.goles[equipo][jornada];

                if (golesEnJornada > maxGoles) {
                    maxGoles = golesEnJornada;
                     nombreequipo=Equipo.nombres[equipo];

                }
            }

            System.out.println("Jornada " + (jornada + 1) + ": Equipo " + nombreequipo + " con " + maxGoles + " goles");
        }


	}

	public void EquipoyJornadaconMasgoles(int array[][]) {


	     int numEquipos = Goles_Equipos.goles.length;
	        int numJornadas = Goles_Equipos.goles[0].length;
	        System.out.println();
	      System.out.println("QUE EQUIPO Y EN QUE JORNADA SE REGISTRAN MÁS GOLES");
	      System.out.println();
	      String nombreequipo="";
	        for (int jornada = 0; jornada < numJornadas; jornada++) {
	            int maxGoles = Integer.MIN_VALUE;
	            int equipoMaxGoles = 0;

	            for (int equipo = 0; equipo < numEquipos; equipo++) {
	                int golesEnJornada = Goles_Equipos.goles[equipo][jornada];

	                if (golesEnJornada > maxGoles) {
	                    maxGoles = golesEnJornada;
	                     nombreequipo=Equipo.nombres[equipo];

	                }
	            }

	            System.out.println("Jornada con mas goles " + (jornada + 1) + ": Equipo con mas goles: " + nombreequipo + ", con " + maxGoles + " goles");
	        }



	}

	public void ConsultasEquipos() {
		System.out.println();
		System.out.println("Consultas de equipos");
		System.out.println();
	String mensaje=JOptionPane.showInputDialog("¿Quieres realizar una consulta de algún equipo? "
			+ "\nresponde (si) si deseas hacerlo " + "\nresponde (no) si no deseas hacerlo");
	String afirmar="si";
	String negar="no";

	while(mensaje.equalsIgnoreCase(afirmar)) {

		int opcion_equipo=Integer.parseInt(JOptionPane.showInputDialog("Introduce el equipo del que quieres consultas: "
				+ "\nopcion 1 (teclea 1): Girona" + "\nopcion 2 (teclea 1): Real Madrid" + "\nopcion 3 (teclea 3): Atletico de Madrid"
				+ "\nopcion 4 (teclea 4): Barcelona" + "\nopcion 5 (teclea 5): Athelic de bilbao" + "\nopcion 6 (teclea 6): Real Sociedad"
				+ "\nopcion 7 (teclea 7): Betis" + "\nopcion 8 (teclea 8): Valencia" + "\nopcion 9 (teclea 9): Las Palmas"
				+ "\nopcion 10 (teclea 10): Getafe" + "\nopcion 11 (teclea 11): Alaves" + "\nopcion 12 (teclea 12): Osasuna"
				+ "\nopcion 13 (teclea 13): Rayo Vallecano" + "\nopcion 14 (teclea 14): Villareal" + "\nopcion 15 (teclea 15): Mallorca"
				+ "\nopcion 16 (teclea 16): Sevilla" + "\nopcion 17 (teclea 17): Celta de Vigo" + "\nopcion 18 (teclea 18): Cadiz"
				+ "\nopcion 19 (teclea 19): Granada" + "\nopcion 20 (teclea 20): Almeria"));

		while(opcion_equipo<1||opcion_equipo>20) {

			opcion_equipo=Integer.parseInt(JOptionPane.showInputDialog("Numero invalido, por favor, Introduce el equipo del que quieres consultas: "
					+ "\nopcion 1 (teclea 1): Girona" + "\nopcion 2 (teclea 1): Real Madrid" + "\nopcion 3 (teclea 3): Atletico de Madrid"
					+ "\nopcion 4 (teclea 4): Barcelona" + "\nopcion 5 (teclea 5): Athelic de bilbao" + "\nopcion 6 (teclea 6): Real Sociedad"
					+ "\nopcion 7 (teclea 7): Betis" + "\nopcion 8 (teclea 8): Valencia" + "\nopcion 9 (teclea 9): Las Palmas"
					+ "\nopcion 10 (teclea 10): Getafe" + "\nopcion 11 (teclea 11): Alaves" + "\nopcion 12 (teclea 12): Osasuna"
					+ "\nopcion 13 (teclea 13): Rayo Vallecano" + "\nopcion 14 (teclea 14): Villareal" + "\nopcion 15 (teclea 15): Mallorca"
					+ "\nopcion 16 (teclea 16): Sevilla" + "\nopcion 17 (teclea 17): Celta de Vigo" + "\nopcion 18 (teclea 18): Cadiz"
					+ "\nopcion 19 (teclea 19): Granada" + "\nopcion 20 (teclea 20): Almeria"));
		}

		int opcion_jornada=Integer.parseInt(JOptionPane.showInputDialog("Introduce la jornada que deseas ver: " +
		"\nopcion 1 (teclea 1) ver la jornada 1" + "\nopcion 2 (teclea 2) ver la jornada 2"  + "\nopcion 3 (teclea 3) ver la jornada 3"
		 + "\nopcion 4 (teclea 4) ver la jornada 4"  + "\nopcion 5 (teclea 5) ver la jornada 5"  + "\nopcion 6 (teclea 6) ver la jornada 6"
		 + "\nopcion 7 (teclea 7) ver la jornada 7"  + "\nopcion 8 (teclea 8) ver la jornada 8"  + "\nopcion 9 (teclea 9) ver la jornada 9"
		 + "\nopcion 10 (teclea 10) ver la jornada 10"  + "\nopcion 11 (teclea 11) ver la jornada 11"  + "\nopcion 12 (teclea 12) ver la jornada 12"
		 + "\nopcion 13 (teclea 13) ver la jornada 13"  + "\nopcion 14 (teclea 14) ver la jornada 14"  + "\nopcion 15 (teclea 15) ver la jornada 15"
		 + "\nopcion 16 (teclea 16) ver la jornada 16"  + "\nopcion 17 (teclea 17) ver la jornada 17"  + "\nopcion 18 (teclea 18) ver la jornada 18"
		 + "\nopcion 19 (teclea 19) ver la jornada 19"  + "\nopcion 20 (teclea 20) ver la jornada 20"  + "\nopcion 21 (teclea 21) ver la jornada 21"
		 + "\nopcion 22 (teclea 22) ver la jornada 22" + "\nopcion 23 (teclea 23) ver la jornada 23" + "\nopcion 24 (teclea 24) ver la jornada 24"
		 + "\nopcion 25 (teclea 25) ver la jornada 25" + "\nopcion 26 (teclea 26) ver la jornada 26" + "\nopcion 27 (teclea 27) ver la jornada 27"
		 + "\nopcion 28 (teclea 28) ver la jornada 28" + "\nopcion 29 (teclea 29) ver la jornada 29" + "\nopcion 30 (teclea 30) ver la jornada 30"
		 + "\nopcion 31 (teclea 31) ver la jornada 31" + "\nopcion 32 (teclea 32) ver la jornada 32" + "\nopcion 33 (teclea 33) ver la jornada 33"
		 + "\nopcion 34 (teclea 34) ver la jornada 34" + "\nopcion 35 (teclea 35) ver la jornada 35" + "\nopcion 36 (teclea 36) ver la jornada 36"
		 + "\nopcion 37 (teclea 37) ver la jornada 37" + "\nopcion 38 (teclea 38) ver la jornada 38"));

		while(opcion_jornada<1||opcion_jornada>38) {

			 opcion_jornada=Integer.parseInt(JOptionPane.showInputDialog("Numero incorrecto, por favor, Introduce la jornada que deseas ver: " +
					"\nopcion 1 (teclea 1) ver la jornada 1" + "\nopcion 2 (teclea 2) ver la jornada 2"  + "\nopcion 3 (teclea 3) ver la jornada 3"
					 + "\nopcion 4 (teclea 4) ver la jornada 4"  + "\nopcion 5 (teclea 5) ver la jornada 5"  + "\nopcion 6 (teclea 6) ver la jornada 6"
					 + "\nopcion 7 (teclea 7) ver la jornada 7"  + "\nopcion 8 (teclea 8) ver la jornada 8"  + "\nopcion 9 (teclea 9) ver la jornada 9"
					 + "\nopcion 10 (teclea 10) ver la jornada 10"  + "\nopcion 11 (teclea 11) ver la jornada 11"  + "\nopcion 12 (teclea 12) ver la jornada 12"
					 + "\nopcion 13 (teclea 13) ver la jornada 13"  + "\nopcion 14 (teclea 14) ver la jornada 14"  + "\nopcion 15 (teclea 15) ver la jornada 15"
					 + "\nopcion 16 (teclea 16) ver la jornada 16"  + "\nopcion 17 (teclea 17) ver la jornada 17"  + "\nopcion 18 (teclea 18) ver la jornada 18"
					 + "\nopcion 19 (teclea 19) ver la jornada 19"  + "\nopcion 20 (teclea 20) ver la jornada 20"  + "\nopcion 21 (teclea 21) ver la jornada 21"
					 + "\nopcion 22 (teclea 22) ver la jornada 22" + "\nopcion 23 (teclea 23) ver la jornada 23" + "\nopcion 24 (teclea 24) ver la jornada 24"
					 + "\nopcion 25 (teclea 25) ver la jornada 25" + "\nopcion 26 (teclea 26) ver la jornada 26" + "\nopcion 27 (teclea 27) ver la jornada 27"
					 + "\nopcion 28 (teclea 28) ver la jornada 28" + "\nopcion 29 (teclea 29) ver la jornada 29" + "\nopcion 30 (teclea 30) ver la jornada 30"
					 + "\nopcion 31 (teclea 31) ver la jornada 31" + "\nopcion 32 (teclea 32) ver la jornada 32" + "\nopcion 33 (teclea 33) ver la jornada 33"
					 + "\nopcion 34 (teclea 34) ver la jornada 34" + "\nopcion 35 (teclea 35) ver la jornada 35" + "\nopcion 36 (teclea 36) ver la jornada 36"
					 + "\nopcion 37 (teclea 37) ver la jornada 37" + "\nopcion 38 (teclea 38) ver la jornada 38"));


		}


	System.out.println("Equipo " + Equipo.nombres[opcion_equipo-1] + " Jornada: "
			+ Jornadas.jornada[opcion_jornada-1] + " goles: " + Goles_Equipos.goles[opcion_equipo-1][opcion_jornada-1]);

	mensaje=JOptionPane.showInputDialog("¿Quieres volver a realizar una consulta de algún equipo? "
			+ "\nresponde (si) si deseas volver a  hacerlo " + "\nresponde (no) si no deseas volver a  hacerlo");

	}







	}







    
}
