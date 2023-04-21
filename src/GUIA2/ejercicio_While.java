/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA2;
import java.util.Scanner;
/**
 *
 * @author Edgardo
 */
public class ejercicio_While {public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        
        int nota;
        
        System.out.println("Ingrese una nota");
        
        nota = leer.nextInt();

        
        while (nota<0 || nota>10) {
        
           System.out.println("Nota incorrecta. Ingrese nuevamente");
        
        nota = leer.nextInt();
           
        }
        
    }
    
}
    

