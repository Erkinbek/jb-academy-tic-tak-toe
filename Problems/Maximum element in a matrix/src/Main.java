import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int temp, row = 0, col = 0;
        int max = -2147483648;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                temp = scanner.nextInt();
                if (max < temp) {
                    max = temp;
                    row = i;
                    col = j;
                }
            }
        }
        System.out.println(row + " " + col);
    }
}