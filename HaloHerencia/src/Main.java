//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Spartanll jefemaestro=new Spartanll("jonh", 90, "rifle de asalto", 0);
        jefemaestro.mostrarInfo();
        jefemaestro.usarManejoAvanzado();
        jefemaestro.atacar("covenant ");
        jefemaestro.recibirDano(50);
        jefemaestro.recargarEscudo();

        Spartanlll nobleSix=new Spartanlll("Nao", 50, "espada de luz", 0);
        nobleSix.mostrarInfo();
        nobleSix.camuflajeActivo();
        nobleSix.atacar("covenant ");
        nobleSix.recibirDano(50);
        nobleSix.recargarEscudo();

        SpartanlV noble=new SpartanlV("Pablo", 70, "francotirador", 0);
        noble.mostrarInfo();
        noble.usarPropulsores();
        noble.atacar("covenant ");
        noble.recibirDano(50);
        noble.recargarEscudo();
    }
}
