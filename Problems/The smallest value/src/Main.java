import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        int start = 1;
        long res = 1;

        while (res <= num) {
            start ++;
            res *= start;
        }

        System.out.println(start);
    }
}