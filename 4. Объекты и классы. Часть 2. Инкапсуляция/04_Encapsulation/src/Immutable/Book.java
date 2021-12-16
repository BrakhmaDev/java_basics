package Immutable;

public class Book {
    private final String bookName;
    private final String bookAuthor;
    private final int bookPage;
    private final int bookISBN;

    public Book(String bookName, String bookAuthor, int bookPage, int bookISBN) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookPage = bookPage;
        this.bookISBN = bookISBN;
    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public int getBookPage() {
        return bookPage;
    }

    public int getBookISBN() {
        return bookISBN;
    }
}
