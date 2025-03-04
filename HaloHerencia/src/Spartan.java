public class Spartan extends Soldado{
    //extends indica que una clase hereda de otra(Soldado)
    private int escudo;

    public Spartan(String nombre, int salud, String arma, int escudo){
    //super usar constructores, atributos y métodos de la clase padre(Soldado)
    super(nombre, salud, arma);
    this.escudo=escudo;
    }
    //herencia
    @Override
    public void recibirDano(int dano){
        if(escudo>0){
            escudo-=dano;
            if(escudo<0){
                salud-=escudo;
            }
            System.out.println(nombre+ "Recibio daño: "+ escudo + salud);
        }else{
            //erencia
            super.recibirDano(dano);
        }
    }
    public void recargarEscudo(){
        escudo=100;
        System.out.println(nombre + "Espartan a recando escudo al Maximo: ");
    }
    //herencia
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Escudo: "+ this.escudo);}
}
