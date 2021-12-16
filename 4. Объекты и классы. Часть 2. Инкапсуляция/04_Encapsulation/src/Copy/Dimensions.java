package Copy;

public class Dimensions {
    private final double height;
    private final double width;
    private final double length;
    private final int weight;
    private final String adress;

    public Dimensions() {
        height = 0;
        width = 0;
        length = 0;
        weight = 0;
        adress = "N/A";
    }

    public Dimensions(double height, double width, double length, int weight, String adress) {
        this.height = height;
        this.width = width;
        this.length = length;
        this.weight = weight;
        this.adress = adress;
    }

    public Dimensions setHeight(double height) {
        return new Dimensions(height, width, length, weight, adress);
    }

    public Dimensions setWidth(double width) {
        return new Dimensions(height, width, length, weight, adress);
    }

    public Dimensions setLength(double length) {
        return new Dimensions(height, width, length, weight, adress);
    }

    public Dimensions setWeight(int weight) {
        return new Dimensions(height, width, length, weight, adress);
    }

    public Dimensions setAdress(String adress) {
        return new Dimensions(height, width, length, weight, adress);
    }

    public double getVolume() {
        return (height * width * length) / 1000000;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public int getWeight() {
        return weight;
    }

    public String getAdress() {
        return adress;
    }

    public String toString() {
        return "Объем груза: " + getVolume() + " см^3"
                + "\nМасса груза: " + weight+ " кг"
                + "\nАдресс: " + adress;
    }
}
