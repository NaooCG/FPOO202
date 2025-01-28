import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int PP=112;
        int PM=75;

        System.out.print("ingresa el numero de payasos: ");
        int numP = scn.nextInt();

        System.out.print("ingresa el numero de muñecas: ");
        int numM = scn.nextInt();

        int pesoTotal = (numP * PP) + (numM * PM);

        System.out.println("el peso total es de: " + pesoTotal + " gramos");

    }
}
