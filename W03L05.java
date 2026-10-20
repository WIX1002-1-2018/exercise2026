package W03;

import java.util.Scanner;
import java.util.Random;

// Tutorial 2, question 6: read the diameter, print the circumference of the circle (3 decimal places).
public class W03L05{
    public static void main(String[] args) {
        Random r = new Random();
        int sum = 0;
        double avg;
        int num = r.nextInt(1,10001);
        int i=0;
        System.out.println(num);
        while (num > 0){
            num /= 10;
            i++;
        }
        System.out.println(i);
    }
}
