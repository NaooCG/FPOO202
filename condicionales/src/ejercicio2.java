import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("introduce un numero entero ");
        int num =scn.nextInt();

        if (num%2==0) {
            System.out.println("el numero " +num+ " es par");
        } else {
            System.out.println("el numero " +num+ " es impar");
        }
    }
}
