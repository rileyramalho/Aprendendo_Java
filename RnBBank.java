import java.util.Scanner;

public class RnBBank {
    public static void main(String[] args){

        
      Scanner impre = new Scanner(System.in);

        Conta primeiraConta = new Conta();

        System.out.print("Insira o valor minimo do deposito para a abertura da conta: R$");
        primeiraConta.saldo = impre.nextDouble();

        if(primeiraConta.saldo <= 100){
              
            System.out.println("Você precisa depositar um valor maior ou igual a R$100,00");
            System.out.print("\nInsira o valor minimo do deposito para a abertura da conta: R$ ");
            double validaDeposito = impre.nextDouble();

            if(validaDeposito >= 100)

            int i = 0;

            do{

               
            
            }while(i <= 100);
          
        }


        



         impre.close();
    }
}