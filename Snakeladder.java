package Com.bridgelab.Day4.snakeladder;
import java.util.*;
public class Snakeladder {
    public static void main(String[] args) {
        Random rd = new Random();
     System.out.println("snake and ladder simmulator");
     int SinglePlayer = 0;
     System.out.println("statring position of single player "+ SinglePlayer);
     int a = rd.nextInt(6)+1;
     System.out.println("single player roll "+a);
    }
}
