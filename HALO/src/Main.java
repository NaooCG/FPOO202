public class Main {
    public static void main(String[] args) {

        //creamos el segundo objeto
        Spartan masterChief= new Spartan();

        //usar atributos
        masterChief.nombre= " Jhon " ;
        masterChief.salud= 100;
        masterChief.escudo= 70;
        masterChief.armaPrincipal= " Rifle de asalto ";

        //invocamos metodos
        masterChief.mostrarInfo();
        masterChief.atacar(" Grunt ");
        masterChief.recargarArma( 75);
        masterChief.correr( true);

        //creamos el primer objeto
        Spartan Equipo= new Spartan();

        //usar atributos
        Equipo.nombre= " Blue " ;
        Equipo.salud= 1000;
        Equipo.escudo= 990;
        Equipo.armaPrincipal= " Rifle de asalto ";

        //invocamos metodos
        Equipo.mostrarInfo();
        Equipo.atacar(" Grunt ");
        Equipo.recargarArma( 75);
        Equipo.correr( true);
    }
}