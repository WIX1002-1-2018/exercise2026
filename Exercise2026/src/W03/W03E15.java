package W03;

// Modern switch (Java 14+): case ... -> needs no break.
// A switch expression gives a value; it must cover every case, so it has a default here.
public class W03E15 {
    public static void main(String[] args) {
        int option = 2;
        switch (option) {                       // arrow switch statement: no fall-through
            case 1 -> System.out.println("Add a record");
            case 2 -> System.out.println("View records");
            case 3 -> System.out.println("Exit");
            default -> System.out.println("Please choose 1, 2 or 3");
        }

        char grade = 'B';
        String comment = switch (grade) {       // switch expression: gives a value
            case 'A', 'B' -> "Good";            // several labels in one case
            case 'C', 'D' -> "Pass";
            default -> "Fail";
        };
        System.out.println(grade + ": " + comment);

        String command = "stop";
        switch (command) {                      // switch on a String works since Java 7
            case "start" -> System.out.println("Starting");
            case "stop" -> System.out.println("Stopping");
            default -> System.out.println("Unknown command");
        }
    }
}
