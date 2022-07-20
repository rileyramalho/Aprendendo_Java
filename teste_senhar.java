import java.util.Random;
import java.util.Scanner;

public class teste_senhar {
   
  public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        Random aleatorio = new Random();
        
        System.out.println("\nDigite seu nome: ");
        String nome = entrada.next();

        System.out.println("\nConfigure uma senha: ");
        String senha_pre = entrada.next();

        System.out.println("\nGostaria de ver sua senha?");
        System.out.println("Sim\nNao\n");
        String opcao = entrada.next();

    switch (opcao) {
     
      case "Sim" :
           
           System.out.println(senha_pre);
           System.out.println("\nEntrando no programa...");

           System.out.println("\nDigite sua senha: ");
           String senha = entrada.next();

        if(senha.equals(senha_pre)){
           
          System.out.println("Acesso concedido.");
          System.out.println("Seja Bem-Vindo(a) " +nome+" ao gerador de gift card da Riley Shop!");
        }

        else
        {
        
          System.out.println("Acesso negado.\nRetornando para o menu principal...");
          System.exit(0);

        }
         
       break; 

      case "Nao":
        
         System.out.println("");
         System.out.println("\nEntrando no programa...");

         System.out.println("\nDigite sua senha: ");
         String senhar = entrada.next();

       if(senhar.equals(senha_pre)){
        System.out.println("Acesso concedido.");
        System.out.println("Seja Bem-Vindo(a) " +nome+" ao gerador de gift card da Riley Shop!");

       }
       else
      
       {
       
        System.out.println("Acesso negado.\nRetornando para o menu principal...");
        System.exit(0);

       }
       
       break;

      default:

        System.out.println("Opção inválida.\nRetornando ao menu principal...");

        System.exit(0);

       break;
  
    }
  
  System.out.println("\nEscolha o gift card de sua preferência:\n");
  System.out.println("1 - Games\n2 - Comida\n3 - Utilidades\n");

  int opcao_gift = entrada.nextInt();

