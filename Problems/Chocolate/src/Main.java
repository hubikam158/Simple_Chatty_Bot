import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        if (k > m * n || k % n != 0 && k % m != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}