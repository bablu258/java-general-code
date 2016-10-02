import javax.swing.JOptionPane;


public class Division {

	public static void main(String[] args) {
		int num, sum=0, counter;
		String str;
		
		do {
			
			str = JOptionPane.showInputDialog ( " enter a positive nonzero number: ");
			
			if (str == null)
				System.exit(0);
			
			num= Integer.parseInt(str);
			
		} while(num <= 0);
		
		for (counter = 1; counter <= num; counter++)
			sum = sum + counter;

		JOptionPane.showMessageDialog ( null, "The total amount is : " + sum );
	}
}

