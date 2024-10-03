package ra2;

import java.util.Scanner;

public class ejercicio2MC {
    public static void main(String[] args) {
//3 notas por pantalla y saque la media
        double num1,num2,num3;
        Scanner scn = new Scanner(System.in);
        System.out.println("Incerta 3 números para ver tu nota media");

        num1 = scn.nextDouble();
        num2 = scn.nextDouble();
        num3 = scn.nextDouble();
        double media = ((num1+num2+num3)/3);

        System.out.println("Tu nota media es: "+ media);
    }
}
