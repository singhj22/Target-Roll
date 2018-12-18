import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Jugat Singh
 *Target Roll
 */
public class targetRoll 
{

	public static void main(String[] args) 
	{
		Scanner user= new Scanner(System.in);
		
		Random rand= new Random();
		int dice = rand.nextInt(6)+1;
		int count= 0;
		
		System.out.println("Pick a target number from 1 to 6: ");
		int guess= user.nextInt();
		user.nextLine();
		
		while (guess<1 || guess>6)
		{
			System.out.println("Invalid input. Please try again: ");
			guess= user.nextInt();
			user.nextLine();

		}
		while (guess!=dice)
		{
			count+=1;
			System.out.println("The number rolled was "+dice+". Press enter to roll again: ");
			user.nextLine();
			dice = rand.nextInt(6)+1;
		}
		System.out.println("You guessed correctly. It took you "+ count+" rolls.");
	}

}
