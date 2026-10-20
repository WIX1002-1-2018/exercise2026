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
        int no = num;
        int sum = 0;

        while(no > 0){
            sum += no % 10;
            no /= 10;
        }

        System.out.printf("The random number is %d and sum of all the digits in the number is %d.", num, sum);

    }
}