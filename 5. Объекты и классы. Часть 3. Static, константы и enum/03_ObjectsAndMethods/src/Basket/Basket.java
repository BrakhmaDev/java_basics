package Basket;

public class Basket {

    private static int count = 0;
    private String items = "";
    private int totalPrice = 0;
    private int limit;
    private double totalWeight = 0; // g
    private static int commonCount = 0; // Статическая переменная хранящая общее число товаров во всех корзинах
    private static int commonPrice = 0; // Статическая переменная хранящая общую стоимость всех товаров во всех корзинах
    private static int averageGoodsPrice = 0; // Статическая переменная хранящая среднюю стоимость цены товара
    private static int averageBasketPrice = 0; // Статическа переменная хранящая среднюю стоимость корзины

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 1000000;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items += items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }
    public static void increaseCount(int count) {
        Basket.count += count;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, double weight) {
        add(name, price, 1, weight);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " +
            count + " шт. - " + price + " руб. - " + weight + " грамм.";
        totalPrice += count * price;
        totalWeight += weight * count;
        increaseCommonCount(count);
        increaseCommonPrice(count * price);
    }

    public void clear() {
        items = "";
        totalPrice = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() { return totalWeight; }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println(items);
        }
    }

    public static void increaseCommonCount(int count) { Basket.commonCount += count; } //Метод, который считает общее колиество
    public int getCommonCount() { return Basket.commonCount; }

    public static void increaseCommonPrice(int totalPrice) { Basket.commonPrice += totalPrice; } //Метод, который считает общую стоимость
    public int getCommonPrice() { return Basket.commonPrice; }

    public static int getAverageGoodsPrice() { return Basket.commonPrice / Basket.commonCount; } //Метод, который считает среднюю стоимость всех товаров

    public static int getAverageBasketPrice() { return Basket.commonPrice / Basket.count; } //Метод, который считает среднюю стоимость всех корзин
}
