import java.util.Scanner;

public class numeros {
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int numero1 = entrada.nextInt();

        System.out.println("Digite o segundo numero");
        int numero2 = entrada.nextInt();

        if(numero1 == numero2){
            System.out.println("Os números são iguais!");
        }    
        else if(numero1 > numero2){
            System.out.println(numero1 - numero2);
        }
        else{
            System.out.println(numero1 - numero2);
        }
    
        entrada.close();
}

}


