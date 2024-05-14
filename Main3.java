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
public class Main3 
{
    public static void main(String[] args) 
    {
        Scanner tastiera = new Scanner(System.in);
        String d;
        System.out.printf("Digita una stringa e io trasformero i caratteri in maiuscolo in minuscolo: ");
        String a;
        a = tastiera.nextLine();
        d = Metodi2.daTat(a);
        System.out.println("Ecco la tua stringa convertita: " + d);
    }
}
