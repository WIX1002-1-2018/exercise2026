/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package W06;

import java.util.Arrays;
import java.util.Random;

public class W06L02 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];
        int count = 0; 

        while (count < 10) {
            int num = rand.nextInt(21); 
            boolean isDuplicate = false;

            for (int i = 0; i < count; i++) {
                if (numbers[i] == num) {
                    isDuplicate = true; 
                    break;
                }
            }

            if (!isDuplicate) {
                numbers[count] = num;
                count++;
            }
        }

        System.out.println("10 Non-duplicate random integers (0-20):");
        System.out.println(Arrays.toString(numbers));
    }
}