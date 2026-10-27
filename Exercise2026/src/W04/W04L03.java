package W04;

import java.util.Scanner;
public class W04L03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sales volume: ");
        int sales = sc.nextInt();
        double commission;
        if(sales<=100)
            commission = sales*0.05;
        else if(sales<=500)
            commission = sales*0.075;
        else if(sales<=1000)
            commission = sales*0.1;
        else
            commission = sales*0.125;
        System.out.printf("Total commission received: %.2f\n",commission);
        sc.close();
    }
}