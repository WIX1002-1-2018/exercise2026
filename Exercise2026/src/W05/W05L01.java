package W05;

import java.util.Scanner;

public class W05L01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer");
        int i = input.nextInt();
        System.out.print("The divisors are: ");
        for (double divisor = 1; divisor <= i; divisor++){
            if (i % divisor == 0){
                System.out.print((int) divisor + ", ");
            }
        }
    } 
}
