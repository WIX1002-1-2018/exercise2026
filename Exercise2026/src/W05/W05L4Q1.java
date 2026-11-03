/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

/**
 *
 * @author user
 */
import java.util.Scanner;

public class W05L4Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int num = in.nextInt();
        
        System.out.print("The factors are: ");
        int i = 1; // Counter initialization
        
        while (i <= num) {
            if (num % i == 0) {
                if (i == num) {
                    System.out.print(i);
                } else {
                    System.out.print(i + ", ");
                }
            }
            i++; // Increment counter
        }
        System.out.println();
    }
}