package W05;

/**
 *
 * @author huiling
 */
import java.util.Scanner;

public class W05L02{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0, part = 0;
        
        for (int i = 1; i <= n; i++){
            part = part + i;
            sum = sum + part;
        }
        
        System.out.println("The sum is " + sum);
        sc.close();
    }
}
