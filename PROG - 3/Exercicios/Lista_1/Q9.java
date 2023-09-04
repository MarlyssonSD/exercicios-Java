package Exercicios.Lista_1;
import java.util.Scanner;

public class Q9 {
    private static final int quant = 10;

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idades[] = new int[quant];
        float media = 0;

        System.out.printf("Digite %d idades:\n", quant);
        for (int a = 0; a < quant; a++) {

            idades[a] = read.nextInt();
            media += idades[a];
        }
        System.out.printf("A média das idades é: %.2f\n", media / quant);
        read.close();
    }

}
