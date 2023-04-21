/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA2;
import java.util.Scanner;

/*Escriba un programa que lea 20 números. Si el número leído 
es igual a cero se debe salir del bucle y mostrar el mensaje 
"Se capturó el numero cero".  El programa deberá calcular y 
mostrar el resultado de la suma de los números leídos, pero 
si el número es negativo no debe sumarse. Nota: recordar el 
uso de la sentencia break.*/

/**
 *
 * @author Edgardo
 */
public class ejercicio_DoWhile {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
       int num;
       int suma=0;
               
               do {
                   
                   System.out.println("Ingrese un número");
                   
                   num = leer.nextInt();
                   
                   if (num==0) {
                       System.out.println("Se capturó el número 0"); 
        }
                      
                   suma = suma + num;
               
               } while (num != 0);
               
               System.out.println("La suma de los números ingresados es "+suma);
    }
    
}
    

