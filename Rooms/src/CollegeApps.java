import java.util.Random;

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
		System.out.println(getRando());
	}
	
	private String getRando () 
	{
		Random r = new Random ();
		return randomdedmsgs[r.nextInt(randomdedmsgs.length)];
	}
	
	private String [] randomdedmsgs = 
		{
				"A monster split you in twain.",
				"A witch sent you back to spawn, by decapatating you",
				"You had a heartattack. Shouldn't have had that other burger"	
		};
	
	
}
