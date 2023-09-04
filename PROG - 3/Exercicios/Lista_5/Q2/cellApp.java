package Exercicios.Lista_5.Q2;

public class cellApp {
   
        public static void main(String[] args) {
            Celular c = new Celular("Vivo", "91234-1234");
            c.ligar();
            App app1 = new App("Whatsapp", 15.2); // nome e tamanho
            c.addAplicativo(app1);
            c.addAplicativo(app1);
            App app2 = new App("Instagram", 20.0);
            c.addAplicativo(app2);
            c.listarApps();
            c.ligar();
            c.desligar();
        }
    // }
    // celular ligado
    // o aplicativo Whatsapp já está instalado
    // Celular Vivo: 91234-1234
    // Lista de apps:
    // Whatsapp 15.2Mb
    // Instagram 20.0Mb
    // total ocupado: 35.2Mb
    // o celular já está ligado
}
