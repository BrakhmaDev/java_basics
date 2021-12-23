import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    System.out.println(calculateSalarySum(text));
  }

  public static int calculateSalarySum(String text) {
    int sum = 0;
    String[] splittedText = text.split(", ");
    for (String n : splittedText) {
      try {
        sum += Integer.parseInt(n.replaceAll("\\W+", ""));
      }
      catch (NumberFormatException ex) {
        sum = 0;
      }
    }
    return sum;
  }
}