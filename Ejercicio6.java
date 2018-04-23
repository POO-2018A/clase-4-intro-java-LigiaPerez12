package ejercicio6;

/**
 * 
 * @author Ligia
 */
public class Ejercicio6 {

   
    public static void main(String[] args) {
      boolean estaNevando = false;
      boolean estaLloviendo = true;
      double temperatura = 60.0;
      if(!estaNevando || estaLloviendo || temperatura <= 10.0){
          System.out.println("Nos quedamos en casa");
      }else{
          System.out.println("Vamos afuera");
      }
    }
    
}
