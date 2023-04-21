/*
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
public class ejecutador {
  
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