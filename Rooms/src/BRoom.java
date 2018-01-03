import java.util.Scanner;

public class BRoom extends Room 
{
	public BRoom(int xp, int yp) 
	{
		super(xp, yp);
		// TODO Auto-generated constructor stub
	}
	@Override

	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		System.out.println("You have entered sa");
		//Scanner in = new Scanner(System.in);
			
		/*//while(in.nextLine().equals("yes"))
		{
			//if()
			{
				
			}
			//else if()
			{
				returnBegin(x);
			}
		}*/
	}
	
	
	
	public void returnBegin(Person x) 
	{
		occupant = x;
		x.setxLoc(0);
		x.setyLoc(0);
		System.out.println("poof~");
		
	}
}
