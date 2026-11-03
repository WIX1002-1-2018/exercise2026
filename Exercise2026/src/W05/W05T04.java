package W05;

public class T04 {
    public static void main(String[] args) {
        String sentence = "Hello World";
        for (int i = sentence.length() - 1; i >= 0; i--) {
            System.out.print(sentence.charAt(i));
        }
        System.out.println();
    }
}
