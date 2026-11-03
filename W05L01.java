
package l04;

/*Write a program that accepts an integer from user. Then, display its entire factors in
increasing order */
import java.util.Scanner;
public class W05L01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an Integer: " );
        
        int integer = input.nextInt();
        
        System.out.print("The factors are: ");
        
        for (int i=1;i<=integer;i++){
            if (integer % i == 0 ){
                if (i!=1){
                System.out.print( ", "); //print comma before the number except for 1 and prevent the last dangling comma at last number
            } 
                System.out.print(i);
            }
        } System.out.println();
        input.close();
    }
}
