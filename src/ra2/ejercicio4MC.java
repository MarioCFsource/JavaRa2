package ra2;

import java.util.Scanner;

public class ejercicio4MC {
    public static void main(String[] args) {
        //un programa que pida un numero y diga si es par o impar
        int num1;
        Scanner scl = new Scanner(System.in);

        System.out.println("Inserta un número");

        num1 = scl.nextInt();
        String texto =(num1%2==0)? " Es par" : " Es impar";
        System.out.println(num1 + texto);


    }
}
