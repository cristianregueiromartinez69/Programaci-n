
package boletin8_2;
import java.util.Scanner;

public class Superficie {
    
 private float lado,base,altura,radio;
	private int op;

	public Superficie() {

	}

	public void dameOp(int o) {

		op=o;
	}


	public void dimeAreacuadrado() {
		op=1;
		System.out.println("Introduce el lado: ");
		Scanner sc=new Scanner(System.in);
		lado=sc.nextFloat();
		float areacu=lado*lado;
		System.out.println("El area del cuadrado es: " + areacu);


	}

	public void dimeAreaTriangulo() {

		op=2;
		System.out.println("Introduce la base: ");
		Scanner sc=new Scanner(System.in);
		base=sc.nextFloat();
		System.out.println("Introduce la altura: ");
		altura=sc.nextFloat();
		float areat=base*altura/2;
		System.out.println("El area del Triangulo es: " + areat);

	}

	public void dimeAreacirculo() {

		op=3;
		System.out.println("Introduce el radio: ");
		Scanner sc=new Scanner(System.in);
		radio=sc.nextFloat();
		float areaci=(float)Math.PI*radio*radio;
		System.out.println("El area del circulo es: " +  areaci);




	}


	public void seleecionaArea() {

		Superficie su=new Superficie();

		switch(op) {

		case 1: su.dimeAreacuadrado();
		break;
		case 2: su.dimeAreaTriangulo();
		break;
		case 3: su.dimeAreacirculo();
		break;

		default: System.out.println(" Opción incorrecta");



	}
















	}

    
    
    
    
    
}
