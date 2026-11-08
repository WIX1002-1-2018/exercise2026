package W06.mine;
import java.util.Scanner;
public class occuranceThe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        
        System.out.print("Enter a sentences: ");
        String input = in.nextLine();
        String [] sentences = input.split(" ");
        for (int i = 0; i < sentences.length; i++){
            if (sentences[i].toLowerCase().equals("the")) count++;
        }
        System.out.println("Received: " + input);
        System.out.println("Number of \"the\" in this sentences: " + count);
    in.close();
    }
}
