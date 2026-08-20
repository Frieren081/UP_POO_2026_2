import java.util.Scanner;

public class Nome_Idade_Endereço {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);

        //Nome

        System.out.println("Insira seu nome: ");
        String nome = "";
        nome = input.nextLine();

        //Idade

        System.out.println("Insira a sua idade: ");
        Integer idade = 0;
        idade = input.nextInt();

        input.close();

        System.out.println("Estes são seus dados:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Estão corretos?");


    }
}
