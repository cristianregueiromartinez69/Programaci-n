
package boletin22_4;
import javax.swing.*;
import java.util.*;
public class FuncionesDni {
    
    

	public void dameLetra(ArrayList<Letra>letra) {

		Nif carnet=new Nif();
		Letra l=new Letra();
		try {

			carnet.setNif(Integer.parseInt(JOptionPane.showInputDialog("Introduce el dni: ")));
			while(carnet.getNif()<=9999999||carnet.getNif()>100000000) {

				carnet.setNif(Integer.parseInt(JOptionPane.showInputDialog("dni incorrecto, por favor, Introduce el dni: ")));
			}

			int aux_resto=carnet.getNif()%23;
			System.out.println(aux_resto);
			l.setResto(aux_resto);
			letra.add(new Letra('A',3));
			letra.add(new Letra('B',11));
			letra.add(new Letra('C',20));
			letra.add(new Letra('D',9));
			letra.add(new Letra('E',22));
			letra.add(new Letra('F',7));
			letra.add(new Letra('G',4));
			letra.add(new Letra('H',18));
			letra.add(new Letra('J',13));
			letra.add(new Letra('K',21));
			letra.add(new Letra('L',19));
			letra.add(new Letra('M',5));
			letra.add(new Letra('N',12));
			letra.add(new Letra('P',8));
			letra.add(new Letra('Q',16));
			letra.add(new Letra('R',1));
			letra.add(new Letra('S',15));
			letra.add(new Letra('T',0));
			letra.add(new Letra('V',17));
			letra.add(new Letra('W',2));
			letra.add(new Letra('X',10));
			letra.add(new Letra('Y',6));
			letra.add(new Letra('Z',14));

		  for(int i=0;i<letra.size();) {

			  Letra miletra=letra.get(i);
			  if(miletra.getNum()==aux_resto) {

				  JOptionPane.showMessageDialog(null, "DNI: " + carnet.getNif() + miletra.getLetra());
				  i++;


			  }
			i++;



		   }










		}catch(RuntimeException e) {

			JOptionPane.showMessageDialog(null, "Vaya, parece que ha habido un error durante el proceso, volviendo a seleccion de NIF");
			FuncionesDni f=new FuncionesDni();
			f.dameLetra(Letra.dameletra);
		}







	}










    
    
}
