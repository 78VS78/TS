import java.util.Scanner;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        ConsoleWriter consoleWriter = new ConsoleWriter();
        ConsoleReader consoleReader = new ConsoleReader();
        Scanner scanner = new Scanner(System.in);
        Work work = new Work();
        SaveInMemory saveInMemory = new SaveInMemory();
        FileWorking fl = new FileWorking();

        boolean t = true;
        while (t) {
            consoleWriter.write("Enter number 1");
            double num1 = consoleReader.readNumber();
            consoleWriter.write("Enter number 2");
            double num2 = consoleReader.readNumber();
            consoleWriter.write("Operation type");

            String type = consoleReader.readOperationType();

            Operation operation = new Operation(num1, num2, type);
            Operation result = calculator.calculate(operation);
            saveInMemory.save(operation);
            fl.FileWriter("calc.txt", operation.toString());
            consoleWriter.write("Result: " + result.getResult());

// Домашнее задание
            t = work.working();
        }
        //   System.out.println();
        //   System.out.println(Arrays.toString(saveInMemory.outRes()));

        fl.FileReader("calc.txt");
        fl.FileInfo("calc.txt");
    }
}


