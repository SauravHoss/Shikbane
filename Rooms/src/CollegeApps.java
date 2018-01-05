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
		"Hyperion would like to remind you there is only thing worse than respawning, and that is not respawning.",
		"Between you and me, that thing that killed you is a total ****. Please disregard this message if you committed suicide.",
		"Anyone can live. Have to the courage to die!",
		"So, how are things?",
		"Git gud.",
		"A monster split you in twain.",
		"A witch decapatated you.",
		"You had a heartattack. Shouldn't have had that other burger.",	
		"Enjoy, death!",
		"Aww. Again?",
		"Hyperion wishes to remind you that by using the respawn station, you have forfeited your right to reproduce.",
		"I'm sure it wasn't your fault.",
	};
	
	
}
