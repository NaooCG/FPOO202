public class Spartan {

    public String nombre;
    int escudo, salud;
    String armaPrincipal;

    public void mostrarInfo(){
        System.out.println("-------Informacion del Spartan -----");
        System.out.println(" Nombre " + nombre);
        System.out.println(" % de salud " + salud);
        System.out.println(" % de escudo" + escudo);
        System.out.println(" Arma disponible" + armaPrincipal);
        System.out.println("------------------------------------");
    }//mostarInfo

    public void atacar(String enemigo){
        System.out.println(nombre+ " ataca a "+ enemigo+ " con "+ armaPrincipal);
    }//mostaratacar

    public void recargarArma(int municiones){
        int restantes =10;
        int total= restantes+municiones;
        System.out.println(armaPrincipal+ " ahora tienes disponible "+ total+ " balas ");
    }//mostarrecargarArma

    public void correr(boolean status){
        if (status){
                System.out.println(nombre+ " esta corriendo ");
        }else{
            System.out.println(nombre+ " se detuvo ");
        }
    }//mostarcorrer
}//llave de la clase