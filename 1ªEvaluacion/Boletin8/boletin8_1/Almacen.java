
package boletin8_1;
import java.util.Scanner;

public class Almacen {
 
 private int venta_anual;
 private String produto;
 
 public Almacen(){
     
 }
    
  
 public void dimeTipo(){
     System.out.println("Introduce el número de ventas anuales: ");
     Scanner sc=new Scanner(System.in);
     venta_anual=sc.nextInt();
     
      if(venta_anual<=100){
          produto="Lápiz";
          System.out.println("El artículo " + produto + " es de bajo consumo");
      }
     
      else{
          if(venta_anual>100&venta_anual<=500){
              produto="Libreta";
              System.out.println("El artículo " + produto + " es de consumo medio");
          }
          else{
              if(venta_anual>500&venta_anual<=1000){
                  produto="tabaco";
                  System.out.println("El artículo " + produto + " es de alto consumo");
              }
              else{
                  if(venta_anual>1000){
                      produto="Alcohol";
                      System.out.println("El artículo " + produto + " es de primera necesidad");
                  }
              }
          }
      }
     
     
     
     
     
     
     
     
     
     
     
     
 }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
