package Enum;

public class ArithmeticCalculator {
    private int value1 = 0;
    private int value2 = 0;

    public ArithmeticCalculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void calculate(Operation operation) {
        if(operation == Operation.ADD) {
            System.out.println("Сумма 2 чисел = " + (value1 + value2));
        }
        else if(operation == Operation.SUBTRACT) {
            System.out.println("Разность 2 чисел = " + (value1 - value2));
        }
        else if(operation == Operation.MULTIPLY) {
            System.out.println("Произведение 2 чисел = " + (value1 * value2));
        }
    }
}
