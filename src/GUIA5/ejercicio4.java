/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios
 * y muestre la traspuesta de la matriz. La matriz traspuesta de una matriz A 
 * se denota por B y se obtiene cambiando sus filas por columnas (o viceversa).
 *
 * 
 */
public class ejercicio4 {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
  int[] [] matrix = new int[4][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
             matrix[i][j] = (int) (Math.random() * 20);
                System.out.print(" "+matrix [i][j]);          
            }
            System.out.println("");
        }
        System.out.println("-----------");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
             System.out.print(" "+matrix [i][j]);          
            }
            System.out.println("");
        }
}
}
