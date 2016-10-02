


import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class DiceRoll {
	
	private String []ImageName;
	private String strNumber;
	private ImageIcon [] DiceImage;
	private Random randomNumber;
	private final int ARRAY_SIZE=2;
	private final int LEFT_IMAGE=0;
	private final int RIGHT_IMAGE=1;
	
	
	
	public DiceRoll()
	{
	randomNumber=new Random();
	DiceImage=new ImageIcon[ARRAY_SIZE];
	ImageName=new String[ARRAY_SIZE];
	setRandomDice();
	
	
	}

	public void setRandomDice()
	
	{
		strNumber=Integer.toString(randomNumber.nextInt(6)+1);	
		ImageName[LEFT_IMAGE]="Dice/Die"+strNumber+".png";		
		strNumber=Integer.toString(randomNumber.nextInt(6)+1);
		ImageName[RIGHT_IMAGE]="Dice/Die"+strNumber+".png";	
		
		DiceImage[LEFT_IMAGE]=new ImageIcon(ImageName[LEFT_IMAGE]);
		DiceImage[RIGHT_IMAGE]=new ImageIcon(ImageName[RIGHT_IMAGE]);
	}
	
	
	public ImageIcon[] getDiceImage()
	{
		return DiceImage;
	}
	
	

}
