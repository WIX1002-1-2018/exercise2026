
package l04;
/* . Write a program that accepts an integer n from user and then sum the following
series.
1 + (1+2) + (1+2+3) + … + (1+2+3+…+n)
*/
import java.util.Scanner;
public class W05L02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        
        int x = input.nextInt();
        
        int sum = 0;
        
        for (int i=1; i<=x; i++){
            int term =0;
            
            for (int m=1; m<=i; m++){
                term += m;
                
            }
            sum += term;
        } System.out.println("Sum =  " + sum);
    } 
}
