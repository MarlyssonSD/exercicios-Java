
package Exercicios.Lista_1;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        byte idade = 0;
        float soma = 0, quant = -1;
        System.out.println("Digite idades e descubra a média:");
        do {
            idade = read.nextByte();
            soma += idade;
            quant++;
        } while (idade != 0);
        System.out.printf("A média das idades é: %.2f \n", (soma / quant) * 1.0f);
        read.close();
    }

}
