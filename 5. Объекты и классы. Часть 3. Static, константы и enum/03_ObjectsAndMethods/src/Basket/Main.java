package Basket;

import Arithmetic.Arithmetic;
import Basket.Basket;
import Printer.Printer;

public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40,1000);
        basket.add("Powder", 83, 1, 1000);
        basket.add("Sugar", 100, 2, 900);
        basket.print("Milk, Powder, Sugar");
        System.out.println(basket.getTotalWeight() + " грамм");
        System.out.println(basket.getTotalPrice() + " рублей");
        System.out.println(Basket.getAverageGoodsPrice()+ " средняя стоимость всех товаров");
        System.out.println(Basket.getAverageBasketPrice() + " средняя стоимость корзины");

        System.out.println("\n=======================================================================\n");

        Basket basket1 = new Basket();
        basket1.add("Egg", 43, 1, 400);
        basket1.add("Oil", 125, 1, 900);
        basket1.add("Spaghetti", 200, 2, 400);
        basket1.print("Egg, Oil, Spaghetti");
        System.out.println(basket1.getTotalWeight()+ " грамм");
        System.out.println(basket1.getTotalPrice() + " рублей");
        System.out.println(Basket.getAverageGoodsPrice()+ " средняя стоимость всех товаров");
        System.out.println(Basket.getAverageBasketPrice() + " средняя стоимость корзины");
    }
}
