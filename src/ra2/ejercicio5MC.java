package ra2;

import java.util.Scanner;
//Mayor y menor de 3 digitos.
public class ejercicio5MC {
    public static void main(String[] args) {
        int num1,num2,num3,a,b,c,mayor,menor;
        Scanner scl = new Scanner(System.in);

        System.out.println("Inserta 3 numeros");

        num1 = scl.nextInt();
        num2 = scl.nextInt();
        num3 = scl.nextInt();

        a = Math.max(num1, num2);
        b = Math.min(num1, num2);
        c = num3;
        mayor= Math.max(a,c);
        menor = Math.min(b,c);

        System.out.println(mayor + " es el mayor. " + menor + " es el menor" );
    }
}
