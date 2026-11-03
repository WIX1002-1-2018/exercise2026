/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t100204rept;

/**
 *
 * @author User
 */
public class Q6 {
    public static void main (String [] args){
        int f1=1, f2=1;
        int counter =1 ;
        while (counter <= 10){
            System.out.println(f1);
            int fn = f1+f2 ;
            f2=f1;
            f1=fn;
            counter++;
        }
    }
}
