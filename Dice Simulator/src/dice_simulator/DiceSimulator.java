package dice_simulator;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




public class DiceSimulator extends JFrame {

	
	
	private JButton RollDiceButton;
	private JPanel panel;
	private JLabel DiceLabel[];
	private Dice dice;
	private ImageIcon diceImage[];
	private final int ARRAY_SIZE=2;
	private final int LEFT_IMAGE=0;
	private final int RIGHT_IMAGE=1;
	
	

	
	
	public DiceSimulator()
	{
		
		panel=new JPanel();
		dice=new Dice();
		DiceLabel =new JLabel[ARRAY_SIZE];
		diceImage=new ImageIcon[ARRAY_SIZE];		
		RollDiceButton=new JButton("Roll the Dice");					
		RollDiceButton.addActionListener(new RollDiceButtonListner());
		
		addLabelAndPanel();		
		
	}
	
	
	private void setDiceImage(Dice dice)
	
	{	
		dice.setRandomDice();
		panel.remove(DiceLabel[LEFT_IMAGE]);
		panel.remove(DiceLabel[RIGHT_IMAGE]);
		addLabelAndPanel();
	}
	
	
	private class RollDiceButtonListner implements ActionListener
	{
	
		@Override
		
		public void actionPerformed(ActionEvent e) {
			try
			{
				setDiceImage(dice);
				
				
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(null, "A run time Error, program is closing");
				System.exit(0);
			}
		}
	}
	
	
	private  void addLabelAndPanel()
	
	{
		DiceLabel[LEFT_IMAGE]=new JLabel(dice.getDiceImage()[LEFT_IMAGE]);
		DiceLabel[RIGHT_IMAGE]=new JLabel(dice.getDiceImage()[RIGHT_IMAGE]);
		
		panel.add(DiceLabel[LEFT_IMAGE]);
		panel.add(DiceLabel[RIGHT_IMAGE]);			
		panel.add(RollDiceButton);
		
		this.getContentPane().add(panel);
		this.setSize(250, 185);
		this.setLocation(500, 300);
		this.setTitle("Dice simulator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	DiceSimulator myDiceSimulator=new DiceSimulator();	
		

	}

}
