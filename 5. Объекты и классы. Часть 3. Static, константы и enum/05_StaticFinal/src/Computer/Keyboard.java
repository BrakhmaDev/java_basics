package Computer;

public class Keyboard {
    private final String type;
    private final String light;
    private final int weight;

    public Keyboard(String type, String light, int weight) {
        this.type = type;
        this.light = light;
        this.weight = weight;
    }

    public String getType() {
        return type;
    }

    public Keyboard setType(String type) {
        return new Keyboard(type, light, weight);
    }

    public String getLight() {
        return light;
    }

    public Keyboard setLight(String light) {
        return new Keyboard(type, light, weight);
    }

    public int getWeight() {
        return weight;
    }

    public Keyboard setWeight(int weight) {
        return new Keyboard(type, light, weight);
    }

    public String getCharachersOfKeyboard() {
        return "Харктеристики диска: \tТип: " + type +
                "\tПодстветка: " + light +
                "\tВес: " + weight + " гр.";
    }
}
