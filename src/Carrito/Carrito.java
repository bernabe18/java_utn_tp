package Carrito;

public class Carrito {
//1. Implemente usted mismo para un “carrito de compras”: una clase Producto (que pueda 
//tener hasta 3 items), otra ItemCarrito, otra Carrito y otra Descuento. 

//2. En un programa main, pida ingresar los datos y arme los objetos correspondientes y con el 
//método de carrito “precio”, retorne el resultado.
//Por ejemplo:
//cant  precioUnitario  producto 
//1             40           jabón en polvo 
//3             10            esponjas 
//2             100         chocolates 
//carrito.precio() == 270 
//3. Suba el proyecto / ejercicios a Github
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
