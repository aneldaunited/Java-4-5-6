import java.util.Scanner;

public class MainDriver {

    //Instance variables
    private Announcer myAnnouncer;
    private Player[] players;

    public static void main(String[] args) {
        MainDriver driver = new MainDriver();

        driver.start();
    }

    public void start() {

        int currentRound = 0;
        char response;

        boolean playAgain = true;

        while (playAgain) {
            currentRound++;

            System.out.println("Round: " + currentRound);

            newRound();

            System.out.println("Let's begin!");
            playRound();

            System.out.println("Would you like to play another round?\n");
            System.out.println("Please indicate your choice (Y / N) \n");
            Scanner scan = new Scanner(System.in);
            char input = scan.nextLine().toUpperCase().charAt(0);

            if (input == 'Y') {
                playAgain = true;
            } else {
                playAgain = false;
            }
        }
    }


    public void playRound() {

        boolean gameOver = false;
        int totalRounds = 0;

        while (!(gameOver || totalRounds >= 25)) {
            gameOver = myAnnouncer.chooseNextNumber();
            totalRounds++;
        }
    }


    public void newRound() {

        System.out.println("Which type of myAnnouncer would you like?\n");
        System.out.println("1. Random Announcer\n");
        System.out.println("2. Manual Announcer\n");


        int input = getUserSelection(0, 2);
        if (input == 1) {
            myAnnouncer = new RandomAnnouncer();
        } else {
            myAnnouncer = new ManualAnnouncer();
        }

        players = new Player[2];
        int input2;
        for (int i = 0; i < 2; i++) {
            System.out.println("Which type of Player " + (i+1) +" would you like?\n");
            System.out.println("1. Random Player\n");
            System.out.println("2. Human Player\n");

            input2 = getUserSelection(0, 2);
            if (input2 == 1) {
                players[i] = new RandomPlayer();
            } else {
                players[i] = new HumanPlayer();
            }
            myAnnouncer.addNewPlayer(players[i]);
        }



    }


    public int getUserSelection(int lower, int upper) {
        int input;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please indicate your choice.\n");
        input = scan.nextInt();
        scan.nextLine();

        if (lower > upper) {
            return 0;
        }

        if (input < lower || input > upper) {
            System.out.println("Invalid choice.\n");
            return 0;
        }

        return input;

    }
}

