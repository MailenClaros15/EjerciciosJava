/*Realizar un programa que solo permita introducir solo frases
o palabras de 8 de largo. Si el usuario ingresa una frase
o palabra de 8 de largo se deberá de imprimir un mensaje 
por pantalla que diga “CORRECTO”, en caso contrario, se 
deberá imprimir “INCORRECTO”. Nota: investigar la función 
Lenght() en Java.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3;
import java.util.Scanner;

public class ejercicio3 {
     public static void main(String[] args){
        Scanner Leer= new Scanner (System.in);
        String palabra;
        System.out.println("ingrese una palabra");
        palabra=Leer.next();
     if(palabra.length()==8){
          System.out.println("Correcto su palabra tiene 8 letras ");
          
        }
      else{
             System.out.println("Incorrecto su palabra no tiene 8 letras");
              }
      
}
}
