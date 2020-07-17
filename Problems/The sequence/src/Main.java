import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int curr = 0;
        int value;
        int ans = 0;

        while (curr < num) {
            value = scanner.nextInt();
            curr ++;

            if (value % 4 == 0 && value > ans) {
                ans = value;
            }
        }

        System.out.println(ans);
    }
}