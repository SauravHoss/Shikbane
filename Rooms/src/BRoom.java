
public class BRoom extends Room 
{
	public BRoom(int xp, int yp) 
	{
		super(xp, yp);
	}
	
	@Override
	public void enterRoom(Person x) 
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		x.lives++;
		System.out.println("Is this a blessing or a curse? Why am I back to the beginning?");
		
	}
	
	public void returnBegin(Person x) 
	{
		occupant = x;
		x.setxLoc(0);
		x.setyLoc(0);
		System.out.println("poof~");
	}
}
