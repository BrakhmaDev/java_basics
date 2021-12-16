import java.util.Scanner;

public class Test {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String boxes = scanner.nextLine();
    int boxesToInt = Integer.parseInt(boxes);
    double truckCanCarry = 12.0;
    double containerCanCarry = 27.0;
    double containers = Math.ceil(boxesToInt / containerCanCarry);
    double trucks = Math.ceil(containers / truckCanCarry);
    int countBoxes = 0;
    int countContainers = 0;

    for (int i = 1; i <= trucks; i++) {
      System.lineSeparator();
      System.out.printf("\nГрузовик: %d", i);
      for (int j = 1; j <= truckCanCarry; j++) {
        countContainers++;
        if (countContainers > containers) {
            continue;
        }
        System.out.printf("\n\tКонтейнер: %d", j);
        int count = 0;
        while (countBoxes < boxesToInt && count < containerCanCarry) {
          countBoxes++;
          count++;
          System.out.printf("\n\t\tЯщик: %d", countBoxes);
        }
      }
    }
    System.out.printf("\nНеобходимо:\nгрузовиков - %d шт.\nконтейнеров - %d шт.", Math.round(trucks), Math.round(containers));
  }
}
