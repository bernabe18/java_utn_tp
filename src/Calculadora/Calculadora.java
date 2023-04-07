package Calculadora;

import java.util.Scanner;

public class Calculadora {
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Operaciones operaciones = new Operaciones();
        String respuesta = "si";
        String respuestC;
        double num1 = 0;
        double num2 = 0;

        while (respuesta.equals("si")) {
            System.out.println("Que operacion quiere realizar");
            System.out.println("s para suma");
            System.out.println("r para resta");
            System.out.println("m para multiplicar");
            System.out.println("d para dividir");
            respuestC = leer.next();
            operaciones.hacerOperacion(respuestC, num1, num2);
            System.out.println("Desea realizar otra operacion ? si/no");
            respuesta = leer.next();
        }
      
      }
}
