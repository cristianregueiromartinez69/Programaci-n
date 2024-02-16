
package boletin5;
import java.util.Scanner;

public class Boletin5 {

   
    public static void main(String[] args) {
        
       Scanner scan=new Scanner(System.in);
       Consumo consumo1=new Consumo();
       consumo1.setLitros(50f);
       consumo1.setPGas(1.57f);
        System.out.println("Introduce os datos: ");
        System.out.println("kilometros percorridos: ");
        float km=scan.nextFloat();
        System.out.println("litros consumidos: ");
        float litros=scan.nextFloat();
        System.out.println("velocidade media: ");
        float vMed=scan.nextFloat();
        System.out.println("precio da gasolina: ");
        float pGas=scan.nextFloat();
       Consumo consumo2=new Consumo(km,litros,vMed,pGas);
       consumo2.consumoMedio();
        System.out.println("introduce otro consumo: ");
        litros=scan.nextFloat();
        consumo2.setLitros(litros);
        System.out.println("La velocidad media de este objeto es: "+consumo2.getVMed()+" km/h");
    }
    }
    

