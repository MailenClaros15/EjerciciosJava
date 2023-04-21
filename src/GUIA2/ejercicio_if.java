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
public class ejercicio_if {public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in); // ESTO TAMBIEN SI VA A LEER X TECLADO
        
        int num1; //DEFINO COMO ENTEROS LOS NUMEROS Q VA A INGRESAR
        int num2;
        
        System.out.println("Ingrese dos números");
        
        num1 = leer.nextInt(); //LEE LOS NUMEROS INGRESADOS
        num2 = leer.nextInt();
        
        if (num1>25) { //SI NUM1 ES MAYOR A 25, DA EL SIGUIENTE MJE
           System.out.println("El número "+num1+" es mayor a 25"); 
        } else {
                      //SI NO ES MAYOR A 25, EMITE EL SIG MJE
            System.out.println("El número "+num1+" no es mayor a 25");
        }
       
                          //LO MISMO CON NUM2
        if (num2>25) {
           System.out.println("El número "+num2+" es mayor a 25"); 
        } else {
            
            System.out.println("El número "+num2+" no es mayor a 25");
        }
    }
    
}
    

