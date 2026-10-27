package W04;

import java.util.Scanner;

public class W04L03 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sales volume: ");
        double volume = scanner.nextDouble();

        double commission;

        if(volume <= 100){
            commission = volume * 0.05;
        }
        else if(volume <= 500){
            commission = volume * 0.075;
        }
        else if(volume <= 1000){
            commission = volume * 0.1;
        }
        else{
            commission = volume * 0.125;
        }

        System.out.printf("Commission: %.2f", commission);


        scanner.close();
    }
}
