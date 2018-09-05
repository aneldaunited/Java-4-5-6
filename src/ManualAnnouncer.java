import java.util.Scanner;

public class ManualAnnouncer extends Announcer {

    @Override
    public boolean chooseNextNumber() {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please insert your number.\n");
        int input = Integer.parseInt(scan.nextLine());
        return announceNextNumber(input);
    }
}
