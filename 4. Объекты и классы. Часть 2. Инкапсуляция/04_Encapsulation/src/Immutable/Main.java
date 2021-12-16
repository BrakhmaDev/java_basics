package Immutable;

public class Main {
    public static void main(String[] args) {
        Book bookJoNesbo = new Book("The RedBreast", "Jo Nesbo", 453, 978073342);
        System.out.println("Название: " + bookJoNesbo.getBookName());
        System.out.println("Автор: " + bookJoNesbo.getBookAuthor());
        System.out.println("Количество страниц: " + bookJoNesbo.getBookPage());
        System.out.println("ISBN: " + bookJoNesbo.getBookISBN());
    }
}
