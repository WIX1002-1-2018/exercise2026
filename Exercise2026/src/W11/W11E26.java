package W11;

// Try it answer for video #53 (try it yourself first): a three-level constructor chain.
// RoomE26 has only a constructor with parameters, so LabRoomE26 must call super(code).
// ComputerLabE26 reaches it through this(...) with a standard 40 seats.
class RoomE26 {
    final String code;

    RoomE26(String code) {
        this.code = code;
        System.out.println("RoomE26 part ready: " + code);
    }
}

class LabRoomE26 extends RoomE26 {
    final int seats;

    LabRoomE26(String code, int seats) {
        super(code);
        this.seats = seats;
        System.out.println("LabRoomE26 part ready: " + seats + " seats");
    }
}

class ComputerLabE26 extends LabRoomE26 {
    ComputerLabE26(String code, int seats) {
        super(code, seats);
        System.out.println("ComputerLabE26 part ready");
    }

    ComputerLabE26(String code) {
        this(code, 40);                             // a standard computer lab
    }
}

public class W11E26 {
    public static void main(String[] args) {
        ComputerLabE26 lab = new ComputerLabE26("MM4");
        System.out.println(lab.code + ": " + lab.seats + " seats");
    }
}
