import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("conversion temperaturas");
        System.out.println("1. farenheit-centigrados");
        System.out.println("2. centigrados para farenheit");
        System.out.println("3.  Kelvin a centigrados");

        int op = scn.nextInt();

        if (op ==1) {
            System.out.println("ingrese la temperatura en farenheit para centigrados: ");
            double farenheit = scn.nextDouble();
            double centigrados = (farenheit-32) *5/9;
            System.out.println("farenheit " +farenheit+ " es igual a " + centigrados+ " centigrados");
        } else if(op ==2) {
            System.out.println("ingrese temperatura centigrados para farenheit: ");
            double centigrados = scn.nextDouble();
            double fahrenheit = (centigrados *9/5)+32;
            System.out.println("centigrados " +centigrados+ "es igual" +fahrenheit+ "farenheit");
        }
        else if(op ==3) {
            System.out.println("ingrese temperatura centigrados-Kelvin: ");
            double centigrados = scn.nextDouble();
            double kelvin = (centigrados + 273.15);
            System.out.println("centigrados " +kelvin+ "igual a " +centigrados+ " centigrados");
        }
    }
}
