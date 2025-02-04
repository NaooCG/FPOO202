import java.util.Scanner;

public class ejericio2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("ingresa numero par entre 200 y 400: ");
        int num =scn.nextInt();

        if (num>=200 && num<=400 && num %2==0) {
            System.out.println("el numero ingresado fue " +num+ " para llegar a 400 son los siguientes ");
            for (int i=num; i<=400; i +=2) {
                System.out.print(i +", ");
            }
        } else {
            System.out.println(". ");
        }

    }
}
