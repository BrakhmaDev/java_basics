package Elevator;

public class Elevator {
    private int currentFloor = 1;
    private int minFloor = 0;
    private int maxFloor = 0;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
    }

    public int getCurrentFloor() { return currentFloor; }

    private int moveDown() {
        currentFloor = currentFloor > minFloor ? currentFloor - 1 : currentFloor;
        return currentFloor;
    }

    private int moveUp() {
        currentFloor = currentFloor < maxFloor ? currentFloor + 1 : currentFloor;
        return currentFloor;
    }

    public void move(int floor) {
        if (floor < currentFloor && floor >= minFloor) {
            for(int i = currentFloor; i > floor; i--) {
                System.out.println("Текущий этаж: " + moveDown());
            }
        }
        else if (floor < minFloor){
            System.out.printf("\nНиже %d этажа спуститься невозможно\n", minFloor);
        }

        if (floor > currentFloor && floor <= maxFloor) {
            for(int i = currentFloor; i < floor; i++) {
                System.out.println("Текущий этаж: " + moveUp());
            }
        }
        else if (floor > maxFloor){
            System.out.printf("\nВыше %d этажа подняться невозможно\n", maxFloor);
        }
    }
}
