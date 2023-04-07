package Calculadora;

import java.util.Scanner;


public class Operaciones {
    Scanner leer =new Scanner(System.in);
    public void Suma(double num1, double num2) {
        double resultado = num1 + num2;
        System.out.println("resultado :" + resultado);
    }

    public void Resta(double num1, double num2) {
        double resultado = num1 - num2;
        System.out.println("resultado :" + resultado);
    }

    public void Multiplicacion(double num1, double num2) {
        double resultado = num1 * num2;
        System.out.println("resultado :" + resultado);
    }

    public void Division(double num1, double num2) {
        double resultado = num1 / num2;
        if (num1 == 0 || num2 == 0) {
            System.out.println("no se puede realizar la operacion");
        } else {
            System.out.println("resultado :" + resultado);
        }

    }

    public void hacerOperacion(String opcion, double num1, double num2) {
        if (opcion.equals("s") || opcion.equals("r") || opcion.equals("m") || opcion.equals("d")) {
            switch (opcion) {
                case "s":
                    System.out.println("ingrese el primer numer");
                    num1 = leer.nextDouble();
                    System.out.println("ingrese el segundo numer");
                    num2 = leer.nextDouble();
                    Suma(num1, num2);
                    break;
                case "r":
                    System.out.println("ingrese el primer numer");
                    num1 = leer.nextDouble();
                    System.out.println("ingrese el segundo numer");
                    num2 = leer.nextDouble();
                    Resta(num1, num2);
                    break;
                case "m":
                     System.out.println("ingrese el primer numer");
                    num1 = leer.nextDouble();
                    System.out.println("ingrese el segundo numer");
                    num2 = leer.nextDouble();
                    Multiplicacion(num1, num2);
                    break;
                case "d":
                     System.out.println("ingrese el primer numer");
                    num1 = leer.nextDouble();
                    System.out.println("ingrese el segundo numer");
                    num2 = leer.nextDouble();
                    Division(num1, num2);
                    break;
            }

        } else {
            System.out.println("Opcion invalida");
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
