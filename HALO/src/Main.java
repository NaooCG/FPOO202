public class Main {
    public static void main(String[] args) {

        //creamos el segundo objeto
        Spartan masterChief= new Spartan(" Jhon ", 100,70, " Rifle de asalto ");

        //usar atributos

        //invocamos metodos
        masterChief.mostrarInfo();
        masterChief.atacar(" Grunt ");
        masterChief.recargarArma( 75);
        masterChief.correr( true);

        //intento de uso de un metodo privado
        //masterChief.consultaCortana();

        //usamos get y set para cambiar nombre al atributo
        masterChief.setNombre("Nao");
        masterChief.mostrarInfo();
        System.out.println(masterChief.getNombre());

        //creamos el primer objeto
        Spartan Equipo= new Spartan(" Blue ", 1000, 990,  "Rifle de asalto " );

        //usar atributos

        //invocamos metodos
        Equipo.mostrarInfo();
        Equipo.atacar(" Grunt ");
        Equipo.recargarArma( 75);
        Equipo.correr( true);
    }
    //zona gets y sets
}