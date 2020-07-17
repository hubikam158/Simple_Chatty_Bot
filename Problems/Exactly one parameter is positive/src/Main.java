import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean is1 = scanner.nextInt() > 0;
        boolean is2 = scanner.nextInt() > 0;
        boolean is3 = scanner.nextInt() > 0;

        boolean isOnlyFirstPositive = is1 && !is2 && !is3;
        boolean isOnlySecondPositive = !is1 && is2 && !is3;
        boolean isOnlyThirdPositive = !is1 && !is2 && is3;

        System.out.println(isOnlyFirstPositive || isOnlySecondPositive || isOnlyThirdPositive);
    }
}