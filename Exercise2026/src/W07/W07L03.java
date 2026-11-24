/*
Write a Java method that accepts an array of 10 integers. The method should reverse
the integer in the array. Example, if the number is 1234, the number will change to
4321
*/

package W07;

import java.util.Scanner;

public class W07L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] integers = new int[10];

        for (int i = 0; i < integers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            integers[i] = sc.nextInt();
        }

        reverseInt(integers);
        for (int i = 0; i < integers.length; i++) {
            System.out.print(integers[i]);
            System.out.println();
        }
        sc.close();
    }
    static void reverseInt(int[] integers) {
        
        for (int i = 0; i < integers.length; i++) {
            int reversed = 0;
            int n = integers[i];

                for (int j = String.valueOf(n).length() - 1; j >= 0; j--) {
                    int digit = n % 10;
                    reversed += digit * (Math.pow(10, j));
                    n /= 10;
                }
                integers[i] = reversed;

        }
        
    }
    
}
