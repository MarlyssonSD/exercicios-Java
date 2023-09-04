package Exercicios.Lista_1;
import javax.swing.JOptionPane;

public class Q6 {
    public static void main(String[] args) {
        String N = JOptionPane.showInputDialog("Digite o valor N");
        int valor = Integer.parseInt(N);
        for (int a = 0; a <= valor; a++) {
            System.out.printf("%d ", (a));

        }
    }

}
