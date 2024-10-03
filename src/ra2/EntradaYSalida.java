package ra2;


import java.util.Scanner;

public class EntradaYSalida {
    public static void main(String[] args) {
        String frase = "hola";
        //System.out.println("frase");
        //System.err.println("adiós");

        Scanner scn = new Scanner(System.in);
        Scanner scl =new Scanner(System.in);
        System.out.println("Inserta un número");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        double num3 = scn.nextDouble();

        String frase2 = scl.nextLine();


                System.out.println("Tu numero es: " + num1);
                System.out.println(num2);
    }
}
