package ra2;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        //un juego que pida un número aleatorio entre el 0 y el 5 y pida un numero al cliente
        //Para ver si acierta
        int aleatorio,usuario;
        String resultado;

        Scanner sc = new Scanner(System.in);
        aleatorio = (int)(Math.random()*6);

        System.out.println("Dime un número entre 0 y 5");
        usuario = sc.nextInt();

        System.out.println("El número aleatorio era:" + aleatorio);
        resultado = (aleatorio==usuario)? "Acertaste :D" : "Fallaste";
        System.out.println(resultado);
    }
}
