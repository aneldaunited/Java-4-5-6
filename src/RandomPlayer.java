
public class RandomPlayer {

	
	
	public int[] chooseNumber() {
		int[] numbers = new int[4];
		for (int i = 0; i < numbers.length; i++) {
			int value = (int) (Math.random() * 90) + 10;
			numbers[i] = value;
		}
		
		return numbers;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
