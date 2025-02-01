import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int saldo = 0;

        System.out.println("escriba la bitacora D / R:");
        String entrada = scn.nextLine().trim();

        if (!entrada.isEmpty()) {
            do {
                char tp = entrada.charAt(0);
                int cantidad = Integer.parseInt(entrada.substring(2).trim());

                if (tp == 'D') {
                    saldo += cantidad;
                } else if (tp == 'R') {
                    saldo -= cantidad;
                }
                entrada = scn.nextLine().trim();
            } while (!entrada.isEmpty());
        }
        System.out.println("salgo final = "+saldo);
    }
}
