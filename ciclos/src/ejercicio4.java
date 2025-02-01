import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("digita un numero entero positivo ");
        int num = scn.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scn.close();
    }
}