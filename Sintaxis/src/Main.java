//Zona de importaciones
import java.util.Scanner;

// Clase principal
public class Main {

    //Metodo principal
    public static void main(String[] args) {
        System.out.println("Hello, Naomi!");
    /*
        comentarios de muchas lineas
        comentarios de muchas lineas
        comentarios de muchas lineas
     */

//2.cadenas
    String cadena= "naomi" + "carrillo" + "Gonzalez";
    System.out.println(cadena);

        System.out.println(cadena.length()); //cuanta los caracteres

        //extraccion de caracteres en base a 1 o varios parametros
        System.out.println(cadena.substring(2,5));
        System.out.println(cadena.substring(2));
        System.out.println(cadena.substring(0,5));


    // 3. variable pasar al word de aqui hasta al final
        String cadenas="333", cadenas2, cadenas3;
        int entero=3, entero2, entero3;
        double decimal=3.3589, decimal2, decimal3;

    //Convertir cadena a int
        entero2=Integer.parseInt(cadenas);
        System.out.println(entero2);

    //Convertir double a int
        entero3=(int) decimal;
        System.out.println(entero3);

    //Convertir double a cadena
        cadenas2=String.valueOf(decimal);
        System.out.println(cadenas2);

    //Convertir int a double
        decimal2=Double.valueOf(entero);
        System.out.println(decimal2);

    //Conversion implicita solo datos numericos
        int i=12;
        double numd=i;
        System.out.println(numd);

    //4. solicitud de datos
        Scanner scn=new Scanner(System.in);

        System.out.println("Escribe una cadena:");
        String cadenaa=scn.nextLine();

        System.out.println("Escribe un numero entero:");
        int enteroo=scn.nextInt();

        System.out.println("Escribe un numero decimal:");
        double decimaal=scn.nextDouble();

        System.out.println("numero cadena:" + cadenaa);
        System.out.println("numero entero:" + enteroo);
        System.out.println("numero decimal:" + decimaal);

    //5. Boolean, operadores logicos y de comparacion
        System.out.println(10>9);
        System.out.println(10==9);
        System.out.println(10<9);
        System.out.println(10>=9);
        System.out.println(10<=9);
        System.out.println(10>9);

    // operadores logicos
        int x=3;
        System.out.println(x<5 && x>10);
        System.out.println(x<5 || x>10);
        System.out.println(!(x<5 && x>10));
        System.out.println(!(x<5 || x>10));

    }
}