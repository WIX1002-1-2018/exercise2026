/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W02;

/**
 *
 * @author songweiii
 */
import java.util.Scanner;

public class W02L04{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();
        
        int hours = totalSeconds / 3600;
        int mins = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds", totalSeconds, hours, mins, seconds);
    }
}
