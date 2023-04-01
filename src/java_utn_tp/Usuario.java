package java_utn_tp;

import java.util.Scanner;

public class Usuario {
    // 1.- Crear un método que muestre los datos (nombre, apellido y la edad) de un usuario, ingresado 
    //por teclado. 
    //2.- Diseñe un método que imprima los datos de una persona ingresados por teclado e indicar si es 
    //mayor o menor de edad. 

    String nombre;
    String apellido;
    int edad;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + '}';
    }

    public void evaluarEdad(Usuario usuario) {
        if (usuario.edad > 18) {
            System.out.println( usuario.nombre + " " + usuario.apellido +" es mayor de edad");
           
        } else {
            System.out.println(usuario.nombre + " " + usuario.apellido +" es menor de edad ");
        }
    }

    public void caragarUsuario(Usuario usuario) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        usuario.nombre = leer.next();
        System.out.println("ingrese su apellido ");
        usuario.apellido = leer.next();
        System.out.println("ingrese du edad ");
        usuario.edad = leer.nextInt();

    }

    public static void main(String[] args) {

        Usuario usuario = new Usuario();
        usuario.caragarUsuario(usuario);
        System.out.println(usuario.toString());
        usuario.evaluarEdad(usuario);
 
    }

}
