package Arithmetic;

public class Arithmetic {
    private double value1 = 0;
    private double value2 = 0;

    public Arithmetic(double value1, double value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public double getSum() {
        return value1 + value2;
    }

    public double getDifference() {
        return value1 - value2;
    }

    public double getProisvedenie() {
        return value1 * value2;
    }

    public double getMiddle() {
        return (value1 + value2) / 2;
    }

    public double getMax() {
        if (value1 > value2) {
            return value1;
        }
        else {
            return value2;
        }
    }

    public double getMin() {
        if (value1 < value2) {
            return value1;
        }
        else {
            return value2;
        }
    }
}
