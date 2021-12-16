package Printer;

public class Printer {
    private String queue = "";
    public String text = "";
    public String name = "";
    private int pages = 0;
    private int pagesCount = 0;
    private int documentsCount = 0;
    private int printedDocumentsCount = 0;
    private int printedPagesCount = 0;

    public void append(String text) {
        append(text, "Неизвестно", 0);
    }

    public void append(String text, String name) {
        append(text, name, 0);
    }

    public void append(String text, String name, int pages) {
        this.text = text;
        this.name = name;
        this.pages = pages;
        pagesCount += pages;
        documentsCount++;
        queue = queue + "\nТекст книги: " + text + "\t Название документа: "
                + name  + "\t Количество страниц: " + pages;
    }

    public void clear() {
        queue = "";
        System.out.println("Очередь на печать очищена");
    }

    public void print() {
        if (queue.isEmpty()) {
            System.out.println("\nДокументов на печать нет");
        }
        else {
            printedDocumentsCount += documentsCount;
            printedPagesCount += pagesCount;
            System.out.println(queue);
            System.out.println("Выведены все добавленные документы. Очередь на печать очищена");
            queue = "";
            pagesCount = 0;
            documentsCount = 0;
        }

    }

    public void getPagesCount() { System.out.printf("Количество нераспечатанных страниц: %d", pagesCount); }

    public void getDocumentsCount() { System.out.printf("\nКоличество нераспечатанных документов: %d", documentsCount);  }

    public void getPrintedDocumentsCount() { System.out.printf("\nКоличество распечатанных документов: %d", printedDocumentsCount);  }

    public void getPrintedPagesCount() { System.out.printf("\nКоличество распечатанных страниц: %d", printedPagesCount);  }
}
