import java.io.FileNotFoundException;
import java.util.Scanner;


public class CaesarProject {

	public static void main(String[] args)  {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("If you want to write to an encrypted"
				+ " file, press 1 or 2 for reading "
				+ "from an encrypted file");
		int choice = keyboard.nextInt();
		keyboard.nextLine();
		
		if (choice == 1)
		{
			CeasOutputStream read = new CeasOutputStream ("write.txt");
			
			try {
				System.out.print(read.read ());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			
			CeasarInputStream read = new CeasarInputStream ("read.txt");
			
			try {
				System.out.print(read.read ());
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

	}

}
