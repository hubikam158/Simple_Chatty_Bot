import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int h = scanner.nextInt();

        if (a > h) {
            System.out.println("Deficiency");
        } else if (b < h) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}