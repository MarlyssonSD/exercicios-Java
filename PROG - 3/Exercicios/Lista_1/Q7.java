package Exercicios.Lista_1;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        System.out.println("Digite um número:");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        for (int a = n - 1; a >= 2; a--) {
            if (a % 4 == 0)
                System.out.print("|"+a);

        }

        read.close();
    }
}
