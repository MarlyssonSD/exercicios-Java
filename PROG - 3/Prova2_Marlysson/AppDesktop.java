//MARLYSSON SILVA DANTAS
public class AppDesktop {
    public static void main(String[] args) {

        Desktop d = new Desktop("Disco1", 300);

        SO so = new SO("Windows 11", 30, "windows");
        d.instalar(so);

        Programa p = new Programa("Adobe", 20);
        d.instalar(p);

        p = new Programa("Visual Studio Code", 50);
        d.instalar(p);
        d.listar();

        SO so2 = new SO("macOS Monterrey", 70, "macOS");
        // System.out.println("--------------");
        d.instalar(so2);
        d.listar();
        d.formatar();
        d.listar();

        HD hd = new HD("Meu Disco", 100);
        Desktop novo = new Desktop(hd);
        novo.instalar(so);
        novo.listar();
    }
}
