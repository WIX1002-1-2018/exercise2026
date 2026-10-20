/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package W03;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class W03L04 {
    public static void main(String[] args) {
        // Initialize the scanner object to read user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();
        
        // Calculate hours, minutes, and remaining seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;
        
        // Display the formatted result
        System.out.printf("%d seconds is %d hours, %d minutes and %d seconds\n", 
        totalSeconds, hours, minutes, seconds);
        
        scanner.close();
    }
}
