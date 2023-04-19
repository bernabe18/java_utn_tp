package Carrito;

import java.util.Scanner;

public class ItemCarrito extends Producto{

    Producto itemCarrito[] = new Producto[3];

    public ItemCarrito() {
    }

    public ItemCarrito(String nombreProducto, Double precio, int cantidad) {
        super(nombreProducto, precio, cantidad);
    }

    public Producto[] getItemCarrito() {
        return itemCarrito;
    }

    public void setItemCarrito(Producto[] itemCarrito) {
        this.itemCarrito = itemCarrito;
    }
 
    public Producto[] cargarLista() {
        Producto arrProductos[] = new Producto[3];
        
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("ingrese el nombre del producto ");
            this.nombreProducto= leer.next();
            System.out.println("ingrese la cantidad del producto ");
            this.cantidad=leer.nextInt();
            System.out.println("ingrese el precio");
            this.precio=leer.nextDouble();
            
            arrProductos[i] =new ItemCarrito(this.getNombreProducto(),this.getPrecio(),this.getCantidad());
        }

        return arrProductos;
    }

    public void MostrarListap(Producto[] items) {
    System.out.println("producto  " + "cantidad   " + "precioUnitario");

        for (int i = 0; i < items.length; i++) {
            Producto item = items[i];
            System.out.println("  " + items[i].getNombreProducto() + "      " + item.getCantidad()+ "            " + item.getPrecio());
        }
    }

}
