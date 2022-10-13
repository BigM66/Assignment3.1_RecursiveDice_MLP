import java.util.Scanner;
public class RecDieRollerDriver {

	public static void main(String[] args) {
		
		/*
		creates our prompt to ask the user for how many times they want us to roll
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("please choose a number:");
		int number = scan.nextInt();

		/*
		creates our dice
		*/
		RecDieRoller dice = new RecDieRoller();
		
		/*
		prints our the number of rolls it took to get a 2.
		*/
		System.out.println("it took" + " " +  dice.roll() + " " + "rolls to roll a 2 on the dice");
		
		/*
		prints mean number of times that our dice rolls a 6 in a picked number of rolls
		*/
		System.out.println("In 1000 rolls, we rolled a 2 on average every" + " " + dice.roll2(number) + " " + "rolls");
		
		scan.close();

	}
	

}
