import java.util.ArrayList;

public class SaveInMemory {
    private ArrayList<Operation> res = new ArrayList<>();
    private int i;
    public void save(Operation operation) {
        res.add(operation);

    }

    public ArrayList<Operation> outRes() {
        return res;
    }
}





