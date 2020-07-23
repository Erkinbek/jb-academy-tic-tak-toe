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
        System.out.println("---------");

        checkWins(lines, str);
    }


    public static void checkWins(String[] line, String str)
    {
        boolean Xwin = false;
        boolean Owin = false;
        boolean impossible = false;

        Xwin = checkDioganal('X', line);
        Owin = checkDioganal('O', line);

        Xwin = checkHorizontal('X', line, Xwin);
        Owin = checkHorizontal('O', line, Owin);

        // gorizontal bo'yicha
        for (int i = 0; i < 3; i++) {
            if (line[i].equals("OOO")){
                Owin = true;
            }
            if (line[i].equals("XXX")){
                Xwin = true;
            }
        }

        if (!check4Impossible(str, Xwin, Owin))
            System.out.println("Impossible");
        else  {
            if (Xwin) {
                System.out.println("X wins");
            }
            if (Owin) {
                System.out.println("O wins");
            }
            Draw(Xwin, Owin, str);
        }

    }

    public static void Draw(boolean xWin, boolean oWin, String str) {
        boolean draw = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '_') draw = false;
        }
        if (!xWin && !oWin && draw) {
            System.out.println("Draw");
        }
        if (!xWin && !oWin && !draw) {
            System.out.println("Game not finished");
        }
    }

    public static boolean checkHorizontal(char ch, String[] line, boolean current) {
        for (int i = 0; i < 3; i++) {
            if ((line[0].charAt(i) == ch && line[1].charAt(i) == ch && line[2].charAt(i) == ch) || current)
                return true;
            }
        return false;
    }

    public static boolean checkDioganal(char ch, String[] line) {
        if (line[0].charAt(0) == ch && line[1].charAt(1) == ch && line[2].charAt(2) == ch)
            return true;
        if (line[0].charAt(2) == ch && line[1].charAt(1) == ch && line[2].charAt(0) == ch)
            return true;
        return false;
    }

    public static boolean check4Impossible(String line, boolean xWin, boolean oWin) {
        int x = 0, o = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'X') {
                x++;
            }
            if (line.charAt(i) == 'O') {
                o++;
            }
        }
        if ((Math.abs(x - o) > 1) || (xWin && oWin)) {
            return false;
        }
        return true;
    }
}
