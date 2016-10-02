
public class GuiMain {

	public static void main(String[] args) {
		
		
		DiceValue dice3 = new DiceValue ();
		DiceValue dice5 = new DiceValue (5);
		
		System.out.println ("The value of the dice 3 is " + dice3.roll());
		System.out.println ("The value of the dice 5 is " + dice5.roll());
		



	}

}
