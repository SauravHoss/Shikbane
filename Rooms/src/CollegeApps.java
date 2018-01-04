
public class CollegeApps extends Room

{
//Room that kills player and teleports them back to spawn. There are many like it but this is mine.
	public CollegeApps(int get, int rekt) 
	{
		super(get, rekt);
	}

	public void enterRoom(Person x) 
	{
		occupant = x;
		x.setxLoc(this.xLoc);
		x.setyLoc(this.yLoc);
		x.deder(x);
		System.out.println("You can never escape this room. YOU DIED");
	}
	
	
}
