import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] nums = new int[n];
        int max = 0;
        for (int i=0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        for (int i = 0; i < n - 1; i++) {
            int max1 = nums[i] * nums[i + 1];
            if (max < max1) {
                max = max1;
            }
        }
        System.out.println(max);
    }
}