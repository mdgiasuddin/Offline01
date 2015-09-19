package offline1305069;

/**
 * Created by GIASAHMED on 19-Sep-15.
 */
public class Room {
    private String hallName;
    private int roomNo;
    private boolean status;

    public Room() {
    }

    public Room(String hallName) {
        this.hallName = hallName;
    }

    public Room(String hallName, int roomNO) {
        this.hallName = hallName;
        this.roomNo = this.roomNo;
        this.status = false;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getHallName() {
        return this.hallName;
    }

    public int getRoomNo() {
        return this.roomNo;
    }

    public boolean isStatus() {
        return this.status;
    }

    void print() {
        if(!this.isStatus()) {
            System.out.println("Room no, " + this.getRoomNo() + " of " + this.getHallName() + " is currently available for allotment.");
        } else {
            System.out.println(this.getHallName() + " " + this.getRoomNo() + " " + this.isStatus());
        }

    }
}
