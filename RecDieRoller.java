/*
Author Matthew Parsley
*/
public class RecDieRoller {
	
	/*
	creates our dice numer
	*/
	public final int MAX = 6;

	/*
	creates the number that will hold our total number of rolls
	*/
	public double sum;

	/*
	a method that creates our RecDieRoller
	*/
	public RecDieRoller(){
	}
	
	/*
	a method that rolls our dice until we hit a 2
	@return the number of rolls until it reached a 2
	*/
	public double roll(){
		int faceValue = (int)(Math.random() * MAX) + 1;
		if (faceValue !=2) {
			roll();
			
		}
		sum = sum +1;
		return  sum;
		
	}

	/*
	a method that rolls our dice a certain number of times that we want it too
	@param the number of times we want to roll the dice 
	@return the mean number of times that a six is rolled
	*/
	public double roll2(int n) {
		for(int i = 0; i < n; i++) {
			roll();
		}
		
		return sum/n;
	
	}

}
