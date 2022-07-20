import java.util.Scanner;

public class Entre50e100 {
    
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número");
        int numero = entrada.nextInt();

        if(numero >= 50 && numero <= 100 ){
            System.out.println("O número escolhido está dentro do intervalo");
        }    
        else if(numero <= 50 && numero >= 100 ){

            System.out.println("O número escolhido está fora do intervalo");
        }
        else{
            
            System.out.println("O número escolhido está fora do intervalo");
        }
    
        entrada.close();
}

}