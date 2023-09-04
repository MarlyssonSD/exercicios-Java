package Exercicios.Lista_1;

import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int idade, sexo, idade_H = 0, idade_M = 0, Idade_18_35 = 0, total_pessoas = 0, quant_M = 0;
        float altura,  altura_M = 0;//altura_H = 0,
        for (int a = 0; a < 3; a++) {
            System.out.print("Informe o sexo (1 para homens/0 para mulheres):");
            sexo = read.nextInt();
            System.out.print("Informe sua idade: ");

            if (sexo == 1) {
                idade = read.nextInt();
                System.out.println("Digite a altura: ");
                altura = read.nextFloat();
                // altura_H = altura;
                idade_H += idade;
            } else {
                idade = read.nextInt();
                System.out.println("Digite a altura: ");
                altura = read.nextFloat();
                altura_M = altura;
                idade_M += idade;
                quant_M++;
            }
            if (idade >= 18 && idade <= 35) {
                Idade_18_35++;
            }
            total_pessoas++;
        }
        read.close();
        System.out.println("A média da IDADE do grupo: " + (idade_H + idade_M) / total_pessoas);
        System.out.println("A média da ALTURA dos mulheres é: " + altura_M / quant_M);
        System.out.println("A média da IDADE dos homens é: " + (idade_H / (total_pessoas - quant_M)));
        System.out.println("Porcentagem das pessoas com 18 anos até 35: " + Idade_18_35 * 100f / total_pessoas);

    }

}
