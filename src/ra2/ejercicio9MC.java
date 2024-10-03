package ra2;

import java.util.Scanner;

public class ejercicio9MC {
    public static void main(String[] args) {
        //Juego de azar del 0 al 5 pidiendo numero al usuario.
        int num1;
        int aleatorio;
        String respuesta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 0 al 5: ");
        num1 = sc.nextInt();
        aleatorio = (int) Math.random() * 6;
        System.out.println("El número al azar es: " +aleatorio);

        respuesta = (num1==aleatorio)? "Eres ganador" : " Eres perdedor";
        System.out.println(respuesta);
    }
}
