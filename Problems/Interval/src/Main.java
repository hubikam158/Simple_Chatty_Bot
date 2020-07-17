import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (num <= -15 || num == 13 || num == 14 || num == 17 || num == 18) {
            System.out.println("False");
        } else {
            System.out.println("True");
        }
    }
}