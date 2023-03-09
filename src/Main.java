import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

import console.ConsoleReader;
import console.ConsoleWriter;
import entity.Operation;
import service.Calculator;
//import service.FileWorking;
import service.JDBCOperationStorage;
import service.SaveInMemory;
import utils.Work;
import validator.Valid;

import javax.xml.validation.Validator;
//import validator.Valid;


public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ConsoleWriter consoleWriter = new ConsoleWriter();
        ConsoleReader consoleReader = new ConsoleReader();
        Scanner scanner = new Scanner(System.in);
        Work work = new Work();
        SaveInMemory saveInMemory = new SaveInMemory();
        //FileWorking fl = new FileWorking();
        JDBCOperationStorage jdbcOperationStorage = new JDBCOperationStorage();

        boolean t = true;
        double num1, num2;
        String type;
        while (t) {

            while (true) {
                consoleWriter.write("Enter number 1");
                String line = consoleReader.readNumber();
                if (Valid.validateDouble(line)) {
                    num1 = Double.valueOf(line);
                    break;
                }
            }

            while (true) {
                consoleWriter.write("Enter number 1");
                String line = consoleReader.readNumber();
                if (Valid.validateDouble(line)) {
                    num2 = Double.valueOf(line);
                    break;
                }
            }

            while (true) {
                consoleWriter.write("Operation type");
                String line = consoleReader.readOperationType();
                if (Valid.validateType(line)) {
                    type = line;
                    break;
                }
            }

            Operation operation = new Operation(num1, num2, type);
            Operation result = calculator.calculate(operation);
            saveInMemory.save(operation);

            System.out.println(type);
            jdbcOperationStorage.save(new Operation(num1, num2, type, result.getResult()));


            consoleWriter.write("Result: " + result.getResult());


            t = work.working();
        }

        List<Operation> all = jdbcOperationStorage.findAll();
        System.out.println(all);


    }
}





