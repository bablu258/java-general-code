
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class CeasOutputStream {
	
	
	
	private String FileInputStream;
	public String result = "";
	 char [] abc = {'a','b','c','d','e','f','g','h','i',
			'j','k','l','m','n','o','p','q','r','s','t',
			'u','v','w','x','y','x' };
	 char []specialChar = {' ', '.', '!', '?','-'};
	
	
	public CeasOutputStream (String userInput)
	{
		 
		FileInputStream = userInput; 
		
	}
	public String read () throws FileNotFoundException 
	{
		//open the file
		File file = new File(FileInputStream);
		Scanner inputFile = new Scanner(file); 
		
		//read the file
		String str = inputFile.nextLine(); 
		char []userFile = str.toCharArray();
		String output = "";
		
		//for (int x = 0;  x !=userFile.length; x++ )
		
		for (int x = 0;  x < userFile.length; x++ )
		{
			if (Character.isUpperCase(userFile[x]))
				output +=Character.toUpperCase(calOffset (getIndex  (userFile[x]) )  ) ;
			else
				output += calOffset (getIndex  (userFile[x]));
		}
		
		
	      //close file
		inputFile.close(); 
		return output;

	    
	}
	
	public  int getIndex(char letter)
	{
	if ( (isSpecialchar(letter)) != 999 )   
		{
			return (isSpecialchar(letter)) + 50;
		}
	if (Character.isUpperCase(letter))
		{
		letter = Character.toLowerCase(letter);
		}
		 
		for (int x = 0; x != abc.length; x++ ) 
		{
			if  ((abc[x]) == letter )
				return x;
			
		}
		
		return 999;
	}
	
	int isSpecialchar(char checkme)
	{
		for (int i =0; i < specialChar.length; i++) //int i =0; i!=specialChar.length; i++
		{
			if (specialChar[i]==checkme)
				return i;
		}
			
		return 999;
	}
	
	public char calOffset (int index)
	{
		
		if (index >= 50 && index < 900)
		{
			
			return specialChar[index-50];
		}
		
		if  ((index - 13) < 0 )
		{
			int newIndex = 26 + (index - 13) ;
			return abc [newIndex];
		}
		
		if  ((index - 13) == 25 )
		{
			int newIndex =  25 + (index - 13)  ;
			return abc [newIndex];
		}
		
		if  ((index - 13) > 25 )
		{
			int newIndex = (index - 13) + 26 ;
			return abc [newIndex];
		}
		
		
		if  ((index - 13) < 25 && (index - 13) > 0  )
		{
			return abc [index - 13];
		}
		
		
		
		if  ((index - 13) == 0 )
		{
			
			return abc [index - 13];
		}
		
		return 'X';
	}

}
