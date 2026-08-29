import java.util.Scanner;

public class Aula {
        static void main() {

                String nome = "";
                double altura = 0;
                double peso = 0;

                Scanner scanner = new Scanner(System.in);
                System.out.printf("Digite seu nome: ");
                nome = scanner.nextLine();
                System.out.printf("Digite sua altura: ");
                altura = scanner.nextDouble();
                System.out.printf("Digite seu peso: ");
                peso = scanner.nextDouble();

                double IMC = peso / (altura * altura);

                if (IMC < 18.5) {
                        System.out.println(nome + ", você está abaixo do peso!");
                        System.out.println("IMC respectivo: " + IMC);

                } else if (IMC == 18.5) {
                        System.out.println(nome + ", você está no peso adequado!");
                        System.out.println("IMC respectivo: " + IMC);

                } else if (IMC <= 24.9) {
                        System.out.println(nome + ", você está acima do peso!");
                        System.out.println("IMC respectivo: " + IMC);

                } else if (IMC >= 25.00) {
                        System.out.println(nome + ", você entrou no grau de obesidade, procure ajuda médica imediatamente!");
                        System.out.println("IMC respectivo: " + IMC);

                }
        }
}
