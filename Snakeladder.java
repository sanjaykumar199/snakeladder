package Com.bridgelab.Day4.snakeladder;
import java.util.*;
public class Snakeladder {
    public static void main(String[] args) {
        Random rd = new Random();
        System.out.println("snake and ladder simmulator");
        System.out.println();
        int SinglePlayer = 0;
        System.out.println("statring position of single player " + SinglePlayer);

        while (SinglePlayer != 100) {
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
                System.out.println("Snake bytes & player move behind by number of position:" + "-" + SinglePlayerRolls);
                System.out.println("Player current position: " + SinglePlayer);
            }
        }
    }
}