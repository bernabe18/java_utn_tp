package Carrito;

import java.util.Scanner;

public class ItemCarrito  {

    Producto itemCarrito[] = new Producto[3];
    
    public ItemCarrito() {
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
            Producto producto=new Producto();
            System.out.println("ingrese el nombre del producto ");
            producto.setNombreProducto(leer.next());
            System.out.println("ingrese la cantidad del producto ");
            producto.setCantidad(leer.nextInt());
            System.out.println("ingrese el precio");
            producto.setPrecio(leer.nextDouble());
            arrProductos[i] =producto;
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
