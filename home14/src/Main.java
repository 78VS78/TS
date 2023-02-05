import java.util.ArrayList;
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
//        FileWorking fl = new FileWorking();

        boolean t = true;
        while (t) {
            consoleWriter.write("Enter number 1");
            double num1 = consoleReader.readNumber();
            consoleWriter.write("Enter number 2");
            double num2 = consoleReader.readNumber();
            consoleWriter.write("Operation type");
            String type = consoleReader.readOperationType();
            Operation operation = new Operation(num1, num2, type);

            //Operation result = calculator.calculate(operation);
//лямда
            Calc calc = (Operation) ->
            {
                switch (operation.getType()) {
                    case "sum":
                        return operation.setResult(operation.getNum1() + operation.getNum2());
                    case "sub":
                        double result2 = operation.getNum1() - operation.getNum2();
                        operation.setResult(result2);
                        return operation;
                    case "mul":
                        double result3 = operation.getNum1() * operation.getNum2();
                        operation.setResult(result3);
                        return operation;
                    case "div":
                        double result4 = operation.getNum1() / operation.getNum2();
                        operation.setResult(result4);
                        return operation;
                }
                return operation;

            };
//спросить у препода???
            Operation result = calc.calculate1(operation);
//массивы заменил на листы
            saveInMemory.save(operation);
            // fl.fileWriter("calc.txt", operation.toString());
            consoleWriter.write("Result: " + result.getResult());
            t = work.working();
        }
        System.out.println();
        System.out.println(saveInMemory.outRes());


        //fl.fileReader("calc.txt");
        //fl.fileInfo("calc.txt");

    }
}

