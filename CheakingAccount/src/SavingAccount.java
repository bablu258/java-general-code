
public class SavingAccount {
	
	private double totalAm;
	private double interestRate;
	private double depositMoney;
	private double withdrawMoney;
	
	
	public SavingAccount (double totalk , double interest, double depoMoney, double withMoney)
	{
		totalAm = totalk;
		interestRate = 	interest;
		depositMoney = depoMoney;
		withdrawMoney = withMoney;
	}
	
	
	
	
	
	public double getInterest ( ) 
	{
		
		totalAm = totalAm +   depositMoney ;
		totalAm = totalAm - withdrawMoney;
		double interestAmount = totalAm * interestRate;
		totalAm = totalAm + interestAmount;
		return interestAmount ;
		
	}
	
	public double getTotal ( )
	{
		
		return totalAm  ;
		
	}
	
	

}
