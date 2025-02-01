import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("digita un numero entero positivo ");
        int num = scn.nextInt();

        if (num <= 0) {
            System.out.println("ngresa un número entero positivo ");
        } else {
            System.out.print("cuenta regresiva "+num+": " );
            for (int i = num; i >=0; i--) {
                if (i != num) {
                    System.out.print(" , ");
                }
                System.out.print(i);
            }
        }
    }
}