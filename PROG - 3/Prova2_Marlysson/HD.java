//MARLYSSON SILVA DANTAS
public class HD {
    Programa[] programas;
    int quantProgramas = 0;
    int tamTotalProgamas = 0;
    SO so_atual;
    boolean temSistemaInstalado = false;
    String nomeHD;
    int tamanho;

    public HD(String nome, int tamanho) {
        this.nomeHD = nome;
        this.tamanho = tamanho;
        programas = new Programa[20];
    }

    public boolean temSistemaInstalado() {
        return temSistemaInstalado;
    }

    public void instalaSistemaOP(SO so) {
        so_atual = so;
        tamTotalProgamas += so.tamanho;
        if (temSistemaInstalado()) {
            System.out.printf(
                    "Sistema operacional será substituído por %s (%s) e todos os programas serão removidos\n",
                    so_atual.nome, so_atual.tipo);
            for (int a = 0; a < programas.length; a++)
                programas[a] = null;
            quantProgramas = 0;
            tamTotalProgamas = so.tamanho;

        } else {
            System.out.printf("Sistema operacional %s (%s) instalado\n", so_atual.nome, so_atual.tipo);
            temSistemaInstalado = true;

        }
    }

    public void instalaProgama(Programa p) {
        if (temSistemaInstalado()) {
            programas[quantProgramas] = p;
            tamTotalProgamas += p.tamanho;
            System.out.println("Programa " + programas[quantProgramas].nome + " instalado com sucesso");
            quantProgramas++;
        } else
            System.out.println("O disco ainda não possui sistema operacional instalado");
    }

    public void listaInfo() {
        if (temSistemaInstalado()) {
            System.out.println("Nome do disco: " + nomeHD);
            System.out.printf("Tamanho: %d/%d MB\n", tamTotalProgamas, tamanho);
            System.out.printf("Sistema operacional: %s (%s)\n", so_atual.nome, so_atual.tipo);
            if (quantProgramas > 0) {
                System.out.println("PROGRAMAS INSTALADOS");
                for (int a = 0; a < quantProgramas; a++)
                    System.out.printf("- %s %dMb\n", programas[a].nome, programas[a].tamanho);
            } else
                System.out.println("Sem programas instalados");
        } else
            System.out.println("O disco ainda não possui sistema operacional instalado");
    }

    public void formatar() {
        if (temSistemaInstalado()) {
            for (int a = 0; a < programas.length; a++)
                programas[a] = null;
            so_atual = null;
            temSistemaInstalado = false;
        } else
            System.out.println("Não tem nada para formatar");
    }
}
