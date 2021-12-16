public class Main {

  public static void main(String[] args) {
    Container container = new Container();
    container.count += 7843;

    int sum = sumDigits(7843);

    System.out.println(sum);
  }

  /* Реализуйте метод sumDigits который возвращает сумму цифр числа, пример:
  передано 12345, метод должен вернуть 15
  если передано null, то должен вернуть -1

  Запустите тесты TestSumDigits для проверки корректности работы метода

  не меняйте название метода, его возвращаемое значение и модификаторы доступа (public).
  В противном случае тестовый метод не сможет проверить ваш код
   */

  public static int sumDigits(Integer number) {
    int sum = 0;
    if (number != null) {
      String numberToString = number.toString();
      int length = numberToString.length();
      for (int i = 0; i < length; i++) {
        char numbChar = numberToString.charAt(i);
        String numbCharToString = Character.toString(numbChar);
        sum += Integer.parseInt(numbCharToString);
        /*Метод для получения напрямую int из char я не нашел, только через String (char-String-int)
        sum += (numbChar - '0');  -- этот способ перевода char в int мне нравится больше
        sum += Integer.parseInt(numbChar + ""); -- или такой*/
      }
    } else {
      return -1;
    }
    return sum;
  }
}
