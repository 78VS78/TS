public class SaveInMemory {
    public Operation[] res = new Operation[10];
    public int i;

    public void save (Operation operation) {
        res[i] = operation;
        i++;
        if (i == 11) {
            i = 0;
        }

    }

    public Operation[] outRes() {
        return res;
    }
}





