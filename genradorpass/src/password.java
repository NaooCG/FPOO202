import java.util.Random;
public class password {

    private int id;
    private int numeros;
    private String minusculas, mayusculas;

    //constructort
    public password() {
        this.id = id;
        this.numeros = numeros;
        this.minusculas = minusculas;
        this.mayusculas = mayusculas;
    }
    //zona gets & zets
    public int getNumeros() {
        return numeros;
    }
    public void setNumeros(int numeros) {
        this.numeros = numeros;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getMinusculas() {
        return minusculas;
    }
    public void setMinusculas(String minusculas) {
        this.minusculas = minusculas;
    }
    public String getMayusculas() {
        return mayusculas;
    }
    public void setMayusculas(String mayusculas) {
        this.mayusculas = mayusculas;
    }
     public void mostrarInfo(){
         System.out.println("-------generador de contraseña -----");
         System.out.println(" ID Cuenta " + id);
         System.out.println(" ingresa numeros " + numeros);
         System.out.println(" ingresa minusculas " + minusculas);
         System.out.println(" ingresa minusculas " + mayusculas);
         System.out.println("------------------------------------");
     } // cerrar mostar

    String generador(int length, boolean includeUpperCase, boolean includeSpecialChars){
        String characterSet ="abcdefghijklmnopqrstuvwxyz0123456789";
        if (includeSpecialChars){
            characterSet+="@#$%&/()=?¡¿*+-.:;";
        } if (includeUpperCase){
            characterSet+="ABCDEFGHIJKLMNOPQRSTUUVWXYZ";
        }
        Random gne=new Random();
        StringBuilder password = new StringBuilder(length);
        for (int i=0; i<length;i++) {
            password.append(characterSet.charAt(gne.nextInt(characterSet.length())));
        }
        return password.toString();
    }//cerrargenerador
}