
import java.util.Random;

public class main{
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(Integer.MAX_VALUE); 
        int i=0;
        int num = n;
        while (n>0){
          n/=10;
          i++;
        }
        System.out.println(num + "\n" + i + " digits.");

    }
}