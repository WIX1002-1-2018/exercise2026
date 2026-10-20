package W03;

import java.util.Scanner ;

public class W03L02 {
	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Price of the car : ");
		double P = keyboard.nextDouble();
		
		System.out.println("Down Payment(D) : ");
		double D = keyboard.nextDouble();
		
		System.out.print("Enter interest rate in % (R): ");
    double R = keyboard.nextDouble();

	  System.out.print("Enter loan duration in years (Y): ");
    double Y = keyboard.nextDouble();
    
    double M = (P - D) * (1 + R * Y/100) / (Y * 12) ;

        System.out.printf("Monthly Payment: %.2f\n", M);

        keyboard.close() ;
        
	}
}
