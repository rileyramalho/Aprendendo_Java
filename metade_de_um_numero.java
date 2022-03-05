import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    Scanner entrada = new Scanner(System.in);
        
      System.out.println("Digite um número:");
      int numero = entrada.nextInt();

      if (numero > 20){
        float metade = numero/2;  
        System.out.println(metade);
    
      }

        entrada.close();

    }
}
