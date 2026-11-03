package W13;

// Try it answer for video #67 (try it yourself first): a custom checked exception for a full room.
// book() declares it with throws, so main must catch it or declare it; this answer catches it inside the loop.
class RoomFullExceptionE28 extends Exception {
    private static final long serialVersionUID = 1L;

    RoomFullExceptionE28(String message) {
        super(message);
    }
}

public class W13E28 {
    static final int CAPACITY = 40;

    static void book(String room, int people) throws RoomFullExceptionE28 {
        if (people > CAPACITY) {
            throw new RoomFullExceptionE28(room + ": " + people + " people, only " + CAPACITY + " seats");
        }
        System.out.println(room + " booked for " + people);
    }

    public static void main(String[] args) {
        String[] rooms = {"Lab A", "Lab B"};
        int[] groups = {35, 45};
        for (int i = 0; i < rooms.length; i++) {
            try {
                book(rooms[i], groups[i]);
            } catch (RoomFullExceptionE28 e) {
                System.out.println("not booked: " + e.getMessage());
            }
        }
    }
}
