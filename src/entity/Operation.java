package entity;
public class Operation {
    private double num1;
    private double num2;
    private double result;
    private String type;
    private int id;
    public Operation(double num1, double num2, String type) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
    }
    public Operation(double num1, double num2, String type, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.result=result;
    }

    public Operation(int id, double num1, double num2, String type, double result) {
        this.id = id;
        this.num1 = num1;
        this.num2 = num2;
        this.type = type;
        this.result = result;
    }


    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public String getType() {
        return type;
    }

    public double getResult() {
        return result;
    }

    public double setResult(double result) {
        this.result = result;
        return result;
    }

    public String toString() {
        return num1 + "," + num2 + "," +result + ","+type;
    }
}
