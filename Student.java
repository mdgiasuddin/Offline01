package offline1305069;

/**
 * Created by GIASAHMED on 19-Sep-15.
 */
public class Student {
    private String studentName;
    private String studentNo;
    private Room room;

    public Student()
    {

    }

    public Student(String studentName, String studentNo, Room room) {
        this.studentName = studentName;
        this.studentNo = studentNo;
        this.room = room;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public Room getRoom() {
        return room;
    }

    public void print(){
        System.out.println( "Student No: " + getStudentNo() + ", " + getStudentName() + ", resides on " + room.getHallName() + " Hall, Room no, " + room.getRoomNo());
    }
}
