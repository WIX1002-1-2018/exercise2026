package W05;
import java.util.Random;

public class W05L06 {
    public static void main(String[] args){
        Random ran = new Random();
        int num = ran.nextInt(Integer.MAX_VALUE);
        int temp = num;
        int count = 0;
        do{
            temp /= 10;
            count++;
        }while(temp > 0);
        System.out.println("The number of digits of " + num + " is " + count);
    }

}
