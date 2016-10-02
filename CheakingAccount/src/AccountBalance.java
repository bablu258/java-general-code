
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class AccountBalance {

	public static void main(String[] args) throws FileNotFoundException {
		
		
		double openingBalance;
		
		double deposit, withdraw, total = 0;
		final double INTEREST_RATE = 0.0475;
		double interestamount=0;
		String depositFile, withdrawFile;
		
		
		
		Scanner keyboard = new Scanner(System.in); 
		
		System.out.println(" Enter the opening balace you have: ");
		openingBalance = keyboard.nextDouble();
		
		keyboard.nextLine();
		
		
		total = total + openingBalance;
		
		System.out.println("Enter the name of the deposit file: ");
		depositFile = keyboard.nextLine ();
		
		
		
		System.out.println("Enter the name of the withdrawal file: ");
		withdrawFile = keyboard.nextLine ();
		
		
		
		File inputDe = new File (depositFile);
		Scanner inputdepo = new Scanner(inputDe); 
		File inputwi = new File (withdrawFile);
		Scanner inputwithdraw = new Scanner(inputwi); 
		
		
		
		while (inputdepo.hasNext () && inputwithdraw.hasNext() )
		
		{	String firstdepo =  inputdepo.nextLine();
			deposit = Double.parseDouble(firstdepo);
			
			String firstwithdraw =  inputwithdraw.nextLine(); 
			withdraw = Double.parseDouble(firstwithdraw);
			
			SavingAccount user = new SavingAccount(total, INTEREST_RATE, deposit, withdraw );
			interestamount = user.getInterest ();
			total = user.getTotal ();
		}
		
		
		//System.out.println (" The deposit is " + firstdepo);
		//System.out.println ( " The withdrawal is " + firstwithdraw);
		System.out.println ( "The interest amount is " + interestamount);
		System.out.println ( "The total with interst is " + total);
		
		
		
		
		
		
		inputdepo.close() ;
		inputwithdraw.close ();
		
		
		

	}

}
