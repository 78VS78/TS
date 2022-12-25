import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double num1, num2;



		System.out.println("Добро пожаловать в жалкое подобие калькулятора!");
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("Введите первое значение");

			if (scanner.hasNextDouble()) {
				 num1 = scanner.nextDouble();
			} else {
				System.out.println("не число");
				return;
			}
			System.out.println("Введите второе значение");
			if (scanner.hasNextDouble()) {
				num2 = scanner.nextDouble();
			} else {
				System.out.println("не число");
				return;
			}
			System.out.println("Введите операцию   'sum, sub, div, mul - сложение, вычитание, деление, умножение соответственно");
			String type = scanner.next();

			double result;
			switch (type) {
				case "sum":
				case "SUM":
					result = num1 + num2;
					break;
				case "sub":
				case "SUB":
					result = num1 - num2;
					break;
				case "div":
				case "DIV":
					result = num1 / num2;
					break;
				case "mul":
				case "MUL":
					result = num1 * num2;
					break;
				default:
					System.out.println("Operation not found!");
					continue;
			}
			System.out.println("Result: " + result);
			System.out.println("Хотите продолжить: y - Да, n - Нет");
			String next = scanner.next();
			switch (next) {
				case "n":
					return;
				case "y":
					break;
			}
		}


	}
}
