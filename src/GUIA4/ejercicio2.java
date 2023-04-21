/*
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
public class ejercicio2 {
    public static void main(String[] args) {
   
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        String respuesta;
        do{
            System.out.println("ingresar nombre");
            String nombre=leer.next();
            System.out.println("ingresar edad");
            int edad=leer.nextInt();
            mayor(nombre,edad);
            System.out.println("desea seguir cargando?");
            respuesta=leer.next();
           }while(!respuesta.equals("no"));    
         
    }
    
    public static void mayor(String nombre,int edad){
        if (edad>=18){
            System.out.println(nombre+" de "+edad+" año de edad es mayor de edad");
        }else{
            System.out.println(nombre+" de "+edad+" años de edad es menor de edad");
        }
        
    }
            
                      }

