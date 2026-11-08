package W06.mine;
import java.util.Random;
public class binary {
    public static void main(String[] args) {
        Random rand = new Random();
        // int integer = rand.nextInt(256);
        int integer = 240;
        System.out.println(integer);
        int remainder = 0;
        int binary = 0;
        for (int i = 7; i >= 0; i--){
            binary *= 10;
            if (integer >= Math.pow(2,i)){
                integer -= Math.pow(2,i);
                System.out.println(integer);
                binary += 1;
            }else{
                binary += 0;
            }
            
        }
    System.out.println(binary);
}
}