package calculator;

/**
 * @author Simon Pirko on 9.01.23
 */
public class Operation {

	double num1;
	double num2;
	String type;
	double result;

	public Operation(double num1, double num2, String type) {
		this.num1 = num1;
		this.num2 = num2;
		this.type = type;
	}
}