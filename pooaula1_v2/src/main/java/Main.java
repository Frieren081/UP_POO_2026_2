import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Hello World");

        String message = "Uma mensagem qualquer";
        Integer age = 10;
        Float littleNumber = 10.0f;
        Double bigNumber = 10.0d;


        System.out.println("Age: " + age.toString());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Escreva uma mensagem: ");
        message = scanner.next();
        System.out.println("Message: " + message);
    }
}