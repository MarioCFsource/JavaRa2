package ra2;

import java.util.Scanner;

public class ejercicio11MC {
    public static void main(String[] args) {
        // Eleguir la operacion deseada

        Scanner scn = new Scanner(System.in);
        Scanner scl = new Scanner(System.in);
        System.out.println("Inserta dos números enteros");
        int num1 = scn.nextInt();
        int num2 = scl.nextInt();

        Scanner scl2 = new Scanner(System.in);
        System.out.print("¿Qué desea hacer?,sumar,restar,multiplicar o dividir?: ");

        String hacer = scl2.nextLine();
        int suma = num1 +num2;
        int resta = num1-num2;
        int multi = num1*num2;
        int div= num1/num2;
if (hacer.equals("sumar")) {
    System.out.println("El resultado es: " + suma);
}
else if (hacer.equals("restar")) {
    System.out.println("El resultado es: " + resta);
        }
else if (hacer.equals("multiplicar")) {
    System.out.println("El resultado es: " + multi);
}
else if (hacer.equals("dividir")) {
    System.out.println("El resultado es: " + div);
}



       /* System.out.println("La suma es: " + suma);
        System.out.println("la resta es" + resta);
        System.out.println("La multiplicacion es: "+ multi);
        System.out.println("La División es:" + div);*/
    }
    }

