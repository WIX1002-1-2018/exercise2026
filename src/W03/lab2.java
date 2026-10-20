package W03;

import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter the temperature(Fahrenheit): ");
        double fahrenheit = temp.nextDouble();
        double celcius = (fahrenheit - 32)/1.8;
        System.out.printf("Celcius in Degree: " + "%.2f%n", celcius);
        
        Scanner car = new Scanner(System.in);
        System.out.print("Enter the price of the car(RM): ");
        double P = car.nextDouble();
        System.out.print("Enter the down payment: ");
        double D = car.nextDouble();
        System.out.print("Enter the interest rate in % : ");
        double R = car.nextDouble();
        System.out.print("Enter the loan duration in year: ");
        int Y = car.nextInt();
        double monthlyPayment = (P-D) * (1 + R*Y/100)/(Y*12);
        System.out.printf("Your monthly payment is: " +"%.2f%n",monthlyPayment);
    }
}
