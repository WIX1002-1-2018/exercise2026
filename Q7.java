/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.t100204rept;

/**
 *
 * @author User
 */
public class Q7 {
    public static void main (String [] args){
    String s = "Hello";//random word
    int i  = s.length()-1;// index starts from 0
    while (i>=0){//when letter goes on
        System.out.print(s.charAt(i));//display the letter at i
        i--;
    
    }
    System.out.println("  ");//next line
}
}
