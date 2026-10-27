package w04l;

public class W04L04 {

    public static void main(String[] args) {

        int firstRoll1 = (int) (Math.random() * 6) + 1;
        int secondRoll1 = (int) (Math.random() * 6) + 1;
        int player1 = firstRoll1 + secondRoll1;

        System.out.println("Player 1 rolled a " + firstRoll1 + " and " + secondRoll1);
        System.out.println("Player 1 score is " + player1);

        int firstRoll2 = (int) (Math.random() * 6) + 1;
        int secondRoll2 = (int) (Math.random() * 6) + 1;
        int player2 = firstRoll2 + secondRoll2;

        System.out.println("Player 2 rolled a " + firstRoll2 + " and " + secondRoll2);
        System.out.println("Player 2 score is " + player2);

        if (player1 > player2) {
            System.out.println("Player 1 is the winner");
        } else if (player2 > player1) {
            System.out.println("Player 2 is the winner");
        } else {
            System.out.println("It is a draw.");
        }
    }
}
