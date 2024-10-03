package ra2;

import java.util.Scanner;

public class ejercicio3MC {
    public static void main(String[] args) {
//Crea un programa que pida una frese y diga el numero de caracteres de la misma

        Scanner scl = new Scanner(System.in);

        System.out.println("Inserta la frase");

        String frase2 = scl.nextLine();

        String str = frase2;
        int len = str.length();
        System.out.println("Tu frase tiene " + len + " caracteres");
    }
}
