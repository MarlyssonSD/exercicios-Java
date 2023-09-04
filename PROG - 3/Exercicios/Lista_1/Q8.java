package Exercicios.Lista_1;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        byte opcao = 1;
        double num1, num2, resultado = 0;

        while (opcao != 0 && opcao <= 4) {
            System.out.println("**************");
            System.out.println("1 - somar");
            System.out.println("2 - substrair");
            System.out.println("3 - multiplicar");
            System.out.println("4 - dividir");
            System.out.println("**************");
            System.out.print("Digite a opção: ");
            opcao = scan.nextByte();
            System.out.println("Digite os 2 números:");
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();

            switch (opcao) {
                case 1:
                    resultado = num1 + num2;
                    break;
                case 2:
                    resultado = num1 - num2;
                    break;
                case 3:
                    resultado = num1 * num2;
                    break;
                case 4:
                    resultado = num1 / num2;

                    break;

                default:
                    break;
            }
            System.out.printf("Resultado: %.3f\n", resultado);
        }
        scan.close();

    }
}
