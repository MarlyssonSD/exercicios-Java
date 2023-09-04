package Exercicios.Lista_2;

//import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int lista[] = new int[0];
        int num;
        System.out.println("Digite números inteiros positivos (0 para sair):");
        do {
            num = read.nextInt();

            if (num > 0) {
                int temp_lista[] = new int[lista.length + 1];

                for (int i = 0; i < lista.length; i++)
                    temp_lista[i] = lista[i];
                temp_lista[temp_lista.length - 1] = num;
                lista = temp_lista;
            }

        } while (num != 0);
        for (int i = lista.length - 1; i < lista.length; i--) {
            System.out.printf("%d ", lista[i]);
            // System.out.write(lista[i]);
        }
        read.close();
    }
}

// public class Q1 {
// public static void main(String[] args) {
// ArrayList lista = new ArrayList();
// Scanner read = new Scanner(System.in);
// int num;

// System.out.println("Digite números inteiros positivos (0 para sair):");
// do {
// num = read.nextInt();
// if (num > 0) {
// lista.add(num);
// }
// } while (num != 0);

// System.out.println("Números lidos na ordem inversa:");
// for (int i = lista.size() - 1; i >= 0; i--) {
// System.out.println(lista.get(i));
// }
// }

// }
