package W03;

import java.util.Scanner;

public class W03L02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the price of the car: RM");
        double P = sc.nextDouble();
        
        System.out.print("Enter the douwn payment: RM");
        double D = sc.nextDouble();
                
        System.out.print("Enter the interest rate in %: ");
        double R = sc.nextDouble();
        
        System.out.print("Enter the loan duration in year: ");
        int Y = sc.nextInt();
        
        double M = (P-D) * (1+R*Y/100)/(Y*12);
        
        System.out.printf("The monthly payment is RM%.2f", M);
    }
}
