/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

import java.util.Random;

/**
 *
 * @author faiz
 */
public class W03L05 {
    public static void main(String[] args) {
        Random random = new Random();
        
        int randomNumber = random.nextInt(10001);
        
        int digit1 = randomNumber % 10;
        int digit2 = (randomNumber / 10) % 10;
        int digit3 = (randomNumber / 100) % 10;
        int digit4 = (randomNumber / 1000) % 10;
        int digit5 = (randomNumber / 10000) % 10;
        
        int digitSum = digit1 + digit2 + digit3 + digit4 + digit5;
        
        System.out.println("Generated Number: " + randomNumber);
        System.out.println("Sum of the Digits: " + digitSum);
    }
}
