package W05;
import java.util.Scanner;
public class W05L01 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        scan.close();
        if(num == 0){
            System.out.println("Enter a non-zero integer.");
            return;
        }
         System.out.print("The factors are: 1");
        for(int i = 2; i <= num; i++){
            if(num%i == 0){
                System.out.printf(", %d",i);
            }
        }
    }
}


