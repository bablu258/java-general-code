import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class GuiAssigenment extends JFrame {
	
	   private JPanel panel;             // To reference a panel
	   private JLabel messageLabel;      // To reference a label
	   private JTextField airfareTextField; // To reference a text field
	  
	   private JLabel messageLabel1;
	   private JTextField carRentalTextField;
	   
	   
	   private JLabel messageLabel2;
	   private JTextField parkingFeeTextField;
	   
	   
	   private JLabel messageLabel3;
	   private JTextField seminarTextField;
	   
	   
	   private JLabel messageLabel4;
	   private JTextField lodgingTextField;
	   
	   private JLabel messageLabel5;
	   private JTextField taxiTextField;
	   
	   
	   
	   private JButton calcButton;       // To reference a button
	   private final int WINDOW_WIDTH = 310;  // Window width
	   private final int WINDOW_HEIGHT = 100; // Window height

	   /**
	      Constructor
	   */

	   public GuiAssigenment()
	   {
	      // Set the window title.
	      setTitle("Travel Expenses ");

	      // Set the size of the window.
	      setSize(WINDOW_WIDTH, WINDOW_HEIGHT);

	      // Specify what happens when the close button is clicked.
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      // Build the panel and add it to the frame.
	      buildPanel();

	      // Add the panel to the frame's content pane.
	      add(panel);

	      // Display the window.
	      setVisible(true);
	   }

	   /**
	      The buildPanel method adds a label, text field, and
	      and a button to a panel.
	   */

	   private void buildPanel()
	   {
	      // Create a label to display instructions. starts change
	      messageLabel = new JLabel("Cost of " +
	                                "air fare");
	   
	      // Create a text field 10 characters wide.
	      airfareTextField = new JTextField(10);

	      
	      //carRental
	      messageLabel1 = new JLabel("Cost of " +
                  "car rental");
	      carRentalTextField = new JTextField(10);
	      
	      
	      //parking fee
	      
	      messageLabel2 = new JLabel("Cost of " +
                  "parking");
	      parkingFeeTextField = new JTextField(10);
	      
	      
	      //seminar
	      
	      
	      messageLabel3 = new JLabel("Cost of " +
                  "seminar registration fees");
	      seminarTextField = new JTextField(10);
	      
	      
	      //lodging
	      
	      messageLabel4 = new JLabel("Cost of " +
                  "lodging charge");
	      lodgingTextField = new JTextField(10);
	      
	      
	      
	      // taxi
	      
	      messageLabel5 = new JLabel("Cost of " +
                  "taxi service");
	      taxiTextField = new JTextField(10);
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      
	      // stop changes
	      
	      // Create a button with the caption "Calculate".
	      calcButton = new JButton("Calculate");

	      // Add an action listener to the button.
	      calcButton.addActionListener(new CalcButtonListener());

	      // Create a JPanel object and let the panel
	      // field reference it.
	      panel = new JPanel();

	      // Add the label, text field, and button
	      // components to the panel. needs changes
	      panel.add(messageLabel);
	      panel.add(airfareTextField);
	      
	      //Car
	      panel.add(messageLabel1);
	      panel.add(carRentalTextField);
	      
	      // parking fee
	      
	      panel.add(messageLabel2);
	      panel.add(parkingFeeTextField);
	      
	      //seminar
	      
	      panel.add(messageLabel3);
	      panel.add(seminarTextField);
	      
	      
	      //lodging
	      
	      panel.add(messageLabel4);
	      panel.add(lodgingTextField);
	      
	      //taxi
	      
	      panel.add(messageLabel5);
	      panel.add(taxiTextField);
	      
	      
	      
	      
	      panel.add(calcButton);
	      
	      //change stop
	   }

	   /**
	      CalcButtonListener is an action listener class for
	      the Calculate button.
	   */

	   private class CalcButtonListener implements ActionListener
	   {
	      /**
	         The actionPerformed method executes when the user
	         clicks on the Calculate button.
	         @param e The event object.
	      */

	      public void actionPerformed(ActionEvent e)
	      {
	         
	         
	         String inputAir;  // To hold the user's input
	         String inputCarRental;
	         String inputParking;
	         String inputSeminar;
	         String inputLodging;
	         String inputTaxi;
	         
	         double totalExpense;
	         
	         
	         
	         
	         
	         double miles;  // The number of miles

	         // Get the text entered by the user into the
	         // text field.
	         
	         
	         inputAir = airfareTextField.getText();
	         
	         // For debugging, display the text entered, and
	         // its value converted to a double.
	         //System.out.println("Reading " + input +
	                           // " from the text field.");
	         
	         Double.parseDouble(inputAir);
	         
	         //car
	         inputCarRental = carRentalTextField.getText();
	         
	         Double.parseDouble(inputCarRental);
	         
	         // parking 
	         
	         inputParking = parkingFeeTextField.getText();
	         
	         Double.parseDouble(inputParking);
	         
	         // seminar
	         
	         inputSeminar = seminarTextField.getText ();
	         
	         Double.parseDouble(inputSeminar);
	         
	         //lodging
	         
	         inputLodging= lodgingTextField.getText ();
	         
	         Double.parseDouble(inputLodging);
	         
	         //taxi
	         
	         
	         inputTaxi= taxiTextField.getText ();
	         
	         Double.parseDouble(inputTaxi);
	         
	         
	         // total expense
	         
	         totalExpense = Double.parseDouble(inputAir) + 
	        		 Double.parseDouble(inputCarRental) +
	        		  Double.parseDouble(inputParking)+
	        		  Double.parseDouble(inputSeminar)+
	        		   Double.parseDouble(inputLodging)+
	        		   Double.parseDouble(inputTaxi);
	         
	         
	        		   
	         double totalReembursed;
	         
	         double meal = 37;
	         double parking = 10;
	         double taxiService = 20;
	         double lodging = 95;
	         
	         totalReembursed = meal + parking + taxiService + lodging;
	         
	         
	        double totalCostOrExcee = totalExpense - totalReembursed; 
	        
	        if (totalCostOrExcee > 0)
	        	JOptionPane.showMessageDialog (null, " Total "
				+ "expenses incurred by the "
				+ "business person is $ " + totalExpense
				+ " where the total"
				+ " allowable expenses for the "
				+ "trip is $ " + totalReembursed + 
				 ". So The "
					+ "excess that must be paid by "
					+ "the business person" 
					+ totalCostOrExcee );
	        
	        
	         
	        else if (totalCostOrExcee <= 0)
	        	
	        	JOptionPane.showMessageDialog (null, " Total "
	    				+ "expenses incurred by the "
	    				+ "business person is $ " + totalExpense
	    				+ " where the total"
	    				+ " allowable expenses for the "
	    				+ "trip is $ " + totalReembursed + 
	    				 ". So the " + "amount saved by the business is $"
					+ Math.abs(totalCostOrExcee) );

	        

	         

	         // For debugging, display a message indicating
	         // the application is ready for more input.
	         System.out.println("Ready for the next input.");
	      }
	   } // End of CalcButtonListener class

	   /**
	      The main method creates an instance of the
	      KiloConverter class, which displays
	      its window on the screen.
	   */
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		new GuiAssigenment();
	}

	

}
