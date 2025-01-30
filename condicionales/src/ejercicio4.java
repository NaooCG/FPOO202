import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.println("ingresa una palabra y te dire si es palindromo");
        String cadena = scn.nextLine();

        String cadenaI=new StringBuffer(cadena).reverse().toString();
        if (cadena.equalsIgnoreCase(cadenaI)){
            System.out.println("la cadena es "+cadena+ "es palindromo");
        }else {
            System.out.println("la cadena '" +cadena+"no es un palindromo");
        }

    }
}