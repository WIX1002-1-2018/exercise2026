package W05;
public class W05T03 {
    public static void main(String[] args) {
        int prev = 0, current = 1;
        int fibonaciSum = 0;
        for (int i = 1; i <= 10; i++){
            fibonaciSum += prev;
            int next = prev + current;
            prev = current;
            current = next;
        }
        System.out.println("The sum of the first 10 Fibonacci numbers is " + fibonaciSum);
    }
}