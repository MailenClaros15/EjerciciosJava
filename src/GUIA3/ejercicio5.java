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
public class ejercicio5 {
/*Escriba un programa en el cual se
ingrese un valor li´mite positivo, y a 
continuacio´n solicite nu´meros al
usuario hasta que la suma de 
los nu´meros introducidos supere el li´mite inicial.
  */
    public static void main(String[] args) {
    
      
Scanner ni = new Scanner(System.in);
        
 
     System.out.println("Ingrese el numero limite de la suma");
      
int num = ni.nextInt();
    
int suma = 0;
 
     do {
          System.out.println("Ingrese numeros a sumar");

          suma = suma + ni.nextInt();

       
          }while (suma<=num);

      
     //| System.out.print(suma);
 
       
   System.out.println(suma);


// TODO code application logic here
    }
    
}
    
