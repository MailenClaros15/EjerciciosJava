/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.

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
public class ejercicio1 {
   public static void main(String[] args) {
   
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        System.out.println("Ingrese dos numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        System.out.println("Menu");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        int opc = leer.nextInt();
        switch (opc) {
            case 1:
                System.out.println("La suma de los numeros ingresados es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("La resta de los numeros ingresados es: " + restar(num1, num2));
                break;
            case 3:
                System.out.println("La multiplicacion de los numeros ingresados es: " + multiplicar(num1, num2));
                break;
            case 4:
                System.out.println("La division de los numeros ingresados es: " + dividir(num1, num2));
                break;
            default:
                break;
        }
    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
        int multi;
        multi = num1 * num2;
        return multi;
    }

    public static double dividir(int num1, int num2) {
        double div;
        div = num1 / num2;
        return div;
    }
}
        
         



 

