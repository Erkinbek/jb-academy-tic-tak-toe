import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int rotation = scanner.nextInt();
        String[] nums = line.split(" ");
        rotation = rotation % nums.length;
        for (int i = nums.length - rotation; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        for (int i = 0; i < nums.length - rotation; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}