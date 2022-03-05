import java.util.Scanner;

public class categorias {
    
    public static void main(String[] args){

    Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um idade para saber a categoria certa do participante: ");
        int idade = entrada.nextInt();
        

        if(idade >= 5 && idade <= 7){
            System.out.println("O participante é da categoria Infantil A");
        }    
        else if(idade >= 8 && idade <= 10){

            System.out.println("O participante é da categoria Infantil B");
        }
        else if(idade >= 11 && idade <= 13){

            System.out.println("O participante é da categoria Juvenil A");
        }
        else if(idade >= 14 && idade <= 17){

            System.out.println("O participante é da categoria Juvenil B");
        }
        else if(idade >= 18 && idade <= 135){

            System.out.println("O participante é da categoria Sênior");
        }
        else{
            
            System.out.println("O participante não se adequa em nenhuma categoria disponível.");
        }
    
        entrada.close();
}

}