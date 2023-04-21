/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA3;
import java.util.Scanner;
/**
 *
 * 
 */
public class ejercicio6 {
 public static void main(String[] args) {

        Scanner ni = new Scanner(System.in);

        System.out.println("Ingrese Dos numeros positivos ");
        int num = ni.nextInt();
        // lees num1
        int num2 = ni.nextInt();
        //lees num2
        int suma = 0;
        //creas variable 
        String salida = "n";
        //creas variable de salida 
        double division = 0;
        division = num / num2;
        //acá lo especificamos como double en el caso que la division de un nro con coma 
      do {  //creas el menu quesaldra por pantalla
        System.out.print("Menu \n1-Suma\n2-Resta\n3-Multiplicar\n4-Dividir\n5-Salir\n Elija Opción:  ");
        int resp = ni.nextInt();
        //con el int acá lees la respuesta elegida
        
           // me lo podrias escribir me anda medio trabado el audio     
             
        switch (resp) {

            case 1:
                System.out.println(" La suma es: " + (num + num2)); continue;
                //el break se utiliza para saltar de función 
            case 2:
                System.out.println("La resta es: " + (num - num2)); continue ;
            case 3:
                System.out.println("La multiplicacion es: " + (num * num2)); continue ;
            case 4:
                System.out.println("La division es: " + division); continue ;
            case 5:
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                salida = ni.next();
                //en el caso 5 que es el de salida, le damos a elegir entre s/n para confirmar entonces leemos 
                //lo que responde 
                         continue ;
                
                    default:
                System.out.print("La opcion no es correcta "); 
        }
   } while ( (!salida.equalsIgnoreCase("s")));
      
      }
    }
    

