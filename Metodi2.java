/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
/**
 *
 * @author matte
 */
public class Metodi2 
{
    public static double diagonaleQ(double l)
    {
        double diagonale;
        diagonale = l*Math.sqrt(2);
        return diagonale;
    }

    public static int fattoriale(int n)
    {
        if (n <= 1)
        {
            return 1;
        }
        else
        {
            return n*fattoriale(n-1); 
        }
    }
    
    public static String daTat(String T)
    {
        String t;
        t = T.toLowerCase();
        return t;
    }
}
