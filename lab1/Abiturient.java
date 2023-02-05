import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Abiturient {
    private int id;
    private String firstName;
    private String secondName;
    private String thirdName;
    private String address;
    private String phone;
    private List<Integer> marks;

    public Abiturient(int id, String firstName, String secondName,
                      String thirdName, String address, String phone,
                      List<Integer> marks) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.thirdName = thirdName;
        this.address = address;
        this.phone = phone;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    public double getAverage() {
        double avg = 0;
        for (Integer mark : this.marks) {
            avg += Double.parseDouble(mark.toString());
        }
        return avg / marks.size();
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", thirdName='" + thirdName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", marks=" + marks.toString() + '\'' +
                ", average=" + getAverage() +
                '}';
    }
}
