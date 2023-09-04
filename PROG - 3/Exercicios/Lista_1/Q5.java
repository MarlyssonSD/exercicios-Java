package Exercicios.Lista_1;
import javax.swing.JOptionPane;

public class Q5 {

    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Valor - 0 finaliza");
        int valor = Integer.parseInt(leitura);
        int maior = valor;
        int menor = valor;

        while (valor != 0) {
            if (valor < 0) {
                JOptionPane.showInputDialog("O valor digitado é menor que zero");

            }
            if (valor > maior)
                maior = valor;
            if (valor < menor)
                menor = valor;
            leitura = JOptionPane.showInputDialog("Valor - 0 finaliza");
            valor = Integer.parseInt(leitura);
        }
        System.out.println("O maior valor lido foi: " + maior);
        System.out.println("O menor valor lido foi: " + menor);
    }

}
