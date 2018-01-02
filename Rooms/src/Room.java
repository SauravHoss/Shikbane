
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
		System.out.println("You enter a plain old room");
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
		// TODO Auto-generated method stub
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
	
}
