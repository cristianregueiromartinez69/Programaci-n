
package boletin12_coche;


public class Coche {
    
    private int matricula;
    private String marca;

    public Coche() {
    }

    public Coche(int matricula, String marca) {
        this.matricula = matricula;
        this.marca = marca;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Coche :" + " matricula: " + matricula + ", marca: " + marca;
    }
   
    
}
