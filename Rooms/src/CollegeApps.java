
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
		System.out.println("You can never escape this room. YOU DIED");
		Runner.gameOff();
	}

}
