package java_utn_tp;

public class ArrayNumeros {

    public static void main(String[] args) {

        //Utilizando solo tipos primitivos, String (solo usar método length), vectores, 
//iteraciones simples y condicionales, genere una clase por ejercicio que posea los 
//siguientes métodos: 
//a. Genere un array de números (1 al 15) 
        int numeros[] = new int[16];
        for (int i = 1; i < numeros.length; i++) {
            numeros[i] = i;
        }

//b. Al punto anterior, el valor del resultado debe incrementarse en 5. 
        int numerosSuma[] = new int[16];

        for (int i = 1; i < numeros.length; i++) {
            numerosSuma[i] = numeros[i] + 5;
        }

//c. Genere un array de 10 números, y a numero en la posición 6, dividir por 3.     
        int dividir[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < dividir.length; i++) {
            if (dividir[i] == 6) {
                int resultado = dividir[i] / 3;
            }
        }

    }

}
