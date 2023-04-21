/*Crear un programa que pida una frase y si esa frase es igual a “eureka”
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
Nota: investigar la función equals() en Java.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3;
import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args){
        Scanner Leer= new Scanner (System.in);
         String palabra;
        System.out.println("ingrese una palabra");
        palabra=Leer.next();
        if(palabra.equals("eureka")){
             System.out.println("Correcto");
             
}else {
         System.out.println("Incorrecto");   
        }
}
}
