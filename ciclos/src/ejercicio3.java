public class ejercicio3 {
    public static void main(String[] args) {
        System.out.println("tabla de multiplicar del 1 al 10");

        for (int i = 1; i <= 10; i++) {
            System.out.println("tabla de " + i + ":");
            for (int t = 1; t <= 10; t++) {
                System.out.println(i + "X" + t + "=" + (i*t));
            }
            System.out.println();
        }
    }
}
