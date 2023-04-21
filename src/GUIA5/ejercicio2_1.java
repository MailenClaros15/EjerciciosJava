/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**
 *
 * @author Edgardo
 */
public class ejercicio2_1 {
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int[]num=new int[10];
        for(int i=0;i<10;i++){
            num[i]=(int)(Math.random()*10);
        }
        System.out.println("ingrese el numero que desea buscar:");
        int num1=leer.nextInt();
        int cont=0;
        for(int i=0;i<10;i++){
            if(num1==num[i]){
                cont ++;
                System.out.println("el numero se encuentra : " + (i));
            }
               
        }
        if(cont==0){
            System.out.println("el numero no se encontro en el vector");
        }
        if(cont!=0){
            System.out.println("la cantidad de veces que se repite es:"+cont);
        }
    }
 } 

