
public class CollegeApps extends Room

{

	public CollegeApps(int get, int rekt) 
	{
		super(get, rekt);
		// TODO Auto-generated constructor stub
	}

	public void enterRoom(Person x) 
	{
		// TODO Auto-generated method stub
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		x.deder(x);
		System.out.println("You can never escape this room. YOU DIED");
		returnBegin(x);
		
	}
	


	public void returnBegin(Person x) 
	{
		occupant = x;
		x.setxLoc(0);
		x.setyLoc(0);
		System.out.println("poof~");
		
	}
}
