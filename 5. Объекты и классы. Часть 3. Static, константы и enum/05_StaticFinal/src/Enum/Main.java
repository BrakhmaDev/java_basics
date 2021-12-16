package Enum;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator(10, 4);
        arithmeticCalculator.calculate(Operation.ADD);
        arithmeticCalculator.calculate(Operation.SUBTRACT);
        arithmeticCalculator.calculate(Operation.MULTIPLY);
    }
}
