import java.util.Scanner;
public class tutoq4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = in.nextLine();
        int length = input.length();
        System.out.print("The string in reversed order is ");
        for(int i = 1; i <= length; i++){
            System.out.print(input.charAt(length - i));
        }
        in.close();
    }
}
