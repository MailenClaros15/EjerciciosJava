/*Crear un programa que dado un número determine si es par o impar.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3;
import java.util.Scanner;
/**
 *
 * @author Edgardo
 */
public class ejercicio1 {
   public static void main(String[] args) {
    
      
Scanner ni = new Scanner(System.in);
System.out.println("Ingrese un número");
      
int num = ni.nextInt();



if (num/2==0) { //SI NUM1 ES MAYOR A 25, DA EL SIGUIENTE MJE
           System.out.println("El número es par"); 
        } else {
                      //SI NO ES MAYOR A 25, EMITE EL SIG MJE
            System.out.println("El número es impar");
}
   
}
}