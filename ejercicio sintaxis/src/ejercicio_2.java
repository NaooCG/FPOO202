import java.util.Scanner;

public class ejercicio_2 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Introduce tu nombre completo:");
        String nombreCompleto = scn.nextLine();

        String minusculas = nombreCompleto.toLowerCase();
        System.out.println("nnombre en minusculas: " + minusculas);

        String mayusculas = nombreCompleto.toUpperCase();
        System.out.println("nombre en mayusculas: " + mayusculas);

        String[] palabras = nombreCompleto.split(" ");
        String capitalizado = "";
        for (String palabra : palabras) {
            capitalizado += palabra.substring(0, 1).toUpperCase() + palabra.substring(1).toLowerCase() + " ";
        }
        System.out.println("nombre capitalizado: " + capitalizado.trim());
    }
}

