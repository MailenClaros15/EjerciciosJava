/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIA5;
import java.util.Scanner;
/**Crea un vector llamado ‘Equipo’ cuya dimensión sea 
 * la cantidad de compañeros de equipo y define su tipo
 * de dato de tal manera que te permita alojar sus nombres
 * más adelante.
 *
 * 
 */
public class Ejercicio13_manosALaObra {
    public static void main(String[] args) {
  Scanner leer = new Scanner (System.in);
  String[]vector= new String [5];
  vector [0]= "Paola";
  vector [1]="Gonza";
  vector [2]="Mailen";       
  vector [3]="Luis"; 
  vector [4]="David";
  for (int i = 0; i < 5; i++) {
        	System.out.println("[" + vector[i] + "]");
}
}
}
