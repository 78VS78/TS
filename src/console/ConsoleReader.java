package console;
import java.util.Scanner;
public class ConsoleReader {
	private Scanner scanner = new Scanner(System.in);

	public String readNumber()
	{ return scanner.next();}

	public String readOperationType() {
		return scanner.next();
	}
}
