package Prova2_Antiga;

public class Mes {
    Dia[] dias;

    public Mes() {
        dias = new Dia[31];
        for (int a = 0; a < dias.length; a++) {
            dias[a] = new Dia();
        }
    }

    public void addCompromisso(Compromisso c, int dia, int hora) {
        dias[dia].addCompromisso(c, hora);
        System.out.println("O compromisso foi agendado com sucesso");
    }

    public void addCompromisso(Videoconferencia v, int dia, int hora) {

    }

    public void addCompromissoDiario(Compromisso c, int hora) {
        for (int a = 1; a < dias.length; a++)
            dias[a].addCompromisso(c, hora);
        System.out.println("Os compromissos foram agendados com sucesso");

    }

    public void desmarcarCompromisso(int dia, int hora) {
        dias[dia].desmarcarCompromisso(hora);
    }

    public void desmarcarCompromissos(int dia) {
        dias[dia].desmarcarCompromissos();
    }

    public void remarcarCompromisso(int dia_ant, int hora_ant, int diaNovo, int horaNova) {

        // dias[dia_ant].remarcarCompromisso(dia_ant, hora_ant,diaNovo, horaNova);
    }

    public void listarAgenda() {
        for (int a = 1; a < dias.length; a++) {
            if (dias[a].temCompromisso()) {
                System.out.println("Dia " + a);
                dias[a].mostraCompromissos();

            }
        }

    }

}
