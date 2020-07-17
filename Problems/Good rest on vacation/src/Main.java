import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration = scanner.nextInt();
        int foodCostPerDay = scanner.nextInt();
        int flightCost = scanner.nextInt();
        int hotelCostPerNight = scanner.nextInt();

        int totalCost = duration * foodCostPerDay + 2 * flightCost +
                (duration - 1) * hotelCostPerNight;
        System.out.println(totalCost);
    }
}