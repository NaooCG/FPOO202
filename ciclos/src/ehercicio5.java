import java.util.Scanner;

public class ehercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("ingresa una frase: ");
        String frase = scn.nextLine();

        System.out.print("ingresa la letra a buscar ");
        char letra = scn.next().charAt(0);

        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) ==letra) {
                contador++;
            }
        }
        System.out.println("La letra aparece " + contador);
    }
}
