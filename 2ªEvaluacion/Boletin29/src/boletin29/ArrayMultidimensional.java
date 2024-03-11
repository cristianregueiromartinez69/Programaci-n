package boletin29;

public class ArrayMultidimensional {

	int goles[][] = new int[5][5];

	public void darValor() {

		for (int i = 0; i < goles.length; i++) {
			for (int j = 0; j < goles[i].length; j++) {
				goles[i][j] = (int) (Math.random() * 100) + 1;
				System.out.print(goles[i][j] + " ");
			}
			System.out.println();
		}

	}

	public int dameMáximo() {

		int maximo = 0;
		int filas = 0;
		int columnas = 0;
		int posicionfila = 0;
		int posicioncolumna = 0;
		for (int i = 0; i < goles.length; i++) {
			columnas = 0;
			for (int j = 0; j < goles[i].length; j++) {
				if (goles[i][j] > maximo) {

					maximo = goles[i][j];
					posicionfila = filas;
					posicioncolumna = columnas;
				}
				columnas++;
			}
			filas++;
		}
		System.out.println("La posicion del numero maximo del array es de, " + "Fila: " + posicionfila + " Columna: "
				+ posicioncolumna);
		return maximo;
	}


}
