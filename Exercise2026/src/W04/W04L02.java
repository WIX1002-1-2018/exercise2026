import java.util.Random;
public class W04L02 {
    public static void main(String[] args){
        Random rand = new Random();
        int num = rand.nextInt(6);
        switch(num){
            case 0:
                System.out.println(num + " is zero.");
                break;
            case 1:
                System.out.println(num + " is one.");
                break;
            case 2:
                System.out.println(num + " is two.");
                break;
            case 3:
                System.out.println(num + " is three.");
                break;
            case 4:
                System.out.println(num + " is four.");
                break;
            case 5:
                System.out.println(num + " is five.");
                break;
            default:
                break;
        }  
    }
}
