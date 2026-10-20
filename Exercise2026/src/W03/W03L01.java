package W03;

import java.util.Scanner;

public class W03L01 {
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter temperature in fahrenheit : ");
		double fahrenheit = keyboard.nextDouble();
		
		double celsius = (fahrenheit - 32) /1.8;
		
		System.out.printf("Temperature in Celsius : %.2f deg C\n", celsius);
		
		keyboard.close();
	}
}
