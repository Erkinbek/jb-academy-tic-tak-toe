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

        check4Impossible(str);
        checkWins(lines);
    }


    public static void checkWins(String[] line)
    {
        boolean Xwin = false;
        boolean Owin = false;

        // gorizontal bo'yicha
        for (int i = 0; i < 3; i++) {
            if (line[i].equals("XXX") || line[i].equals("OOO")) {
                if (line[i].equals("OOO")){
                    Owin = true;
                }
                if (line[i].equals("XXX")){
                    Xwin = true;
                }
            }
        }

        //Vertikal bo'yicha
        for (int i = 0; i < 2; i++) {
            //TODO
        }

    }

    public static void check4Impossible(String line) {
        int x = 0, o = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'X') {
                x++;
            }
            if (line.charAt(i) == 'O') {
                o++;
            }
        }
        if (Math.abs(x - o) > 1) System.out.println("Impossible");
    }
}
