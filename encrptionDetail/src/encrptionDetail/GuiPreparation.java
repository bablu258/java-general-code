package encrptionDetail;

import javax.swing.JOptionPane;

public class GuiPreparation {

	public static void main(String[] args) {
		
		double airFare,taxiFare,totalCost,totalReembursed,
		totalCostOrExcee;
		 final double fareAir = 250, fareTaxi = 20;
		
		String air =JOptionPane.showInputDialog("How much " +
		                               "you spent for "
		                               + "air fare? ");
		airFare = Double.parseDouble(air);
		
		String taxi =JOptionPane.showInputDialog("How much " +
                "you spent for "
                + "taxi fare? ");
		
		taxiFare = Double.parseDouble(taxi);
		
		totalCost = airFare + taxiFare;
		totalReembursed = fareAir + fareTaxi;
		
		totalCostOrExcee = totalCost - totalReembursed;
		
		JOptionPane.showMessageDialog (null, " Total "
				+ "expenses incurred by the "
				+ "business person $ " + totalCost);
		
		JOptionPane.showMessageDialog (null, " The total"
				+ " allowable expenses for the "
				+ "trip $" + totalReembursed);
		
		if (totalCostOrExcee > 0)
			
			JOptionPane.showMessageDialog (null, " The "
					+ "excess that must be paid by "
					+ "the business person" 
					+ totalCostOrExcee);
		
		else if (totalCostOrExcee <= 0)
			
			JOptionPane.showMessageDialog (null, " The "
					+ "amount saved by the business is $"
					+ Math.abs(totalCostOrExcee));
		
		
		
		System.exit(0);
	}

}
