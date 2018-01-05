import java.util.Random;

public class Room 
{
	Person occupant;
	int xLoc,yLoc;
	boolean explored = false;
	
	public Room(int x, int y)
	{
		xLoc = x;
		yLoc = y;
	}
	
	public void enterRoom(Person x)
	{
		System.out.println(getrando() + "\n");
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
	}
	
	public void leaveRoom(Person x)
	{
		occupant = null;
	}
	public void print() 
	{
		if(!explored && occupant==null)
		{
			System.out.print("[ ]");
		}
		else if(occupant!=null)
		{
			System.out.print("[x");
			occupant.print();
			System.out.print("]");
		}
	}
	
	private String getrando ()
	{
		Random r = new Random();
		return randomroomerz[r.nextInt(randomroomerz.length)];	
	}
	
	private String [] randomroomerz= 
	{
		"Another empty room.",
		"Ain't much in here, gotta keep moving.",
		"*runs across in fear* N-nothing in here",
		"*has an existential crisis, nothing even happened*",
		"I should keep going.",
		"Can something kill me already this is getting boring.",
		"No monsters? *YAWN*"
	};	
}