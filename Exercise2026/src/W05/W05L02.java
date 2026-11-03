package W05;

import java.util.Scanner;
public class W05L02 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        int sum = 0;
        int temp = 0;
        for(int i = 1; i <= num; i++){
            temp += i;
            sum += temp;
        }
        System.out.println("The sum of the series is " + sum);
        scan.close();
    }

}
