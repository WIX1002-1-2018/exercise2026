package W05;
import java.util.Scanner;
public class W05L02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = in.nextInt();
        
        int sum = 0;
        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("The sum of integers is: " + sum);
        in.close();
    }
}
