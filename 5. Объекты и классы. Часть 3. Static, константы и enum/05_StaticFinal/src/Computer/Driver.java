package Computer;

public class Driver {
    private final String type;
    private final int memoryVolume;
    private final int weight;

    public Driver(String type, int memoryVolume, int weight) {
        this.type = type;
        this.memoryVolume = memoryVolume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public Driver setType(String type) {
        return new Driver(type, memoryVolume, weight);
    }

    public int getMemoryVolume() {
        return memoryVolume;
    }

    public Driver setMemoryVolume(int memoryVolume) {
        return new Driver(type, memoryVolume, weight);
    }

    public int getWeight() {
        return weight;
    }

    public Driver setWeight(int weithg) {
        return new Driver(type, memoryVolume, weight);
    }

    public String getCharachersOfDriver() {
        return "Харктеристики диска: \tТип: " + type +
                "\tОбъем паямти: " + memoryVolume +
                "  Гб \tВес: " + weight + " гр.";
    }
}
