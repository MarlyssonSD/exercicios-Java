package Exercicios.ProvasAntigas;

public class Q2 {
    public static void main(String[] args) {
        int x[] = { 87, 21, -1, 75, 9, -1, -1, 4, 18, 30 };
        int i = 0;

        for (int a = 0; a < 6; a++) {
            if (x[a] == -1) {
                for (int b = a; b < x.length - 1; b++) {// fazer sem troca de var
                    x[b] = x[b + 1];
                }
                i++;
                a--;
            }
        }

        for (int a = 0; a < x.length - i; a++) {
            System.out.printf(x[a] + " ");
        }
    }

    /*
     * int aux = 0, i = 0;
     * 
     * for (int a = 0; a < x.length; a++) {
     * for (int b = a+1; b < x.length; b++) {
     * if (x[a] == -1) {
     * aux = x[b];
     * x[b] = x[a];
     * x[a] = aux;
     * }
     * }
     * if(x[a] ==-1)
     * i++;
     * 
     * }
     * for (int a = 0; a < x.length - i; a++) {
     * System.out.printf(x[a] + " ");
     * 
     * }
     */

}
