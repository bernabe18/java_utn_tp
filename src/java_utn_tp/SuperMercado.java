package java_utn_tp;

import java.util.Scanner;
//3.- En un supermercado se hace un 20% de descuento a los clientes cuya compra supere los 1000$ 
//en las áreas de frutas, verduras y gaseosas. ¿ Cual será el total que pagara una persona por su compra ?,
//se debe mostrar el nombre del cliente , producto, precio , cantidad , descuento y total a pagar.

public class SuperMercado {

    String producto;
    Double precio;
    int cantidadProducto;
    Double precioTotal;
    Double descuentoTotal;
    String nombreCliente;
    String area;
    Scanner leer = new Scanner(System.in);

    public SuperMercado() {
    }

    public SuperMercado(String producto, Double precio, Double precioTotal, int cantidadProducto) {
        this.producto = producto;
        this.precio = precio;
        this.precioTotal = precioTotal;
        this.cantidadProducto = cantidadProducto;
    }

    @Override
    public String toString() {
        return "SuperMercado{" + "producto=" + producto + ", precio=" + precio + ", precioFinal=" + precioTotal + ", descuento=" + descuentoTotal + ", cantidadProducto=" + cantidadProducto + '}';
    }

    public void Compra() {

        System.out.println("ingrese nombre del producto ");
        producto = leer.next();
        System.out.println("ingrese precio del producto ");
        precio = leer.nextDouble();
        System.out.println("ingrese cantidad de producto ");
        cantidadProducto = leer.nextInt();

        precioTotal = precio * cantidadProducto;

        if (precioTotal > 1000) {
            descuentoTotal = precioTotal * 0.20;
            precioTotal = precioTotal - descuentoTotal;
            System.out.println("Superaste los $1000 se realizo un descuento de 20%");
            System.out.println("Total a abonar : " + precioTotal);

        } else {
            System.out.println("No accedes al descuento ");
            System.out.println("Total a abonar : " + precioTotal);
        }

    }

    public void EleccionArea() {
        SuperMercado superMercado = new SuperMercado();
        System.out.println("ingrese su nombre ");
        nombreCliente = leer.next();
        System.out.println("Frutas");
        System.out.println("Lacteos");
        System.out.println("Gaseosas");
        area = leer.next();

        switch (area) {
            case "frutas":
                superMercado.Compra();
                break;
            case "lacteos":
                superMercado.Compra();
                break;
            case "gaseosas":
                superMercado.Compra();
                break;
        }
    }

    public static void main(String[] args) {
        SuperMercado superMercado = new SuperMercado();
        superMercado.EleccionArea();
      
    }

}
