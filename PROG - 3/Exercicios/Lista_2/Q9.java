package Exercicios.Lista_2;

import java.util.Scanner;

public class Q9 {
    private static final int tam = 3;
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int Filmes_locados[] = new int[tam];
        for (int i = 0; i < Filmes_locados.length; i++) {
            System.out.printf("Quantos filmes o cliete %d retirou? ", i+1);
            Filmes_locados[i] = read.nextInt();
        }
        int filmes_gratis[] = new int[tam];
        for (int i = 0; i < filmes_gratis.length; i++) {
            filmes_gratis[i] = Filmes_locados[i]/10;
        }
        for(int i = 0; i < filmes_gratis.length;i++)
            System.out.printf("Cliente %d locou %d filmes e tem direito a %d filmes gratuitos !!\n",i+1,Filmes_locados[i],filmes_gratis[i]);
        read.close();

    }
}
