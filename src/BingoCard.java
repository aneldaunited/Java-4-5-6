import java.util.Arrays;

public class BingoCard {


    //Instance variables
    private int[] numbers;
    private boolean[] markedOff = new boolean[4];


    //Default Constructor


    //Non-default constructors
    public BingoCard(int[] numbers) {
        this.numbers = numbers;
    }


    // Accessor (Getter)
    public int[] getNumbers() {
        return numbers;
    }

    public boolean[] getMarkedOff() {
        return markedOff;
    }


    //Do stuff here
    public boolean markOff(int numberToCheck) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numberToCheck){
                markedOff[i] = true;
                return true;
            }
        }

        return false;
    }

    public boolean areAllMarkedOff() {
        for (boolean markeditem : markedOff) {
            if (!markeditem) return false;
        }

        return true;

    }

    public String getRemaining() {
        String output = " ";

        for (int i = 0; i < numbers.length; i++) {
            if (!markedOff[i]){
                output += numbers[i] + ", ";
            }
        }
        return output;
    }


    //To-string
    public String toString() {
        String output = " ";
        output += "Your numbers are: " + Arrays.toString(numbers);

        return output;
        }


}
