import java.util.Random;
public class password {
    public int id, numeros;
    String minusculas, mayusculas;

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