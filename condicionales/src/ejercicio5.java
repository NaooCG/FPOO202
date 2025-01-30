import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("ingresa un numero ");
        double num1 = scn.nextDouble();

        System.out.print("ingresa un numero ");
        double num2 = scn.nextDouble();

        System.out.print("ingresa un operador aritmetico (+, -, *, /) ");
        String operador = scn.next();
        double resultadoo;
        switch (operador) {
            case "+":
                resultadoo = num1+num2;
                break;
            case "-":
                resultadoo = num1 - num2;
                break;
            case "*":
                resultadoo = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    resultadoo = num1 /num2;
                } else {
                    System.out.println("no se puede divir en cero.");
                    return;
                }
                break;
            default:
                System.out.println("el operador no es valido.");
                return;
        }
        System.out.println("el resultao es: " +resultadoo);
    }
}