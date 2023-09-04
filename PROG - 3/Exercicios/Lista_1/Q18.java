package Exercicios.Lista_1;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        byte total_andares = 0;
        System.out.println("Digite o total de andares:");
        total_andares = read.nextByte();
        byte aux = 0, elevador = 0;

        for (int a = 0; a < total_andares; a++) {

            System.out.printf("Informe quantas pessoas entraram no elevador no %dº andar: ", a + 1);
            aux = read.nextByte();
            elevador += aux;
            System.out.printf("Informe quantas pessoas saíram do elevador no %dº andar: ", a + 1);
            aux = read.nextByte();
            elevador -= aux;
            if (elevador > 15)
                do {
                    System.out.printf("EXCESSO DE PASSAGEIROS. DEVEM SAIR %d pessoa(s) ou mais: ", elevador - 15);
                    aux = read.nextByte();
                    elevador -= aux;
                } while (elevador > 15);
        }
        System.out.printf("%d pessoa(s) desce(m) do elevador\n", elevador);
        read.close();
    }

}
