import java.util.Scanner;

public class calculadora {
    public static void main(String[] args){
    
      Scanner entrada = new Scanner(System.in);

      System.out.println("Digite um número para que o seu calcúlo seja realizado: ");
      float num1 = entrada.nextFloat();
      System.out.println("Digite outro número para que o seu calcúlo seja realizado: ");
      float num2 = entrada.nextFloat();

      char operador;
      System.out.println("Digite um operador matemático para que o seu calcúlo seja realizado: ");
      operador = entrada.next().charAt(0);

      switch (operador) {
          case '+':
              System.out.println(num1 + num2);

              break;
          case '-':
              System.out.println(num1 - num2);

              break;
          case '*':
              System.out.println(num1 * num2);
              
              break;
          case '/':
              System.out.println(num1 / num2);
              
              break;        
          default:
              System.out.println("Operador matemático inválido.");

              break;
      }

        entrada.close();

    }
}