    switch (opcao_gift) {

      case 1:

          System.out.println("\n1 - Xbox\n2 - PSN\n3 - Steam\n4 - Nintendo eShop\n5 - Garena Free Fire\n");
          int gift_games = entrada.nextInt();

            switch(gift_games) {

              case 1:
                
               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n4 - Gamepass Ultimate 3 meses - R$135\n");
               int xbox = entrada.nextInt();

               if(xbox == 1){
                
                for(long i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Xbox no valor de R$50:\n" +aleatorio.nextLong());
                }

               }
               
               else if(xbox == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Xbox no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(xbox == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Xbox no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

               else if(xbox == 4){

                for(int i = 0; i < 1; i++){
                
                System.out.println("Seu código do gift card Xbox Gamepass Ultimate de 3 meses:\n" +aleatorio.nextInt());

            }
          }
              
             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

          case 2:

               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int psn = entrada.nextInt();

               if(psn == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card PSN no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(psn == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card PSN no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(psn == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card PSN no valor de R$200:\n" +aleatorio.nextInt());

              }
            }
              
             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

          case 3:
          
               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int Steam = entrada.nextInt();

               if(Steam == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Steam no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(Steam == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Steam no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(Steam == 3){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Steam no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;


        case 4:

             System.out.println("Escolha o valor do seu gift card: ");
             System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
             int Nintendo = entrada.nextInt();

             if(Nintendo == 1){
              
              for(int i = 0; i < 1; i++){
                
                System.out.println("Seu código do gift card Nintendo no valor de R$50:\n" +aleatorio.nextInt());
              }

             }
             
             else if(Nintendo == 2){
              
              for(int i = 0; i < 1; i++){
                
                System.out.println("Seu código do gift card Nintendo no valor de R$100:\n" +aleatorio.nextInt());
              }

            }
            
             else if(Nintendo == 3){
              
              for(int i = 0; i < 1; i++){
                
                System.out.println("Seu código do gift card Nintendo no valor de R$200:\n" +aleatorio.nextInt());

            }
          }
            
           else{

              System.out.println("Opção inválida.\nRetornando ao menu principal...");

              System.exit(0);

           }    
            
           break;   
        
        case 5:
        
               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int free = entrada.nextInt();

               if(free == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Free Fire no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(free == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Free Fire no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(free == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Free Fire no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

          }
    //Inicia o caso 2 do Switch "Opções". 
        break;
        
      case 2:
        
          System.out.println("\n1 - Ifood\n2 - Uber Eats\n3 - LivUp\n4 - Rappi\n5 - Cornershop\n");
          int gift_food = entrada.nextInt();

       switch (gift_food) {

         case 1:

         System.out.println("Escolha o valor do seu gift card: ");
         System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
         int Ifood = entrada.nextInt();

         if(Ifood == 1){
          
          for(int i = 0; i < 1; i++){
            
            System.out.println("Seu código do gift card Ifood no valor de R$50:\n" +aleatorio.nextInt());
          }

         }
         
         else if(Ifood == 2){
          
          for(int i = 0; i < 1; i++){
            
            System.out.println("Seu código do gift card Ifood no valor de R$100:\n" +aleatorio.nextInt());
          }

        }
        
         else if(Ifood == 3){

          for(int i = 0; i < 1; i++){
            
            System.out.println("Seu código do gift card Ifood no valor de R$200:\n" +aleatorio.nextInt());

        }
      }

       else
      {

          System.out.println("Opção inválida.\nRetornando ao menu principal...");

          System.exit(0);

       }    
        
       break;

      case 2:

               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int ubere = entrada.nextInt();

               if(ubere == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Uber Eats no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(ubere == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Uber Eats no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(ubere == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Uber Eats no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;
          
          case 3:
          
               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$75\n3 - R$100\n");
               int LivUp = entrada.nextInt();

               if(LivUp == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card LivUp no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(LivUp == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card LivUp no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(LivUp == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card LivUp no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

          case 4:

               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int Rappi = entrada.nextInt();

               if(Rappi == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Rappi no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(Rappi == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Rappi no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(Rappi == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Rappi no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

           case 5:
           
               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int Cornershop = entrada.nextInt();

               if(Cornershop == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Cornershop no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(Cornershop == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Cornershop no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(Cornershop == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Cornershop no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

       }   

        break;
        
     case 3:

      System.out.println("\n1 - Uber\n2 - PayPal\n3 - Netflix\n4 - Spotify\n5 - Google Play\n");
      int gift_utilities = entrada.nextInt();

        switch (gift_utilities){


          case 1: 
            System.out.println("Escolha o valor do seu gift card: ");
            System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
            int Uber = entrada.nextInt();

            if(Uber == 1){
             
             for(int i = 0; i < 1; i++){
               
               System.out.println("Seu código do gift card Uber no valor de R$50:\n" +aleatorio.nextInt());
             }

            }
            
            else if(Uber == 2){
             
             for(int i = 0; i < 1; i++){
               
               System.out.println("Seu código do gift card Uber no valor de R$100:\n" +aleatorio.nextInt());
             }

           }
           
            else if(Uber == 3){

             for(int i = 0; i < 1; i++){
               
               System.out.println("Seu código do gift card Uber no valor de R$200:\n" +aleatorio.nextInt());

           }
         }

          else{

             System.out.println("Opção inválida.\nRetornando ao menu principal...");

             System.exit(0);

          }    
           
          break;


      case 2:

        System.out.println("Escolha o valor do seu gift card: ");
        System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
        int Paypal = entrada.nextInt();

        if(Paypal == 1){
         
         for(int i = 0; i < 1; i++){
           
           System.out.println("Seu código do gift card Paypal no valor de R$50:\n" +aleatorio.nextInt());
         }

        }
        
        else if(Paypal == 2){
         
         for(int i = 0; i < 1; i++){
           
           System.out.println("Seu código do gift card Paypal no valor de R$100:\n" +aleatorio.nextInt());
         }

       }
       
        else if(Paypal == 3){

         for(int i = 0; i < 1; i++){
           
           System.out.println("Seu código do gift card Paypal no valor de R$200:\n" +aleatorio.nextInt());

       }
     }

      else{

         System.out.println("Opção inválida.\nRetornando ao menu principal...");

         System.exit(0);

      }    
       
      break;
     
    case 3:

               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int Netflix = entrada.nextInt();

               if(Netflix == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Netflix no valor de R$50:\n" +aleatorio.nextInt());

                }

               }
               
               else if(Netflix == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Netflix no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(Netflix == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Netflix no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

           case 4:

               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int Spotify = entrada.nextInt();

               if(Spotify == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Spotify no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(Spotify == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Spotify no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(Spotify == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Spotify no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

          case 5:
          
               System.out.println("Escolha o valor do seu gift card: ");
               System.out.println("1 - R$50\n2 - R$100\n3 - R$200\n");
               int GooglePlay = entrada.nextInt();

               if(GooglePlay == 1){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Google Play Fire no valor de R$50:\n" +aleatorio.nextInt());
                }

               }
               
               else if(GooglePlay == 2){
                
                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Google Play Fire no valor de R$100:\n" +aleatorio.nextInt());
                }

              }
              
               else if(GooglePlay == 3){

                for(int i = 0; i < 1; i++){
                  
                  System.out.println("Seu código do gift card Google Play Fire no valor de R$200:\n" +aleatorio.nextInt());

              }
            }

             else{

                System.out.println("Opção inválida.\nRetornando ao menu principal...");

                System.exit(0);

             }    
              
             break;

  
           }
      
        break;
        
         default:

          System.out.println("Opção inválida.\nRetornando ao menu inicial...");

          System.exit(0);

         break; 

    }

      entrada.close();

  }  



}
 
