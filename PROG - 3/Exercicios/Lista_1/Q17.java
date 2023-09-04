package Exercicios.Lista_1;
import java.util.Scanner;
/*17) Escreva um programa em Java que lê um valor n inteiro e positivo e
que calcula a seguinte soma: 
S := 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
O programa deve escrever cada termo gerado e o valor final de S. 
 */

public class Q17 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = 0;
        float s = 0;
        n = read.nextInt();
        for (int a = 1; a <= n; a++) {
            s = s + (1.0f / a);
        }
        System.out.println(s);
        read.close();
    }

}
