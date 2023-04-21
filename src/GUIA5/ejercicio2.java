/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios 
 * y le pida al usuario un número a buscar en el vector. El programa mostrará
 * dónde se encuentra el numero y si se encuentra repetido

 *
 * @author Edgardo
 */
public class ejercicio2 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
   System.out.println("ingrese un número");
   
    int num;
    int num1;
    num = leer.nextInt();
  int[]vector= new int [num];
  
 
  for (int i = 0; i < num; i++) {
        
     vector[i]= (int)(Math.random() * 10);
     System.out.println("[" + vector[i] + "]"); 
}
  System.out.println("ingrese un número");
  num1 = leer.nextInt();
   int cont=0;
        
     
        for (int i = 0; i < num; i++) {
           if (num1==vector[i]){
                cont ++;
                System.out.println("el número está en el vector "+ vector[i]);
           }
           
            if (cont==0){
            System.out.println("el numero no está en el vector ");
            
        } 
           
  
}
  
           System.out.println("la cantidad de veces que se repite es: "+cont);       
}
    }


