/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**
 *Realizar un algoritmo que llene un vector con los 100 primeros números enteros
 * y los muestre por pantalla en orden descendente.
 * @author Edgardo
 */
public class ejercicio1 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
  int[]vector= new int [100];
   for (int i=0 ; i <100; i++) {
       
       //no se puede poner el segundo igual
       //tendremos que leerlo alrevez.Voy a ver el ejemplo
       
       vector[i]=i+1;
      // System.out.println("[" + vector[100-i] + "]");
       
      
       
   }
   
  for (int i=1 ; i <101; i++) {
       System.out.println("[" + vector[100-i] + "]"); 
}//QUEE POR Q 3
}
}

