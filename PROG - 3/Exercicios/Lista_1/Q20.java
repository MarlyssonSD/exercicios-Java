package Exercicios.Lista_1;

public class Q20 {
    public static void main(String[] args) {
        float s = 0;
        for (float a = 1; a <= 10; a++) {
            if (a % 2 == 0)
                s -= a / (a * a);
            else if (a % 2 == 1)
                s += a / (a * a);

        }
        System.out.println(s);
    }

}
