
public class BingoCard {

	
	//Instance variables
	public int[] numbers = new int[4];
	public boolean[] markedOff = new boolean[4];

	
	//Default Constructor
	
	
	
	//Non-default constructors
	public BingoCard (int[] numbers) {
		this.numbers = numbers;
	}
	
	
	// Accessor (Getter)
	public int[] getNumbers () {
		return numbers;
	}
	
	public boolean[] getMarkedOff () {
		return markedOff;
	}
	
	
	//Do stuff here
	public boolean markOff (int numbers) {
		return true;
	}
	
	public boolean areallMarkedOff() {
		if (markOff(numbers) == [4] );{
			return true;
		}			
	
	}
	
	public int[] getRemaining() {
		
	}
	
	
	
	
	
	//To-string
	public String toString  () {
		String output = " ";
		output += "Your numbers are: " + numbers;
		
		return output;
	}
	
	
	
	
	
	
	
	
}
