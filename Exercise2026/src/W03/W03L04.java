package W03;

import java.util.Scanner;

/**
 *
 * @author Azzam Aziz
 */
public class W03L04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Please input seconds to convert: ");
        int inputSeconds = scanner.nextInt();
        
        int seconds = inputSeconds % 60;
        int minutes = (inputSeconds % 3600)/ 60;
        int hours = inputSeconds / 3600;
        
        //example: 3613 -> 01:00:13
        
        System.out.printf("%02d:%02d:%02d%n", hours, minutes, seconds);
        scanner.close();
        
    }
}
