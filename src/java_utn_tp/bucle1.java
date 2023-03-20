
package java_utn_tp;

public class bucle1 {
     public static void main(String[] args) {
   
 // a. Utilizando la sentencia while, realice un ejemplo que muestre los números del 1 al 
//100 utilizando la instrucción while. Y luego, que imprima los mismos por pantalla
    int num1=0;
        while (num1<100) {
          num1++;
            System.out.println(num1);
        }
//        b. A lo anterior, que muestre los números del 1 al 100 utilizando la instrucción for.       
        for (int i=1;i<101;i++) {
            System.out.println(i);
        }
//        
//c. A lo anterior, con la sentencia do while
int num=0;
do {            
    num++;
    System.out.println(num);
    
} while (num<100);
//        
//d. Utilizando la sentencia for, hacer lo mismo que en (b) pero que el valor a imprimir por 
//pantalla, sea el doble.
for (int i = 1; i < 101; i++) {
            System.out.println(i*2);
        }
     
     
     
     }
  

}
