import java.util.Scanner;

class main {
    static final double gravity_mars = 3.721; // ускорения свободного падения на Марсе м/c в квадрате

    static final double earth_gravity = 9.80665; // ускорения свободного падения на Земле м/c в квадрате

    static final double fuel_consumption = 100.0; // кол-во топливо на 1 кг груза на Земле, кг

    public static void main(String[] args)     {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ввидите вес груза");

        double weight = scanner.nextDouble();

        System.out.println(weight *(fuel_consumption * earth_gravity * gravity_mars));

    }
}
