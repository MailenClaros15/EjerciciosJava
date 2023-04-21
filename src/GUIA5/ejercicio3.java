/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**Recorrer un vector de N enteros contabilizando cuántos números
 * son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 *
 * 
 */
public class ejercicio3 {
   public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
   int[] vector = new int[20];
        for (int i = 0; i < 20; i++) {
            vector[i] = (int) (Math.random() * 99999);
            System.out.println("Vector: " +vector[i]+ " ");
        }
        int con1 = 0, con2 = 0, con3 = 0, con4 = 0, con5 = 0;
        for (int i = 0; i < 20; i++) {
            if (vector[i] >= 0 && vector[i] < 10) {
                con1++;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                con2++;
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                con3++;
            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                con4++;
            } else if (vector[i] >= 10000 && vector[i] < 100000) {
                con5++;
            }

        }
  

System.out.println("Existen " +con1+ " número de 1 cifras");
        System.out.println("Existen " +con2+ " número de 2 cifras");
        System.out.println("Existen " +con3+ " número de 3 cifras");
        System.out.println("Existen " +con4+ " número de 4 cifras");
        System.out.println("Existen " +con5+ " número de 5 cifras");
    }
}
