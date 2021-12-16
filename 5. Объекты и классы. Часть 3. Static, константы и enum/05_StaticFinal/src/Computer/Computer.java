package Computer;

public class Computer {
    private final Cpu cpu;
    private final Ram ram;
    private final Driver driver;
    private final Display display;
    private final Keyboard keyboard;
    private final String vendor;
    private final String name;

    public Computer(String vendor, String name, Cpu cpu, Ram ram, Driver driver, Display display, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.driver = driver;
        this.display = display;
        this.keyboard = keyboard;
    }

    private Computer setVendor(String vendor) {
        return new Computer(vendor, name, cpu, ram, driver, display, keyboard);
    }

    private Computer setName(String name) {
        return new Computer(vendor, name, cpu, ram, driver, display, keyboard);
    }

    private Computer setCpu(Cpu cpu) {
        return new Computer(vendor, name, cpu, ram, driver, display, keyboard);
    }

    private Computer setRam(Ram ram) {
        return new Computer(vendor, name, cpu, ram, driver, display, keyboard);
    }

    private Computer setDriver(Driver driver) {
        return new Computer(vendor, name, cpu, ram, driver, display, keyboard);
    }

    private Computer setDisplay(Display display) {
        return new Computer(vendor, name, cpu, ram, driver, display, keyboard);
    }

    private Computer setKeyboard(Keyboard keyboard) {
        return new Computer(vendor, name, cpu, ram, driver, display, keyboard);
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Driver getDriver() {
        return driver;
    }

    public Display getDisplay() {
        return display;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }


    public String getWeight(Cpu cpu, Ram ram, Driver driver, Display display, Keyboard keyboard) {
        return "Вес ноутбука: " + (cpu.getWeight() + ram.getWeight() + driver.getWeight() + display.getWeight() + keyboard.getWeight() + " гр.");
    }

    public String toString(Cpu cpu, Ram ram, Driver driver, Display display, Keyboard keyboard) {
        return "Характеристики ноутбука " + vendor + " " + name +
                "\n" + cpu.getCharachersOfCpu() +
                "\n" + ram.getCharachersOfRam() +
                "\n" + driver.getCharachersOfDriver() +
                "\n" + display.getCharachersOfDisplay() +
                "\n" + keyboard.getCharachersOfKeyboard();

    }
}
