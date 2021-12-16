import java.util.Scanner;

public class Main {

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
            System.out.printf("\nГрузовик: %d", i);
            int count = 0;
            while (countContainers < containers && count < truckCanCarry) {
                countContainers++;
                count++;
                System.out.printf("\n\tКонтейнер: %d", countContainers);
                int count1 = 0;
                while (countBoxes < boxesToInt && count1 < containerCanCarry) {
                    countBoxes++;
                    count1++;
                    System.out.printf("\n\t\tЯщик: %d", countBoxes);
                }
            }
        }
        System.out.printf("\nНеобходимо:\nгрузовиков - %d шт.\nконтейнеров - %d шт.", Math.round(trucks), Math.round(containers));


        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }

}
