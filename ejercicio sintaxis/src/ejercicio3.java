import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digita un numero entero: ");
        int x = scanner.nextInt();
        int num = scanner.nextInt();
        int suma = 0;

        for (int i = 1; i <= x; i++) {
        for (int i = 1; i <= num; i++) {
            suma += i;
        }


        System.out.println("La suma de todos los enteros desde 1 hasta " + x + " es: " + suma);
        System.out.println("La suma de todos los enteros desde 1 hasta " + num + " es: " + suma);
    }
}
