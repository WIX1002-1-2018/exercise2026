package W05;
import java.util.Random;

public class W05L08 {
    public static void main(String[] args){
        Random rand = new Random();
        int n = rand.nextInt(101);
        int count = 0;
        int num = 2;
        System.out.print("First " + n + " prime numbers: ");
        while(count < n){
            boolean isPrime = true;
            for(int i = 2; i * i <= num; i++){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf(" %d", num);
                count++;
            }
            num++;
        }
    }

}
