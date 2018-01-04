
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
		System.out.println("Is it a blessing or a curse?");
		
	}
	
	public void returnBegin(Person x) 
	{
		occupant = x;
		x.setxLoc(0);
		x.setyLoc(0);
		System.out.println("poof~");
	}
}
