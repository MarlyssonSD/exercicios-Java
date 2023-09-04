package Exercicios.Lista_5.Q2;

public class Celular {
    String chip, num_chip;
    boolean on_off = false;
    App app[] = new App[20];
    int quant_app = 0;
    double armazenamento_ocupado = 0;

    public Celular(String chip, String num_chip) {
    
        this.chip = chip;
        this.num_chip = num_chip;
    }

    public void addAplicativo(App app_novo) {
        boolean exist_app = false;
        for (int a = 0; a < quant_app; a++) {
            if (app_novo.nome_app.equals(this.app[a].nome_app))
                exist_app = true;
        }
        if (exist_app) {
            System.out.println("O aplicativo " + app_novo.nome_app + " já está instalado");
        } else if (on_off) {
            this.app[quant_app++] = app_novo;
            armazenamento_ocupado += app_novo.tamanho;
        }
    }

    public void listarApps() {

        if (on_off) {
            System.out.println("Lista de aplicativos: ");
            for (int a = 0; a < quant_app; a++) {
                System.out.println("App " + this.app[a].nome_app + " " + this.app[a].tamanho + "Mb");
            }
            System.out.println("Armazenamento ocupado: " + armazenamento_ocupado + " Mb");
        }
    }

    public void desligar() {
        this.on_off = false;

    }

    public void ligar() {
        if (on_off)
            System.out.println("O celular já esta ligado");
        else {
            this.on_off = true;
            System.out.println("Celular foi ligado");
        }
    }

}
