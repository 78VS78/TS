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

         //   fl.fileWriter("calc.txt", operation.toString());

           jdbcOperationStorage.save(new Operation(num1,num2,type, result.getResult()));


            consoleWriter.write("Result: " + result.getResult());


            t = work.working();
        }

           System.out.println();
           System.out.println(Arrays.toString(saveInMemory.outRes()));

        //fl.fileReader("calc.txt");
        //fl.fileInfo("calc.txt");

  //      consoleWriter.write("Введи double");
  //      String type = consoleReader.readOperationType();
        //Valid vl = new Valid();
        //System.out.println(vl.validateDouble(type));


    }
}


