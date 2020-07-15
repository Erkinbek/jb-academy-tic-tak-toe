import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] incomes = new double[n];
        double[] taxes = new double[n];
        double max = 0;
        int index = 0;
        for (int i = 0; i < n; i++) {
            incomes[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            taxes[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            double a = incomes[i] / 100 * taxes[i];
            if (a > max) {
                max = a;
                index = i;
            }
        }
        System.out.println(index+1);
    }
}