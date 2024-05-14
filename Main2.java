/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.Scanner;

/**
 *
 * @author matte
 */
public class Matematica
{
     public static void main(String[] args) 
    {
        Scanner tastiera = new Scanner(System.in);
        double d;
        System.out.printf("Inserisci il valore del lato del quadrato e io ti troverò quanto vale la diagonale del quadrato: ");
        double a = tastiera.nextDouble();
        d = Metodi2.diagonaleQ(a);
        System.out.printf("La diagonale è lunga: %f", d);

        System.out.printf("Ora inserisci un numero intero e io ti darò il fattoriale: ");
        int b = tastiera.nextInt();
        int f = Metodi2.fattoriale(b);
        System.out.printf("Ecco il risultato: %d", f);
    }
}
