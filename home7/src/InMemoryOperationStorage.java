package calculator;

/**
 * @author Simon Pirko on 9.01.23
 */
public class InMemoryOperationStorage implements OperationStorage {

    Operation[] operations = new Operation[10];

    public void save(Operation operation) {
        for (int i = 0; i < operations.length; i++) {
            operations[i] = operation;
            if (i == 10) {
                i = 0;
            }
        }
        // home work
    }

    @Override
    public Operation[] findAll() {
        return operations;
    }
}
