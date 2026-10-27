package W04;

import java.util.Scanner;

public class W04L05 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        double a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

        for(int i = 0; i < 6; i++){
            System.out.print("Enter " + (char)('a' + i) + ": ");
            double value = scanner.nextDouble();

            switch(i){
                case 0 -> a = value;
                case 1 -> b = value;
                case 2 -> c = value;
                case 3 -> d = value;
                case 4 -> e = value;
                case 5 -> f = value;
            }
        }

        double deno = a * d - b * c;

        if(deno == 0){
            System.out.println("The equation has no solution");
        }
        else{
            double x = (e * d - b * f) / deno;
            double y = (a * f - e * c) / deno;

            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }

        scanner.close();
    }
}
