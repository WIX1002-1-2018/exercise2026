package W06;

import java.util.Random;


public class W06L02 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] numbers = new int[10];

        for (int i = 0; i < 10; i++) {
            int num;
            boolean duplicate;

            do {
                num = rand.nextInt(21);
                duplicate = false;

                for (int j = 0; j < i; j++) {
                    if (numbers[j] == num) {
                        duplicate = true;
                        break;
                    }
                }
            } while (duplicate);

            numbers[i] = num;
            System.out.print(numbers[i] + " ");
        }
    }
}