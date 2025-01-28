import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("cuantas horas trabajas por da? ");
        int ht = scn.nextInt();


        double pagoH = 30;
        double pago = ht * pagoH;
        System.out.println("paga que te corresponde es de: $" + pago);
    }
}
