package Elevator;

import Elevator.Elevator;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Elevator elevator = new Elevator(-3, 26);
        while(true) {
            System.out.print("Введите номер этажа: ");
            int floor = sc.nextInt();
            elevator.move(floor);
        }
    }
}
