package Computer;

public class Display {
    private final double diagonal;
    private final String type;
    private final int weight;

    public Display(double diagonal, String type, int weight) {
        this.diagonal = diagonal;
        this.type = type;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public Display setDiagonal(double diagonal) {
        return new Display(diagonal, type, weight);
    }

    public String getType() {
        return type;
    }

    public Display setType(String type) {
        return new Display(diagonal, type, weight);
    }

    public int getWeight() {
        return weight;
    }

    public Display setWeight(int weight) {
        return new Display(diagonal, type, weight);
    }

    public String getCharachersOfDisplay() {
        return "Харктеристики экрана: \tДигональ: " + diagonal +
                "\tТип матрицы: " + type +
                "\tВес: " + weight + " гр.";
    }
}
