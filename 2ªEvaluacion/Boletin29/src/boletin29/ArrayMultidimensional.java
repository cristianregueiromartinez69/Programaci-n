package boletin29;

public class ArrayMultidimensional {

    int goles[][] = new int[4][4];

    public void añadiendoValores() {

        for (int i = 0; i < goles.length; i++) {
            for (int j = 0; j < goles[i].length; j++) {

                goles[i][j] = (int) (Math.random() * 100) + 1;
                System.out.print(goles[i][j] + " ");
            }
            System.out.println();
        }

    }

    public int encuentraMáximo() {

        int maximo = 0;
        int fila = 0;
        int columna = 0;
        int posicionFila = 0;
          int posicionColumna = 0;
        for (int i = 0; i < goles.length; i++) {
            
            for (int j = 0; j < goles[i].length; j++) {
                  
                if (goles[i][j] > maximo) {
                    maximo = goles[i][j];
                    posicionFila=fila;
                    posicionColumna=columna;
                }
                columna++;
                
            }
           fila++;
           columna=0;
        }
         System.out.println("Posicion del numero máximo: " + "Fila " + fila + " Columna " + columna);
        return maximo;
    }

}
