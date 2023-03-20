package java_utn_tp;


public class ArrayTienda {
     public static void main(String[] args) {
     
     
//d. Genere un array, mostrando n productos de una tienda deportiva con sus respectivos precios. 
        String productos[] = {"zapatillas", "remera ", "mochila", "pelota", "gorra"};
        double precios[] = {25004.33, 33250.15, 12400.56, 15000.70, 10500.25};

        System.out.println("Lista de Productos y sus precios");

        for (int i = 0; i < productos.length; i++) {
            System.out.println("Articulo " + productos[i] + " Precio: $" + precios[i]);
        }

        //e. Genere un array con 3 cursos y luego mostrar el promedio de notas de tres cursos,
        String cursos[] = {"ciber seguridad", "full stack", "desarrollo web"};
        int notas[] = {14, 17, 11};
         System.out.println("------ ----- ");
        System.out.println("Promedio de Cursos");
        System.out.println("CURSO NOTA");
        System.out.println("------ ----- ");
        
        int promedio = (notas[0] + notas[1] + notas[2]) / 3;
        
        for (int i = 0; i < cursos.length; i++) {
            System.out.println(cursos[i] + " " + notas[i]);
        }
        System.out.println("Su Promedio es : " + promedio);

     }
}
