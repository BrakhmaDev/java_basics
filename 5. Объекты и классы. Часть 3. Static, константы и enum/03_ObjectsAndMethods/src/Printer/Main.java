package Printer;

import Arithmetic.Arithmetic;
import Basket.Basket;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("Текст для первого документа");
        printer.append("Текст для второго документа", "Второй документ");
        printer.append("Текст для третьего документа", "Третий документ", 200);
        printer.append("Текст для четвертого документа", "Четвертый документ", 1000);
        printer.getPagesCount();
        printer.getDocumentsCount();
        printer.getPrintedDocumentsCount();
        printer.getPrintedPagesCount();
        printer.print();
        printer.getPagesCount();
        printer.getDocumentsCount();
        printer.getPrintedDocumentsCount();
        printer.getPrintedPagesCount();
    }
}
