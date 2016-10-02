import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Encrytion {

	public static void main(String[] args) throws IOException{
		int rotationNumber , length, choice, count =0;
		char wrong;
		String str;
		
		
		str = JOptionPane.showInputDialog ((" Enter a prime number between 5 and 255")+ 
				("\n for the intended encryption or decryption. "));
				rotationNumber= Integer.parseInt(str);
				
				if (rotationNumber < 5 || rotationNumber > 255)
				{
					do {
						
						str = JOptionPane.showInputDialog (("You entered a invalid number. So ")+("\nenter a prime number between 5 and 255")+ 
								("\n for the intended encryption or decryption. "));
								rotationNumber= Integer.parseInt(str);
						
					} while (rotationNumber < 5 || rotationNumber > 255);
					
					str = JOptionPane.showInputDialog (("Are you going to perform encryption or decryption?")
							+ ("if encryption, type 1 or for decryption")+ ("type any other number."));
				
					choice= Integer.parseInt(str);
					
					if (choice == 1)
						
					{
						//encryption
						// Create a Scanner object for keyboard input.
					      Scanner keyboard = new Scanner(System.in);

					      // Get the filename.
					      System.out.print("Enter the filename: ");
					      String filename = keyboard.nextLine();

					      // Open the file.
					      File file = new File(filename);
					      Scanner inputFile = new Scanner(file);

					      // Read lines from the file until no more are left.
					      while (inputFile.hasNext())
					      {
					         // Read the next name.
					         String friendName = inputFile.nextLine();
					         
					         length = (int) filename.length ();
					         
					         System.out.println(length);

					         // Display the last name read.
					        // System.out.println(friendName);
					         
					      }

					      // Close the file.
					      inputFile.close();
						
						
						
					}
					
					if ( choice != 1)
					{
						// decryption
						JOptionPane.showMessageDialog  (null, "this is not impotant");
					}
					
				
				}
				
				else if (rotationNumber >= 5 && rotationNumber <= 255)
					
				{
					str = JOptionPane.showInputDialog (("Are you going to perform encryption or decryption?")
							+ ("if encryption, type 1 or for decryption")+ ("type any other number."));
				
					choice= Integer.parseInt(str);
					
					if (choice == 1)
						
					{
						//encryption
						// Create a Scanner object for keyboard input.
					      Scanner keyboard = new Scanner(System.in);

					      // Get the filename.
					      System.out.print("Enter the filename: ");
					      String filename = keyboard.nextLine();

					      // Open the file.
					      File file = new File(filename);
					      Scanner inputFile = new Scanner(file);

					      // Read lines from the file until no more are left.
					      while (inputFile.hasNext())
					      {
					         // Read the next name.
					         String friendName = inputFile.nextLine();

					         // Display the last name read.
					         System.out.println(friendName);
					      }

					      // Close the file.
					      inputFile.close();
						
						
						
					}
					
					if ( choice != 2)
					{
						// decryption
						
					}
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				}
				

	}

}
