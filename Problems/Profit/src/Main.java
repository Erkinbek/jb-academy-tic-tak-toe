import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m,p,k;
        int years = 0;
        m = scanner.nextInt();
        p = scanner.nextInt();
        k = scanner.nextInt();
        while(k > m) {
            m = m + (m*p/100);
            years++;
        }
        System.out.println(years);
    }
}