package W04;

import java.util.Random;

public class W04L02 {

    public static void main(String[] args){

        Random r = new Random();

        int random = r.nextInt(0, 6);

        System.out.print(random + " is ");

        switch(random){
            case 0 -> System.out.print("zero");
            case 1 -> System.out.print("one");
            case 2 -> System.out.print("two");
            case 3 -> System.out.print("three");
            case 4 -> System.out.print("four");
            case 5 -> System.out.print("five");
        }

    }

}
