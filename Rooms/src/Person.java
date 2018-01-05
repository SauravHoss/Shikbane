import java.util.Random;

public class Person 
{
	String firstName;
	String familyName;
	int xLoc, yLoc;
	int lives = 3;
	
	public int getxLoc() 
	{
		return xLoc;
	}

	public void setxLoc(int xLoc) 
	{
		this.xLoc = xLoc;
	}

	public int getyLoc() 
	{
		return yLoc;
	}

	public void setyLoc(int yLoc) 
	{
		this.yLoc = yLoc;
	}

	public Person (String firstName, String familyName, int xLoc, int yLoc)
	{
		this.firstName = firstName;
		this.familyName = familyName;
		this.xLoc = xLoc;
		this.yLoc = yLoc;
	}
	
	//Basically kills the person by limiting lives (or "loves")  
	public void deder(Person x) 
	{
		if (lives !=0)
		{
		lives--;
		System.out.println("\nYOU DIED.\n");
		}
		else 
		{
			System.out.println(getRando() + "\n");
			Runner.gameOff();
		}
	}

	private String getRando () 
	{
		Random r = new Random ();
		return randomdedmsgs[r.nextInt(randomdedmsgs.length)];
	}
	
	private String [] randomdedmsgs = 
	{
		"It's all over kiddo.",
		"Ya, you ain't got no more lives.",
		"Your out of mulligans boy.",
		"You clearly suck at video games.",
		"Dead af dude."
	};
	
	
	public void print() 
	{
		
	}
}
