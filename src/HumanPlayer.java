import java.util.Scanner;

public class HumanPlayer implements Player{

    private int[] numbers = new int[4];
    private BingoCard card;


    public HumanPlayer() {
        chooseNumbers();
    }

    @Override
    public boolean checkForNumber(int checkNumber) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == checkNumber){
                card.markOff(checkNumber);
                return true;
            }
        }
        return false;
    }

    @Override
    public void chooseNumbers() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Please enter number " + (i+1));

            int value = Integer.parseInt(input.nextLine());
            numbers[i] = value;
        }
        card = new BingoCard(numbers);
    }



    @Override
    public String printRemaining() {
        return card.getRemaining();
    }

    @Override
    public boolean checkIfWon() {
        return card.areAllMarkedOff();
    }
}
