/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**Utilizando un Bucle for, aloja en el vector Equipo,
 * los nombres de tus compañeros de equipo

 *
 * @author Edgardo
 */
public class ejercicio14_manosALaObra {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
  String[]vector= new String [5];
  for (int i = 0; i < 5; i++) {
      String nombre;
       System.out.println("ingrese un nombre");
            nombre = leer.next();
            vector[i]=nombre;
            
    
       
            
            
  }
  //lo ubico acá?
   for (int i = 0; i < 5; i++) {
        	System.out.println("[" + vector[i] + "]");
    	}// que lo muestre por pantalla
}
}