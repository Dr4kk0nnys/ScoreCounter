import java.util.Scanner;

public class GameCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type it the first player: ");
        String firstPlayer = scanner.next();

        System.out.print("Type it the second player: ");
        String secondPlayer = scanner.next();

        System.out.print("How many rounds ? ");
        int rounds = scanner.nextInt();

        String[] numberOfKillsPlayer1 = new String[rounds];
        String[] numberOfKillsPlayer2 = new String[rounds];

        for (int i = 0; i < rounds; i++) {
            System.out.println("---------- " + (i + 1) + " Round ----------");
            System.out.print("How many kills does " + firstPlayer + " had ? ");
            int firstPlayerKills = scanner.nextInt();

            numberOfKillsPlayer1[i] = firstPlayer + ": " + firstPlayerKills;

            System.out.print("How many kills does " + secondPlayer + " had ? ");
            int secondPlayerKills = scanner.nextInt();

            numberOfKillsPlayer2[i] = secondPlayer + ": " + secondPlayerKills;
        }

        for (int i = 0; i < numberOfKillsPlayer1.length; i++) {
            System.out.println("---------- " + (i + 1) + " Round ----------");
            System.out.println(numberOfKillsPlayer1[i]);
            System.out.println(numberOfKillsPlayer2[i]);
        }
        scanner.close();
    }
}
