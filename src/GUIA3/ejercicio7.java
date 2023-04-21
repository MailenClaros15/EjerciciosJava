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
public class ejercicio7  {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        int contadorCorrectas = 0;
        int contadorIncorrectas = 0;
        String cadena;
        do {

            System.out.println("Escribi la cadena de 5 cifras \nQue comience con X y termine en O ");
            cadena = m.nextLine();

            if (cadena.length() == 5) {
                if (((cadena.substring(0, 1)).equalsIgnoreCase("X")) && ((cadena.substring(4, 5)).equalsIgnoreCase("o"))) {
                    ++contadorCorrectas;
                } else {
                    ++contadorIncorrectas;
                }
            } else {
                ++contadorIncorrectas;
            }
        } while (!cadena.equalsIgnoreCase("&&&&&"));

        System.out.println("Se tomaron " + contadorCorrectas + " Correctas y Se Ingresaron " + (--contadorIncorrectas) + " frases incorrectas ");
    }

}

    

