package Exercicios.Lista_1;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float peso_total = 0, peso_caixa;
        for (int a = 0; a < 25; a++) {
            peso_caixa = read.nextFloat();
            peso_total += peso_caixa;
        }
    System.out.printf("Total a ser carregado: %d", peso_total);
        read.close();
    }
}
