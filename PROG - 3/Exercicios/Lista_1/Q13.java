package Exercicios.Lista_1;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int x = 1, y = 0;
        do {
            System.out.println("---------------");
            System.out.print("Digite o X:");
            x = read.nextInt();
            if (x != 0) {
                System.out.print("Digite o Y:");
                y = read.nextInt();
                if (x > 0 && y > 0)
                    System.out.println("Primeiro");
                else if (x < 0 && y > 0)
                    System.out.println("Segundo");
                else if (x < 0 && y < 0)
                    System.out.println("Terceiro");
                else if (x > 0 && y < 0)
                    System.out.println("Quarto");
            }

        } while (x != 0);
        read.close();
    }

}
