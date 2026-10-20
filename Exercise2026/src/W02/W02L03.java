/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W02;

import java.util.Random;

/**
 *
 * @author songweiii
 */
public class W02L03 {
    public static void main(String[] args) {
        
    Random random = new Random();
    
    //generate 3 random numbers
    int num1 = random.nextInt(10, 51);
    int num2 = random.nextInt(10, 51);
    int num3 = random.nextInt(10, 51);

    //sum and average
    int total = num1 + num2 + num3;
    double average = total / 3.0;

    //Output
    System.out.println("Number 1: " + num1);
    System.out.println("Number 2: " + num2);
    System.out.println("Number 3: " + num3);
    System.out.println("Sum: " + total);
    System.out.printf("Average: %.2f\n", average);
    
    }
}
