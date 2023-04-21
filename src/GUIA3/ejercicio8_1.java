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
public class ejercicio8_1 {
    public static void main(String[] args) {
   
        Scanner o = new Scanner(System.in);
        System.out.print("¿cuántos caracteres de lado y alto tiene el cuadrado?");
        int lado = o.nextInt();
        
        
        
    for (int i = 0; i < lado; i++) {
        for (int j = 0; j< lado; j++) {
            if ((j==0) || (j==(lado-1) || (i==0) || (i==(lado-1)))){
                    System.out.print("*");
        } else {System.out.print(" ");}}
             System.out.println("");
    }
                
                            
                
                }}
