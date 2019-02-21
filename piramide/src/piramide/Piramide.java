
package piramide;
import java.util.Scanner;

public class Piramide {

  
    public static void main(String[] args) {
        
        int lineas ; 
      
    Scanner input =new Scanner (System.in);
    
        System.out.println("De cuantas lineas quieres tu piramide? ");
        lineas=input.nextInt();
    //veces que se repite hasta lograr las lineas ingresadas
 
  if (lineas>=3){
   for(int cont=1;cont<=lineas;cont++){
     //imprecion de los asteriscos
          for(int aux=1;aux<=cont;aux++){
           
         System.out.print("*");
          }
          System.out.println("");
     
      
     
     System.out.println(""); 
  }    
   
  }else{System.out.println("escribe un valor igual o mayor a 3");}
  
    } 
}
