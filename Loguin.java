import java.util.Scanner;

public class Loguin {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu primeiro nome");

        String nome = scanner.nextLine();

        System.out.println("Digite seu último nome");

        String sobrenome = scanner.nextLine();

        String username = nome.charAt(0) + "_" + sobrenome;
        
        String senha = null;


         boolean senhaForte = false;

         while (senhaForte == false) {

             System.out.println("Digite uma senha:");
              senha = scanner.nextLine();

             if(senha.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[-, !, @])(?=.*[A-Z])(?=.*\\d).+") && senha.length() >= 8){
                 System.out.println("Senha forte!");


                 senhaForte = true;
             } else {
                 System.out.println("A senha deve conter pelo menos 8 caracteres, incluindo pelo menos 1 letra minúscula, 1 letra maiúscula, 1 caractere especial e 1 número.");

                }


         }
 
        System.out.println("Username: " + nome.charAt(0) + "_" + sobrenome);
        System.out.println("Senha:" + senha );

        boolean Entrada = false;
        while ( Entrada == false ){

            System.out.println("Digite seu username:");
            String Login = scanner.nextLine();

            System.out.println("Digite sua senha:");
            String Senha = scanner.nextLine();

            if (Login.equals(username) && Senha.equals(senha)){
                System.out.println("Sucess!!!");
            Entrada = true;
            } else{
                System.out.println("Verifique as informaçoes e tente novamente.");
            }
        }


        }

         }



