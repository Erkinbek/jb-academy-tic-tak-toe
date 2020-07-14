package tictactoe;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] lines = {str.substring(0,3), str.substring(3,6), str.substring(6,9)};
        System.out.print("---------\n");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(lines[i].charAt(j));
                if (j != 2) System.out.print(" ");
            }
            System.out.print(" |");
            System.out.print("\n");
        }
        System.out.print("---------");
    }
}
