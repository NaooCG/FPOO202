import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ingresa un numero de *.  ");
        int base = scanner.nextInt();

        int i = 1;
        while (i <= base) {
            int espacios =(base - i)/2;
            int N = 0;

            while (N <espacios) {
                System.out.print(" ");
                N++;}
            N = 0;
            while (N < i) {
                System.out.print("*");
                N++;}
            System.out.println();
            i +=2;}
    }
}
