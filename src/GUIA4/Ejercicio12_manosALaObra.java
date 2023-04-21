/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por 
el usuario, validando que el primer número múltiplo del segundo e imprima
si el primer número es múltiplo del segundo, sino informe que no lo son.

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA4;
import java.util.Scanner;

/**
 *
 * @author Edgardo
 */
public class Ejercicio12_manosALaObra {
    public static void main(String[] args) {
   
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        multiplo(num1,num2);
       
    }


public static void multiplo (int num1, int num2) {
      
int resto;


resto = num1%num2;

if (resto==0)
  System.out.println(num1 + " es múltiplo de " + num2);
else
  System.out.println(num1 + " NO es múltiplo de " + num2);
    

}

}





