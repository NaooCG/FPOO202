import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("digita un numero entero positivo ");
        int num = scn.nextInt();

        if (num <= 0) {
            System.out.println("ingresa un número entero positivo ");
        } else {
            System.out.print("umeros impares desde 1 hasta " +num+", " );
            for (int i = 1; i <= num; i += 2) {
                if (i > 1) {
                    System.out.print(" , ");
                }
                System.out.print(i);
            }
        }
    }
}

