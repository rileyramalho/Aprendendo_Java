import java.util.Scanner;

public class HTFW {
    
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        float numero1 = entrada.nextFloat();

        System.out.println("Digite o segundo numero");
        float numero2 = entrada.nextFloat();

        if(numero1 == numero2){
            System.out.println("Os números são iguais! Tente novamente");
        }    
        else if(numero1 > numero2){
            //System.out.println(numero1);
            //System.out.println(numero2);
            System.out.println(numero1 + ", " + numero2);
        }
        else{
            //System.out.println(numero2);
            //System.out.println(numero1);
            System.out.println(numero2 + ", " + numero1);
        }
    
        entrada.close();
}

}