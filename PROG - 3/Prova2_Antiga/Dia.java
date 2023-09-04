package Prova2_Antiga;

public class Dia {
    Compromisso[] horarios;
    int quantCompromisso;

    public Dia() {
        horarios = new Compromisso[24];
        quantCompromisso = 0;
    }

    public void addCompromisso(Compromisso c, int hora) {
        if (horarios[hora] == null) {
            horarios[hora] = c;
            quantCompromisso++;
        } else
            System.out.printf("Houve um choque no horário: %d:00\n", hora);

    }

    public void desmarcarCompromisso(int hora) {
        if (horarios[hora] != null) {
            horarios[hora] = null;
            quantCompromisso--;
            System.out.println("O compromisso foi desmarcado com sucesso");
        } else
            System.out.println("Não tem compromisso nesse horário");
    }

    public void desmarcarCompromissos() {
        for (int a = 1; a < horarios.length; a++)
            horarios[a] = null;
        quantCompromisso = 0;

    }

    public void remarcarCompromisso(int dia_ant, int hora_ant, int diaNovo, int horaNova) {

    }

    public boolean temCompromisso() {
        if (quantCompromisso > 0)
            return true;
        return false;
    }

    public void mostraCompromissos() {
        for (int a = 1; a < horarios.length; a++) {
            if (horarios[a] != null) {
                System.out.println("Hora: " + a + ":00");
                System.out.println("Título: " + horarios[a].titulo);

            }

        }
    }

}