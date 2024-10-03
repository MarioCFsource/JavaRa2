package ra2;

import java.util.Scanner;

public class ejercicio1MC {
    public static void main(String[] args) {
//Pide dos numero y muestra operaciones

        Scanner scn = new Scanner(System.in);
        Scanner scl =new Scanner(System.in);
        System.out.println("Inserta dos números enteros");

        int num1 = scn.nextInt();
        int num2 = scn.nextInt();

        int suma = num1 +num2;
        int resta = num1-num2;
        int multi = num1*num2;
        int div= num1/num2;



        System.out.println("La suma es: " + suma);
        System.out.println("la resta es" + resta);
        System.out.println("La multiplicacion es: "+ multi);
        System.out.println("La División es:" + div);
    }

}
