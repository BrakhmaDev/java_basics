package Computer;

public class Main {

    public static void main(String[] args) {
        Cpu cpu = new Cpu(3, 8, "AMD Ryzen 9 5980HS", 125);
        Ram ram = new Ram("LPDDR4", 32, 300);
        Driver driver = new Driver("SSD", 1024, 400);
        Display display = new Display(13.4, "IPS", 1500);
        Keyboard keyboard = new Keyboard("Мембранная", "Есть", 200);
        Computer asus = new Computer("ASUS", "ROG FLOW X13", cpu, ram, driver, display, keyboard);
        System.out.println(asus.toString(cpu, ram, driver, display, keyboard));
        System.out.println(asus.getWeight(cpu, ram, driver, display, keyboard));

        System.out.println("\n=============================================================\n");

        Cpu cpu1 = new Cpu(2.6, 8, "Intel Core i9 11980HK", 150);
        Ram ram1 = new Ram("DDR4", 64, 900);
        Driver driver1 = new Driver("SSD", 1024, 600);
        Display display1 = new Display(17.3, "IPS", 2300);
        Keyboard keyboard1 = new Keyboard(keyboard.getType(), keyboard.getLight(), keyboard.getWeight());
        Computer msi = new Computer("MSI", "GE76 Raider", cpu1, ram1, driver1, display1, keyboard1);
        System.out.println(msi.toString(cpu1, ram1, driver1, display1, keyboard1));
        System.out.println(msi.getWeight(cpu1, ram1, driver1, display1, keyboard1));

        System.out.println("\n=============================================================\n");

        Cpu cpu2 = new Cpu(3.3, 8, "Intel Core i9 11980HK", 150);
        Ram ram2 = new Ram(ram1.getType(), ram1.getVolume(), ram1.getWeight());
        Driver driver2 = new Driver(driver1.getType(), driver1.getMemoryVolume(), driver1.getWeight());
        Display display2 = new Display(display1.getDiagonal(), display1.getType(), display1.getWeight());
        Keyboard keyboard2 = new Keyboard(keyboard.getType(), keyboard.getLight(), keyboard.getWeight());
        Computer acer = new Computer("ACER", "Predator Helios", cpu2, ram2, driver2, display2, keyboard2);
        System.out.println(acer.toString(cpu2, ram2, driver2, display2, keyboard2));
        System.out.println(acer.getWeight(cpu2, ram2, driver2, display2, keyboard2));
    }
}
