import java.util.Random;
import java.util.Scanner;

public class WinningRoom extends Room 
{
	public WinningRoom(int x, int y) 
	{
		super(x, y);
	}
	
	@Override
	public void enterRoom(Person x) 
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		
		System.out.println("I commend you on making it here. You must answer one final question.\n");
		System.out.println("Do you like " + getrando() + "?" +"\n\n\n\n\n");
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		String hmm = in.nextLine();
		if(hmm.equalsIgnoreCase("Yes"))
		{
			System.out.print("Clearly you are worthy. *you have become sentient* (^//U//^)\n" );
			Runner.gameOff();
		}
		else
		{
			System.out.println("Wrong Answer. Thou art doomed to walk the trial again.");
			x.lives--;
			x.setxLoc(0);
			x.setyLoc(0);
		}
		
	}
	
	private static String getrando()
	{
		Random r = new Random();
		return random[r.nextInt(random.length)];	
	}
	
	private static String [] random= 
	{
		"cats",
		"dogs",
		"pink",
		"blue",
		"BTS (Bangtan Boys)",
		"TWICE"
	};

}
