package Prova2_Antiga;

public class AppProva {
    public static void main(String[] args) {
        Mes abril = new Mes();
        Compromisso c = new Compromisso("prova");
        abril.addCompromisso(c, 17, 10);
        c = new Compromisso("aula de revisão", "prof Andres");
        abril.addCompromisso(c, 19, 10);

        Videoconferencia v = new Videoconferencia("aula síncrona", "prof Alcides",
                "meet.google.com/gxf-fyhq-tak");
        abril.addCompromisso(v, 6, 8);

        Compromisso c1 = new Compromisso("hora do remédio");

        abril.addCompromissoDiario(c1, 10);
        abril.desmarcarCompromisso(1, 11);
        abril.desmarcarCompromisso(2, 10);
        abril.desmarcarCompromissos(30);
        abril.remarcarCompromisso(6, 8, 27, 12);
        abril.listarAgenda();
    }
}
