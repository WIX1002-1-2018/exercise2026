
package tutorial4;

public class W05T04 {
    public static void main(String[] args) {
        /* Write the statements that display the string in reverse order. (use String.length() to get
the length of the string) */
        String name = "Work";
        int x = name.length();
        
        for (int i = x -1;i>=0;i--){
            System.out.print(name.charAt(i));
        }System.out.println();
    }
}
