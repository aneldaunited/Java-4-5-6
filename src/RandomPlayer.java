
public class RandomPlayer implements Player{
    private int[] numbers = new int[4];
    private BingoCard card;


    public RandomPlayer() {
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

        for (int i = 0; i < numbers.length; i++) {
            int value;
            value = (int) (Math.random() * 90) + 10;
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
