import java.util.Scanner;

public class repeticao {
 
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número maximo: ");
        int num = entrada.nextInt();

        int cont;

        cont = 0;

        while (cont <= num){

            System.out.println(cont);
            cont++;
        }
    
    entrada.close();


    }


    
}
