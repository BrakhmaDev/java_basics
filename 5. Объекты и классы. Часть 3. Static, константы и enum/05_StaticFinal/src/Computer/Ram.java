package Computer;

public class Ram {
    private final String type;
    private final int volume;
    private final int weight;

    public Ram(String type, int volume, int weight) {
        this.type = type;
        this.volume = volume;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public Ram setType(String type) {
        return new Ram(type, volume, weight);
    }

    public int getVolume() {
        return volume;
    }

    public Ram setVolume(int volume) {
        return new Ram(type, volume, weight);
    }

    public int getWeight() {
        return weight;
    }

    public Ram setWeight(int weight) {
        return new Ram(type, volume, weight);
    }

    public String getCharachersOfRam() {
        return "Харктеристики диска: \tТип: " + type +
                "\tОбъем: " + volume +
                "  Гб \tВес: " + weight + " гр.";
    }
}
