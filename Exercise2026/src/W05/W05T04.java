package W05;
import java.util.Scanner;
public class W05T04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String statement = "";
        System.out.print("Enter a statement: ");
        statement = in.nextLine();
        String reverseStatement = "";
        for (int i = 0; i <statement.length(); i++){
            reverseStatement = statement.charAt(i) + reverseStatement;
        }
        System.out.println("The reverse of the statement is: " + reverseStatement);
        in.close();
    }
}