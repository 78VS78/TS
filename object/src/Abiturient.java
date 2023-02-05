import java.util.Arrays;
import java.util.List;

public class Abiturient{
 private int id;
 public String fio;
 public String name;
 public String patronomic;
 public String adress;
 public String phone;
 public List <Integer> marks;

    public Abiturient(int id, String fio, String name, String patronomic, String adress, String phone, List<Integer> marks) {
        this.id = id;
        this.fio = fio;
        this.name = name;
        this.patronomic = patronomic;
        this.adress = adress;
        this.phone = phone;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Abiturient{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", name='" + name + '\'' +
                ", patronomic='" + patronomic + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                ", uspeh=" + marks.toString() +
                '}';
    }
}

