public class Main {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    int lAlph = text.indexOf('л');
    int firstHyphen = text.indexOf('-');
    int mAlph = text.lastIndexOf('М');
    int value1 = Integer.parseInt(text.substring(lAlph + 2, 19));
    int value2 = Integer.parseInt(text.substring(firstHyphen + 2, 39));
    int value3 = Integer.parseInt(text.substring(mAlph + 7, 61));
    System.out.println(value1 + value2 + value3);
    //TODO: напишите ваш код, результат вывести в консоль
  }

}