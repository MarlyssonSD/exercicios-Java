package Exercicios.Lista_1;
import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char continuar = 'd';
        float pago_vista = 0, pago_prazo = 0, total = 0, aux = 0;
        

        do {
            System.out.println("Quer pagar a vista (v) ou a prazo (p)");
            continuar = read.next().charAt(0);
            if (Character.toLowerCase(continuar) == 'p') {
                System.out.print("Digite o valor:");
                aux = read.nextFloat();
                pago_prazo += aux;
                total += aux;
            } else if (Character.toLowerCase(continuar) == 'v') {
                System.out.print("Digite o valor:");
                aux = read.nextFloat();
                pago_vista += aux;
                total += aux;

            }

        } while (Character.toLowerCase(continuar) != 's');
        System.out.printf("Valor total a vista: %.2f\n", pago_vista);
        System.out.printf("Valor total a prazo: %.2f\n", pago_prazo);
        System.out.printf("Valor total: %.2f\n", total);

        read.close();
    }

}
