package W05;

/**
 *
 * @author huiling
 */
import java.util.Scanner;

public class W05L01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an Integer: ");
        int n = sc.nextInt();
        
        System.out.print("The factors are: ");
        for (int i = 1; i <= n; i++){
            if (n % i == 0){
                System.out.print(i + ", ");
            }
        }
        
    }
}
