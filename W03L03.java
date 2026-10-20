package W03;

import java.util.Scanner;
import java.util.Random;

// Tutorial 2, question 6: read the diameter, print the circumference of the circle (3 decimal places).
public class W03L03{
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        double avg;
        for (int i=0; i<3; i++){
            int num = r.nextInt(10,51);
            sum += num;
            System.out.print(num + " ");
        }
        avg = sum/3;
        System.out.print(sum + " ");
        System.out.printf("%.2f%n", avg);
    }
}
