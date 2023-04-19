package Carrito;

public class Carrito {
//1. Vamos a seguir trabajando con el ejercicio que iniciamos en la Clase 5. Al programa del 
//carrito, vamos a implementar la herencia entre las clases creadas, use los ejemplos 
//vistos en clases. 
//2. Recordar que los datos se deben pedir por pantalla. 
//3. Por ejemplo Clase Producto > itemCarrito > Descuento. 
    
      public static void precioTotal(Producto[] items) {
          double pagarTotal = 0;
        for (int i = 0; i < items.length; i++) {
            Producto item = items[i];
            pagarTotal=pagarTotal+item.getPrecio();
        }
        System.out.println("TOTAL   "+ "                " + pagarTotal);
    }
    
    public static void main(String[] args) {
        Producto arrProductos[] = new Producto[3];
        ItemCarrito itemcarr = new ItemCarrito();

       arrProductos= itemcarr.cargarLista();
     

        itemcarr.MostrarListap(arrProductos);
        System.out.println(".........................");
        precioTotal(arrProductos);
    }

}
