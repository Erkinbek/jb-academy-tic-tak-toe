import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n,m,k, counter = 0;
        n = scanner.nextInt();
        m = scanner.nextInt();
        boolean output = true;
        int[][] matrix = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        k = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    counter++;
                    if (counter == k) {
                        if(output) {
                            System.out.println(i+1);
                            output = false;
                        }
                    }
                } else {
                    counter = 0;
                }
            }
            counter = 0;
        }
        if(output) {
            System.out.println(0);
        }
    }
}