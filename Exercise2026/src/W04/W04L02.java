package W04;

import java.util.Random;
public class W04L02 {
    public static void main(String[] args) {
        Random rd = new Random();
        int max = 6;
        int num = rd.nextInt(max);
        if(num==0)
            System.out.println("0 is zero.");
        else if(num==1)
            System.out.println("1 is one.");
        else if(num==2)
            System.out.println("2 is two.");
        else if(num==3)
            System.out.println("3 is three.");
        else if(num==4)
            System.out.println("4 is four.");
        else
            System.out.println("5 is five.");
    }
}