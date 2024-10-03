package ra2;

import java.text.ParseException;
import java.util.Scanner;

public class ejercicio6MC {
    public static void main(String[] args) {
        //Cuantas temporadas tiene Haikyu!?
        int num1,temporadas;
        String respuesta;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Cuantás temporadas tiene Haikyu? ");
        num1 = sc.nextInt();
        temporadas = 4;
        respuesta = (temporadas==num1)? "Es correcto" : "Es incorrecto";
        System.out.println(respuesta);
    }
}
