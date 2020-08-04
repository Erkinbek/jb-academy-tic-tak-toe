import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        check(value, value, scanner);
    }

    public static void check(int max, int value, Scanner scanner) {
        if (max < value) max = value;
        value = scanner.nextInt();
        if (value == 0) System.out.println(max);
        else check(max, value, scanner);
    }
}