package Com.bridgelab.Day4.snakeladder;
import java.util.*;
public class Snakeladder {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("snake and ladder simmulator");
        System.out.println();
        int SinglePlayer = 0;
        int count = 0;
        System.out.println("statring position of single player " + SinglePlayer);

        while (SinglePlayer != 100) {
            count++;
            int SinglePlayerRolls = rd.nextInt(6) + 1;
            int a = rd.nextInt(3);
            System.out.println();
            System.out.println("The Player roll the die & get a number: " + SinglePlayerRolls);
            if (a == 0) {
                System.out.println("No play - stays in the same position");
                System.out.println("Player current position: " + SinglePlayer);
            }
            if (a == 1) {
                SinglePlayer += SinglePlayerRolls;
                System.out.println("Get Ladder & player move ahead by number of position: " + SinglePlayerRolls);
                System.out.println("Player current position: " + SinglePlayer);
            }
            if (a == 2) {
                SinglePlayer -= SinglePlayerRolls;
                if (SinglePlayer <= 0) {
                    SinglePlayer = 0;
                    System.out.println("Snake bytes & player move behind by number of position:" + "-" + SinglePlayerRolls);
                }
                else
                    System.out.println("Player current position: " + SinglePlayer);
            }
            if (SinglePlayer > 100) {
                SinglePlayer -= SinglePlayerRolls;
                System.out.println();

                System.out.println("The number goes beyong 100");
                System.out.println("Therefore player current position: " + SinglePlayer);
                System.out.println("The number required by player is: " + (100 - SinglePlayer));
            }
            System.out.println();
            System.out.println("Number of time player played: " + count);
        }
    }
}