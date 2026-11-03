/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package L04;

import java.util.Scanner;

public class W05L02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int addNumbers = 0;
        for (int i = 1 ; i <= n ; i++){
            for (int j = 1 ; j <= i ; j++){
                addNumbers += j;
            }
        }
        System.out.println(addNumbers);
        scanner.close();
    }
}
