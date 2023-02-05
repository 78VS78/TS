import java.util.Scanner;

/**
 * @author Simon Pirko on 11.01.23
 */
public class ConsoleReader {
	private Scanner scanner = new Scanner(System.in);

	public double readNumber() {
		return scanner.nextDouble();
	}

	public String readOperationType() {
		return scanner.next();
	}
}
