package Exercicios.Lista_5.Q1;

import java.util.Scanner;

public class AppTempo {
    public static void main(String[] args) {
        int d = 0, m = 0, a = 0, aux = 0, choose = 0;
        Scanner ler = new Scanner(System.in);
        data data = new data(d, m, a);

        do {
            System.out.printf(
                    "\n1 - Digita a data\n2 - Altera a data\n3 - Adiciona dias a data\n4 - Imprime dias restantes até o fim do ano \n5 - Imprimir data\n0 - Sair\n");
            System.out.println("Escolha a opção: ");
            choose = ler.nextInt();
            switch (choose) {
                case 1:

                    System.out.println("Digite o dia: ");
                    d = ler.nextInt();
                    System.out.println("Digite o mês: ");
                    m = ler.nextInt();
                    System.out.println("Digite o ano: ");
                    a = ler.nextInt();
                    data = new data(d, m, a);
                    data.imprime();
                    break;
                case 2:
                    System.out.println("*Altere a data* ");
                    System.out.println("Digite o dia: ");
                    d = ler.nextInt();
                    System.out.println("Digite o mês: ");
                    m = ler.nextInt();
                    System.out.println("Digite o ano: ");
                    a = ler.nextInt();
                    if (data.alteraData(d, m, a)) {
                        data.imprime();
                    } else {
                        System.out.println("Data inválida!");
                    }
                    break;
                case 3:
                    System.out.println("Quantos dias quer adicionar a data?");
                    aux = ler.nextInt();
                    data.adicionaDias(aux);
                    data.imprime();
                case 4:
                    data.dias_ate_fimAno();
                break;
                case 5:
                data.imprime();
                    break;
            }
        } while (choose != 0);
        ler.close();
    }
}
