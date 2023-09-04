package Exercicios.Lista_5.Q1;

public class data {
    int dia, mes, ano;

    public data(int dia, int mes, int ano) {
        if ((dia <= 31 && dia > 0) && (mes <= 12 && mes > 0) && ano > 0) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            this.dia = 01;
            this.mes = 01;
            this.ano = 2011;
        }
    }

    public boolean alteraData(int dia, int mes, int ano) {
        if ((dia <= 31 && dia > 0) && (mes <= 12 && mes > 0) && ano > 0) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
            return true;
        } else {
            return false;
        }
    }

    public void adicionaDias(int dias) {
        if (dias <= 365 && dias > 0) {
            if (dias / 365 == 1)
                this.ano++;
            else { // dias menores que 1 ano
                if (dias > 30) {
                    if ((dias / 30) + this.mes > 12) {
                        this.ano++;
                        this.mes = (dias / 30 + this.mes) / 12;
                        dias = dias / 30;

                    } else
                        this.mes = this.mes + (dias / 30);
                }
                if (this.dia + dias > 30) {
                    this.mes++;
                    this.dia = (this.dia + dias) - 30;
                } else
                    this.dia += dias;
            }

        } else {
            System.out.println("Quantidade inválida, apenas maior que e menor ou igual a 365!");
        }

    }

    public void dias_ate_fimAno() {
        int resta = 0;
        resta = this.dia;
        resta += this.mes * 30;
        System.out.printf("Restam: %d dias", 365 - resta);

    }

    public void imprime() {
        if (this.dia < 10 && this.mes < 10)
            System.out.printf("Formato: dd/mm/aa\n0%d/0%d/%4d\n", this.dia, this.mes, this.ano);
        else if (this.dia < 10 && this.mes > 10)
            System.out.printf("Formato: dd/mm/aa\n0%d/%2d/%4d\n", this.dia, this.mes, this.ano);
        else
            System.out.printf("Formato: dd/mm/aa\n%d/%2d/%4d\n", this.dia, this.mes, this.ano);
    }
}
