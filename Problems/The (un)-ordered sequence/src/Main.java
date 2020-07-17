import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();
        long prev;
        boolean asc = true;
        boolean desc = true;

        while (true) {
            prev = num;
            num = scanner.nextLong();

            if (num == 0) {
                break;
            }

            if (desc && num > prev) {
                desc = false;
                continue;
            }

            if (asc && num < prev) {
                asc = false;
                continue;
            }

            if (!asc && !desc) {
                break;
            }
        }

        System.out.println(asc || desc);
    }
}