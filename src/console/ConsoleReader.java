package console;
import java.util.Scanner;
public class ConsoleReader {
	private Scanner scanner = new Scanner(System.in);

	public double readNumber()
	{
		return scanner.nextDouble();
	}

	public String readOperationType() {
		return scanner.next();
	}
}
