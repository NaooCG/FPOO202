import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String contra = "contra123";
        Scanner scn = new Scanner(System.in);

        System.out.print("ingresa la contraseña: ");
        String contraU = scn.nextLine();

        if (contra.equalsIgnoreCase(contraU)) {
            System.out.println("la contraseña es correcta.");
        } else {
            System.out.println("la contraseña es incorrecta.");
        }
    }
}
