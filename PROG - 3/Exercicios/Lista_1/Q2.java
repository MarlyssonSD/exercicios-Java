package Exercicios.Lista_1;
import javax.swing.JOptionPane;

public class Q2 {
    public static void main(String[] args) {
        String nome, salarioBruto, desconto;

        StringBuilder telaScan = new StringBuilder();

        nome = JOptionPane.showInputDialog("Digite o seu nome:");
        salarioBruto = JOptionPane.showInputDialog("Digite o seu salário:");
        float salarioBruto1 = Float.parseFloat(salarioBruto);

        desconto = JOptionPane.showInputDialog("Digite o desconto:");

        float desconto1 = Float.parseFloat(desconto);
        telaScan.append(nome).append(" tem ").append(salarioBruto1 - desconto1).append(" de salário liquido");
        JOptionPane.showMessageDialog(null, telaScan);

    }
}
