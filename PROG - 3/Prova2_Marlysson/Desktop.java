//MARLYSSON SILVA DANTAS
public class Desktop {
    HD hd;

    public Desktop(String nomedoHD, int tamanho) {
        this.hd = new HD(nomedoHD, tamanho);

    }

    public Desktop(HD hd) {
        this.hd = new HD(hd.nomeHD, hd.tamanho);

    }

    public void instalar(SO so) {
        hd.instalaSistemaOP(so);

    }

    public void instalar(Programa programa) {
        hd.instalaProgama(programa);
     
    }

    public void listar() {
        hd.listaInfo();
    }

    public void formatar() {
        hd.formatar();
    }

}
