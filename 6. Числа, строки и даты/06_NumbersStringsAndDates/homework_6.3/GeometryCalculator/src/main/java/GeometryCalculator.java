public class GeometryCalculator {
    /*private double radius;
    private double a;
    private double b;
    private double c;*/
    // метод должен использовать абсолютное значение radius
    public static double getCircleSquare(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // метод должен использовать абсолютное значение radius
    public static double getSphereVolume(double radius) {
        radius = Math.abs(radius);
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static boolean isTrianglePossible(double a, double b, double c) {
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b > c) && (a + c > b) && (c + b > a)) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    // перед расчетом площади рекомендуется проверить возможен ли такой треугольник
    // методом isTrianglePossible, если невозможен вернуть -1.0
    public static double getTriangleSquare(double a, double b, double c) {
        if (isTrianglePossible(a, b, c) == false) {
            return -1.0;
        }
        else {
            double halfAnPerimeter = (a + b + c) / 2;
            return Math.sqrt(halfAnPerimeter * (halfAnPerimeter - a) * (halfAnPerimeter - b) * (halfAnPerimeter - c));
        }
    }
}
