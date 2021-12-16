package Arithmetic;

import Basket.Basket;
import Printer.Printer;

public class Main {
    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic(4.5, 6.3);
        System.out.println("Сумма чисел: " + arithmetic.getSum());
        System.out.println("Разность чисел: " + arithmetic.getDifference());
        System.out.println("Произведение чисел: " + arithmetic.getProisvedenie());
        System.out.println("Среднее арифметическое чисел: " + arithmetic.getMiddle());
        System.out.println("Максимальное число: " + arithmetic.getMax());
        System.out.println("Минимальное число: " + arithmetic.getMin());
    }
}
