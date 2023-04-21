/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 
 * donde la suma de sus filas, sus columnas y sus diagonales son idénticas.
 * Crear un programa que permita introducir un cuadrado por teclado y determine 
 * si este cuadrado es mágico o no. El programa deberá comprobar que los números
 * introducidos son correctos, es decir, están entre el 1 y el 9.

 *
 * @author Edgardo
 */
public class ejercicio6 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
  //int [][]matriz= {{2,7,6},{9,5,1},{4,3,8}};
  int[][]matriz=new int [3][3];
  for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             matriz[i][j] = (int) (Math.random() * 10);
            }
  }
 boolean bandera1=false;
 boolean bandera2=false;
 boolean bandera3=false;
       
  

         int fila1=matriz[0][0]+matriz[0][1]+matriz[0][2];
         int fila2=matriz[1][0]+matriz[1][1]+matriz[1][2];
         int fila3=matriz[2][0]+matriz[2][1]+matriz[2][2];
        
             
   
         int columna1=matriz[0][0]+matriz[1][0]+matriz[2][0];
         int columna2=matriz[0][1]+matriz[1][1]+matriz[2][1];
         int columna3=matriz [0][2]+matriz[1][2]+matriz[2][2];
    

        int diagonal1=matriz[0][0]+matriz[1][1]+matriz[2][2];
      int diagonal2=matriz[0][2]+matriz[1][1]+matriz[2][0];
 if ((fila1 == fila2) && (fila2 == fila3)) {
            bandera1 = true;
        }
        if ((columna1 == columna2) && (columna2 == columna3)) {
            bandera2 = true;
        }
        if (diagonal1 == diagonal2) {
            bandera3 = true;
        }
        if (bandera1 && bandera2 && bandera3) {

            System.out.println("La matriz es mágica");

        } else {
            System.out.println("La matriz no es mágica");
        }
    }
}

    
     

