import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print(j + " ");
            }
            for (int g = 0; g < n- i; g++) {
                System.out.print(g + " ");
            }
            System.out.print("\n");
        }
    }
}