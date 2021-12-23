import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    splitTextIntoWords(text);
  }

  public static String splitTextIntoWords(String text) {String builder = "";
    if (text.isEmpty()) {
      return "";
    } else {
      String[] splittedText = text.split("[0-9\\s\\.\\:\\;\\'\\,^\\-]");
      for (String s: splittedText) {
        if (s.isEmpty()) {
          continue;
        } else {
          builder += s + "\n";
        }
      }
    }
    return builder.trim();
  }
}