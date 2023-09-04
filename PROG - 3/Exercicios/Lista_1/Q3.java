package Exercicios.Lista_1;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float nota = 0;
        System.out.println("Digite a nota do aluno: ");
        nota = read.nextFloat();
        if (nota < 5) {
            System.out.println("Reprovado!");
        } else if (nota <= 7) {
            System.out.println("Tem direito a recuperação!");
        } else {
            System.out.println("Passou direto!!");
        }
        read.close();
    }
}
