import java.util.Scanner;
public class ejercicio4 {

    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        String name=scn.nextLine();
        System.out.println("tu nombre tiene "+name.length()+ " letras ");

        String nameUpperCase = name.toUpperCase();
        int length = name.length();
        System.out.println(nameUpperCase + " tiene " + length + " letras");
    }
}
