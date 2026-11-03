import java.util.Scanner;

public class W05L01 {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.print("Factors of n are: ");
        for (long i=1; i <= n/2; i++){
            if (n%i == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.print(n + ".");
    }
}
