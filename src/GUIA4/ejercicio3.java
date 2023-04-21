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
public class ejercicio3 {
     public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
        System.out.println("Cuantos euros desea convertir?");
        int num = leer.nextInt();
        System.out.println(" Elija la opcion");
        System.out.println(" 1.Libras");
        System.out.println(" 2.dolares");
        System.out.println(" 3.yenes");
        int opciones = leer.nextInt();
        
        switch (opciones) {
            case 1: 
                System.out.println("Sus euros son "+libras(num)+" libras");
                break;
            case 2: 
                System.out.println("Sus euros son "+dolares(num)+" dolares");
                break;
            case 3:
                System.out.println("Sus euros son "+yenes(num)+" yenes");
                break;
        }

    }
    public static double libras(int num){
        double libras = (num * 0.86);
        return libras;
        
    }
    public static double dolares(int num){
        double dolares = (num *1.28611 );
        return dolares;
    }
    
    public static double yenes(int num){
        double yenes = (num * 129.852);
        return yenes;
    }
    }
