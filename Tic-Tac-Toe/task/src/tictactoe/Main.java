package tictactoe;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(
                    ThreadLocalRandom.current().nextInt(0,2) > 0 ? "X" : "O"
                );
            }
            System.out.print("\n");
        }
    }
}
