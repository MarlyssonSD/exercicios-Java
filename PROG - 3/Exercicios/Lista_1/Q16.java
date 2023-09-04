package Exercicios.Lista_1;
import java.util.Scanner;

/*16) Escreva um programa em Java que leia uma quantidade desconhecida
de números e conte quantos deles estão nos seguintes intervalos:
[0,25], [26,50], [51,75] e [76,100]. A entrada de dados deve terminar quando for lido um número negativo.  */

public class Q16 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = 0;
        int intervalos[] = new int[4];
        // for (int a = 0; a < 4; a++) {
        // intervalos[a] = 0;
        // }
        System.out.println("Digite números nos intervalos: [0,25], [26,50], [51,75] e [76,100]");
        do {
            num = read.nextInt();
            if (num >= 0 && num <= 25) {
                intervalos[0] += 1;
            } else if (num > 25 && num <= 50) {
                intervalos[1] += 1;
            } else if (num > 50 && num <= 75) {
                intervalos[2] += 1;
            } else if (num > 75 && num <= 100) {
                intervalos[3] += 1;
            }

        } while (num > 0);

        for (int a = 0; a < 4; a++) {
            System.out.printf("No intervalo %d: %d\n", a + 1, intervalos[a]);
        }
        read.close();
    }
}
