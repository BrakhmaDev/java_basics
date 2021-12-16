package Copy;

public class Cargo {
    private final String canTurn;
    private final String registrationNumber;
    private final String isCargoFragile;
    private final Dimensions dimensions;

    public Cargo(String canTurn, String registrationNumber, String isCargoFragile, Dimensions dimensions) {
        this.canTurn = canTurn;
        this.registrationNumber = registrationNumber;
        this.isCargoFragile = isCargoFragile;
        this.dimensions = dimensions;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }

    public String getCanTurn() {
        return canTurn;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getIsCargoFragile() {
        return isCargoFragile;
    }

    public String toString() {
        return dimensions + "\nМожно переворачивать: " + canTurn
                + "\nРегистрационный номер: " + registrationNumber
                + "\nГруз хрупкий: " + isCargoFragile;
    }
}
