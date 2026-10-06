package W03;

// switch picks a case by value; break stops it running into the next case.
public class W03E14 {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {
            case 1:
                System.out.println("Add a record");
                break;
            case 2:
                System.out.println("View records");
                break;
            case 3:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Please choose 1, 2 or 3");
        }

        // Fall-through: case 1 has no break, so case 2 runs as well.
        int level = 1;
        switch (level) {
            case 1:
                System.out.println("Level 1 unlocked");
            case 2:
                System.out.println("Level 2 unlocked");
        }
    }
}
