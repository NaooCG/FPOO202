import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("escribe una frase:");
        String frase = scn.nextLine();

        String FI = new StringBuilder(frase).reverse().toString();

        System.out.println("tu frase invertida es: " + FI);
    }
}
