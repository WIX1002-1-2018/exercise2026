package W03;

import java.util.Random;

public class W03L03 {
    public static void main(String[] args) {
        Random r = new Random();
        
        int num1 = r.nextInt(10, 51);
        int num2 = r.nextInt(10, 51);
        int num3 = r.nextInt(10, 51);
        
        int sum = num1 + num2 + num3;
        double avg = sum / 3;
        
        System.out.printf("The three number are %d, %d, %d\n", num1, num2, num3);
        System.out.println("The sum of the three numbers is " + sum);
        System.out.printf("The average of the three numbers is %.2f", avg);
    }
}
