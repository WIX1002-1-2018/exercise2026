/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W05;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class W05L02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        int sum = 0;
        
        for(int i=1;i<=num;i++){
            for (int j = 1 ; j <= i ; j++){
                sum += j ;
            }
        }
        
        System.out.print(sum);
        
        
    }
}
