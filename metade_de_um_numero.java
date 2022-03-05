import java.util.Scanner;

public class metade_de_um_numero {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
        
      System.out.println("Digite um número:");
      float numero = entrada.nextFloat();

      if (numero > 20){
        float metade = numero/2;  
        System.out.println(metade);
    
      }
        
      else{
        System.out.println("Número menor ou igual a 20, tente novamente.");

      }

        entrada.close();

    }
}
