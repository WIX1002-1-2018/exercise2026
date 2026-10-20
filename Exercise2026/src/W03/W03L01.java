package W03;

import java.util.Scanner;

public class W03L01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:  ");
        
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) / 1.8;
                
        System.out.printf("Temperature in degree Celsius: %.2f", celsius);
    }
}
