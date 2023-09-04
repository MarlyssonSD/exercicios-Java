package Exercicios.Lista_1;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String nome = "", nome_mais_velha = "";
        int idade = 0, maior_idade = 0;

        System.out.println("Digite o nome:");
        nome = read.nextLine();
        System.out.println("Digite a idade:");
        idade = read.nextInt();
        read.nextLine();

        maior_idade = idade;
        nome_mais_velha = nome;
        do {
            if (idade > maior_idade) {
                maior_idade = idade;
                nome_mais_velha = nome;
            }
            System.out.println("Digite o nome: (flag:fim)");
            nome = read.nextLine();
            if (!nome.equals("fim")) {
                System.out.println("Digite a idade:");
                idade = read.nextInt();
                read.nextLine();
            }

        } while (!nome.equals("fim"));
        System.out.printf("A pessoa mais velha é: " + nome_mais_velha + "\n");
        read.close();
    }

}
