import java.util.Scanner;
import java.util.Arrays;

/**
 * @author Simon Pirko on ${DATE}
 */
public class Main {

    //Инкапсуляция(модификаторы доступа, геттеры и сеттеры, конструктор)
    //Наследование(extends)
    //Полиморфизм(override)

    //public
    //protected
    //package-private(default)
    //private

    //java Main 2 5 sum
    public static void main(String[] args) {

//		Human human = new Human();
//		human.sayHello();

//		Human man = new Man();
//		man.sayHello();
//
//		Human woman = new Woman();
//		woman.sayHello();


        Calculator calculator = new Calculator();
        ConsoleWriter consoleWriter = new ConsoleWriter();
        ConsoleReader consoleReader = new ConsoleReader();
        Scanner scanner = new Scanner(System.in);
        Work work = new Work();

        SaveInMemory saveInMemory =new SaveInMemory();


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

            consoleWriter.write("Result: " + result.getResult());
// Домашнее задание
            t = work.working();
        }
        System.out.println();
        System.out.println(Arrays.toString(saveInMemory.outRes()));

    }

}
