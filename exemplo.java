import java.util.Scanner;

public class exemplo {
 
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = entrada.nextInt();

        if(idade >= 18){
            System.out.println("maior de idade");
        }
        else{
            System.out.println("menor de idade");
        }

        entrada.close();
        
    }
}
