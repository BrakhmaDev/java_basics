package Copy;

public class Main {
    public static  void main(String[] args) {
        Dimensions dimensions = new Dimensions(40, 50, 60, 4, "Kazan city, Chistopol street. 51, flat 73");
        Cargo cargo = new Cargo("No", "1A2B3C4D", "Yes", dimensions);
        System.out.println(cargo);

        System.out.println("\n===================================\n");

        Dimensions copy = new Dimensions(70, 80,
                90, 6, dimensions.getAdress());
        Cargo cargo1 = new Cargo("Yes", "5E6F7G8H9I10J", "No", copy);
        System.out.println(cargo1);

        System.out.println("\n===================================\n");

        Dimensions copy1 = new Dimensions(copy.getHeight(), dimensions.getWidth(),
                dimensions.getLength(), dimensions.getWeight(), dimensions.getAdress());
        Cargo cargo2 = new Cargo(cargo1.getCanTurn(), cargo1.getRegistrationNumber(), cargo1.getIsCargoFragile(), copy1);
        System.out.println(cargo2);
    }
}
