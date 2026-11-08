package W06.mine;
import java.util.Scanner;
import java.util.Arrays;
public class reverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String temp;
        String [] sentences = {"This","is", "an","example"};
        for (int i= 0; i < sentences.length/2; i++){
            temp = sentences[sentences.length-1-i];
            sentences[sentences.length-1-i] = sentences[i];
            sentences[i] = temp;
            
        }
        for (int i= 0; i <= sentences.length-1; i++){
            String reverse = "";
            for (int j = sentences[i].length()-1; j >= 0 ; j--){
                reverse += sentences[i].charAt(j);
            }
            sentences[i] =  reverse;
        }
        System.out.println(Arrays.toString(sentences));
    }
}
