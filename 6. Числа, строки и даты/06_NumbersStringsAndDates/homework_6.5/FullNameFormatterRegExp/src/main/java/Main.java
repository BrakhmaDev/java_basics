import java.util.Scanner;
public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    while (true) {
      String input = scanner.nextLine();
      if (input.equals("0")) {
        break;
      }
      if (sentenceValidator(input) == false) {
        String[] splittedInput = input.split("\\s");
        System.out.printf("Фамилия: %s\nИмя: %s\nОтчество: %s", splittedInput[0] , splittedInput[1], splittedInput[2]);
      } else {
       System.out.println("Введенная строка не является ФИО");
      }
    }
  }

  public static boolean sentenceValidator(String sentence) {
    boolean hasNotNumbers = sentence.matches("^\\D+\\s\\D+\\s\\D+$");
    if (hasNotNumbers == true) {
      return false;
    }
    return true;
  }
}