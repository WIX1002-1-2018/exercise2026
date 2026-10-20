/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;

/**
 *
 * @author songweiii
 */
import java.util.Random;

public class W03L05{

    public static void main(String[] args){

        Random r = new Random();

        int num = r.nextInt(10001);
        
        int d1 = num % 10;
        int d2 = (num / 10) % 10;
        int d3 = (num / 100) % 10;
        int d4 = (num / 1000) % 10;
        int d5 = (num / 10000) % 10;

        int sum = d1 + d2 + d3 + d4 + d5;


        System.out.printf("The random number is %d and sum of all the digits in the number is %d.", num, sum);

    }
}