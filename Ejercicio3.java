package ejercicio3;
import java.util.Scanner;
/**
 * 
 * @author Ligia
 */
public class Ejercicio3 {

   
    public static void main(String[] args) {
       Scanner scan = new Scanner (System.in);
       System.out.println("Por favor ingrese su edad: ");
       int edad = scan.nextInt();
       if (edad>=17){
          System.out.println("Es mayor de edad."); 
       }else{
           System.out.println("Es menor de edad.");
       }
    }
    
}
