import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      int firstSpace = input.indexOf(" ");
      int lastSpace = input.lastIndexOf(" ");
      if (containNumbers(input) == true && countSpaces(input) == true) {

        System.out.printf("Фамилия: %s", input.substring(0, firstSpace));
        System.out.printf("\nИмя: %s", input.substring(firstSpace + 1, lastSpace));
        System.out.printf("\nОтчество: %s", input.substring(lastSpace + 1, input.length()));
      } else {
        System.out.println("Введенная строка не является ФИО");
      }
    }
  }

  private static boolean containNumbers(String sentence) {
    for (int i = 0; i < 9; i++) {
      if (sentence.contains(String.valueOf(i))) {
        return false;
      }
    }
    return true;
  }

  private static boolean countSpaces(String sentence) {
    int count = 0;
    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == ' ') {
        count++;
      }
    }
    return count == 2 ? true : false;
  }
}