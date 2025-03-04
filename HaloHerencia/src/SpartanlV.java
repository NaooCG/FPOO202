public class SpartanlV extends Spartan {

    public SpartanlV(String nombre,int salud, String arma, int escudo ){
        super(nombre,salud,arma, 100);
    }
    public void usarPropulsores(){
        System.out.println(nombre+ "usa propulsores para moverse rapidamente");
    }
}
