import java.util.Random;


public class DiceValue {
	
	private int sides;
	
	public DiceValue() {
			
		sides = 3;
			
	}
	

  public DiceValue( int sides) {
		
			this.sides = sides;
		
		
	}
  
  
  public int roll ()
  {
	  
	  int rolling = 0;
	  
	  Random value = new Random ();
	  rolling = Math.abs (value.nextInt()%sides + 1) ;
	  return rolling;
	  
  }
}
