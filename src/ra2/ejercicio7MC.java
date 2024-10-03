package ra2;

import java.util.Scanner;

public class ejercicio7MC {
    public static void main(String[] args) {
        //Un programa que pida grados celcius y transforme a farenheit
        double temp1;
        String temp2;
        //String fahrenheit;
        Scanner sc = new Scanner(System.in);
        System.out.println("Una temperatura en Celsius: ");
        temp1 = sc.nextDouble();
        temp2 = ((temp1 * 9/5 + 32) + " Fahrenheit");
        System.out.println(temp2);

    }
}
