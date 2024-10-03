package ra2;

import java.util.Scanner;

public class ejercicio8MC {
    public static void main(String[] args) {
        //Un programa que reciba una fecha y lo combierta en una frase
        String fecha,dd,mm,aaaa;
        System.out.print("Ingrese la fecha en el siguiente formato DD/MM/AAAA: ");
        Scanner scl = new Scanner(System.in);
        fecha = scl.nextLine();
        dd = fecha.substring(0,2);
        mm = fecha.substring(3,5);
        aaaa = fecha.substring(6,10);
         String respuesta = ("Hoy es el día "+ dd +" del mes "+ mm + " del año "+aaaa);
        System.out.println(respuesta);

    }
}
