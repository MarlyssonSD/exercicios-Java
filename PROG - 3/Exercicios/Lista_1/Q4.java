package Exercicios.Lista_1;
import javax.swing.JOptionPane;

public class Q4 {

    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Valor 1");
        int lado1 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor 2");
        int lado2 = Integer.parseInt(leitura);
        leitura = JOptionPane.showInputDialog("Valor 3");
        int lado3 = Integer.parseInt(leitura);

        if (lado1 == lado2 && lado2 == lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo equilatéro");
        } else if (lado1 != lado2 && lado2 != lado3 && lado1 != lado3) {
            JOptionPane.showMessageDialog(null, "Triângulo escaleno");

        } else {
            JOptionPane.showMessageDialog(null, "Triângulo isóceles");

        }
    }
}
