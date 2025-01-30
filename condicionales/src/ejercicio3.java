import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[]arg){
        Scanner scn = new Scanner(System.in);

        System.out.println("ingresa tu edad");
        int edad = scn.nextInt();
        int costo;

        if (edad <4) {
            costo =0;
        } else if (edad >=4 && edad <=18) {
            costo =110;
        } else {
            costo =190;
        }
        System.out.println("el costo de tu entrada es de $"+costo);
    }
}
