package ra2;

import java.util.Scanner;

public class ejercicio10MC {
    public static void main(String[] args) {
        //Crea un programa que pida un numero y una palabra para repetirla el mismo numero de veces.
        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);
        System.out.println("Escriba un número y una palabra: ");

        int num = scn.nextInt();
        String word = scl.nextLine();

        //String ans = word.repeat(num);
        //System.out.println(ans);



        for (int i=0; i<num; i++) {
            System.out.println(word);
        }



    }
}
