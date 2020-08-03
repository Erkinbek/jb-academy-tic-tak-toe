import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        boolean res = true;
        int a;

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if (matrix[i][j] != matrix[j][i]) res = false;
            }
        }

//        int tempIndex = n -1;
//        a = matrix[0][tempIndex];
//        for(int i = 0; i < n; i++) {
//            if (a != matrix[i][tempIndex]) {
//                res = false;
//            }
//            tempIndex--;
//        }
        System.out.println(res ? "YES" : "NO");
    }
}