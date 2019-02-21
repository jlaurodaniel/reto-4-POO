
package boletos;
import java.util.Scanner;

public class Boletos {

       public static void main(String[] args) {
             String answer,aux;
        Scanner input=new Scanner(System.in);
        System.out.println("bienvenido al parque de diversiones La Feria ");
        System.out.println("");
        System.out.println("Ninos pagan 70 pesos y su clave para boleto es (n)");
        System.out.println("adultos pagan 100 pesos y su clave para boleto es (a)");
        System.out.println("Adultos mayores con inapan  pagan 50 pesos y su clave para boleto es (1)");
        System.out.println("adultos mayores pagan como niño y su clave para boleto es (b)");
        System.out.println("");
        
    
        
do{
    System.out.println("escriba la clave de su boleto");
        answer = input.nextLine();
        switch(answer){
     
            case "n":
                System.out.println("ha comprado un boleto de niño y se han agregado 70 pesos a su carro de compras");
                System.out.println("desea adquirir otro boleto(si o no) ");
        aux= input.nextLine();
        break;
            case "a":
                System.out.println("ha comprado un boleto de adulto y se han agregado 100 pesos a su carro de compras");
                System.out.println("desea adquirir otro boleto(si o no) ");
        aux= input.nextLine();
        break;
            case "i":
                System.out.println("ha comprado un boleto de adulto mayor con tarjeta inapan y se han agregado 50 pesos a su carro de compras");
                System.out.println("desea adquirir otro boleto(si o no) ");
        aux= input.nextLine();
        break;
            case "b":
                System.out.println("ha comprado un boleto de adulto mayor y se han agregado 70 pesos a su carro de compras");
                System.out.println("desea adquirir otro boleto(si o no) ");
        aux= input.nextLine();
        break;
            default:System.out.println("ingrese un valor correcto");
                aux="si";
        } 
} 
while(aux="si") ;
    }
    
}
